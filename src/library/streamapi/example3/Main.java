package library.streamapi.example3;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by orifjon9 on 3/17/2017.
 */
public class Main {

    static Function<Integer, Stream<Integer>> squares = num-> Stream.iterate(1, n->  (n + 1))
            .map(m->m*m)
            .limit(num);

    public static void main(String[] args) {
        printSquares(4);
        System.out.println("----------------");
        printSquares(8);
    }

    public static void printSquares(int number){
        squares.apply(number).forEach(System.out::println);
    }
}
