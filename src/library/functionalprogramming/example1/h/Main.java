package library.functionalprogramming.example1.h;

import java.util.function.Consumer;

/**
 * Created by orifjon9 on 3/15/2017.
 */
public class Main {

    public static void main(String[] args) {

        Consumer<String> test1 = t -> System.out.println(t);
        Consumer<String> test2 = System.out::println; //StaticClass::instanceMethod

        test1.accept("Hello World!!!");
        test2.accept("Hello professor Tina.");
    }
}
