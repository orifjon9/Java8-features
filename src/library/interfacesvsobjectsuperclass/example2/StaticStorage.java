package library.interfacesvsobjectsuperclass.example2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by orifjon9 on 3/14/2017.
 */

public class StaticStorage extends Cache{

    private static StaticStorage iNSTANCE = new StaticStorage();

    public static StaticStorage getINSTANCE(){
        return iNSTANCE;
    }

    StaticStorage(){}

    private HashMap<String, List<Pair>> data = new HashMap<>();

    public void add(String key, Object value) {
        List<Pair> list = null;
        if(!data.containsKey(key)) {
            list = new ArrayList<Pair>();
        } else {
            list = data.get(key);
        }
        Pair p = new Pair();
        p.dataVal = value;
        //point in future where this item will no longer be in cache
        p.time = LocalTime.now().plusSeconds(timeout());
        list.add(p);

        data.put(key, list);

    }

    public List<Pair> getList(String key) {
        return data.get(key);
    }

    public Object get(String key) {
        List<Pair> list = getList(key);
        if(list == null) {
            return null;
        } else { //obtain those values that have not timed out
            List<Object> retval =  new ArrayList<>();
            Iterator<Pair> it = list.iterator();
            while(it.hasNext()) {
                Pair p = it.next();
                LocalTime time = p.time;
                LocalTime now = LocalTime.now();
                //if time has not expired, return value
                if(!(now.isAfter(time))) {
                    retval.add(p.dataVal);
                } else {
                    it.remove();
                }
            }
            return retval;
        }
    }

    public String toString() {
        return data.toString();
    }


    private class Pair {
        Object dataVal;
        LocalTime time;
    }

}