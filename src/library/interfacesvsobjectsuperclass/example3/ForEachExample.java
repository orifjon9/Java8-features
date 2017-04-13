package library.interfacesvsobjectsuperclass.example3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public class ForEachExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format

        list.forEach(element->
            System.out.println(element.toUpperCase())
        );

        System.out.println("=============================");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        });

        System.out.println("=============================");

        list.forEach(new MyConsumer());

    }

    static class MyConsumer implements Consumer<String> {

        @Override
        public void accept(String s) {
            System.out.println(s.toLowerCase());
        }
    }


}