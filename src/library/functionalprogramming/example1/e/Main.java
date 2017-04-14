package library.functionalprogramming.example1.e;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by orifjon9 on 3/16/2017.
 */
public class Main {
    public static void main(String[] args){

        //i. f(x) = x + 2x2
        Function<Integer, Integer> function = (x) -> x + (2*x^2);
        System.out.println(function.apply(5));

        //ii. g(x,y) = y – x + xy
        BiFunction<Integer, Integer, Integer> g = (x,y) -> (y - x + (x*y));
        System.out.println(g.apply(5, 6));

        //iii. h(x,y,z) = z – (x + y)
        TriFunction<Integer, Integer, Integer, Integer> h = (x,y,z) -> (z - (x + y));
        System.out.println(h.calculate(5, 6, 7));
    }
}

