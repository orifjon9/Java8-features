package library.streamapi.example2;

import java.util.Comparator;

/**
 * Created by orifjon9 on 3/17/2017.
 */

class comperatorClass{
    public Comparator<Employee> first;
    public Comparator<Employee> second;

    public comperatorClass(Comparator<Employee> f, Comparator<Employee> s){
        this.first = f;
        this.second = s;
    }
}
