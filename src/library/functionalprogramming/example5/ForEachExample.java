package library.functionalprogramming.example5;

import java.util.Arrays;
import java.util.List;

/**
 * Created by orifjon9 on 3/15/2017.
 */
public class ForEachExample {
    public ForEachExample() {
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"Hello there", "Goodbye", "Back soon", "Away", "On Vacation", "Everywhere you want to be"});
        list.forEach(name -> System.out.println(ForEachExample.toUpperCase(name)));

        System.out.println("-------------");

        list.forEach(ForEachExample::printToUpperCase);
    }

    public static String toUpperCase(String st){
        return st.toUpperCase();
    }

    public static void printToUpperCase(String st){
         System.out.println(st.toUpperCase());
    }

}

