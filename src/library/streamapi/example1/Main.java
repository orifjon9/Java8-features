package library.streamapi.example1;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by orifjon9 on 3/17/2017.
 */
public class Main {

    private final static Stream<BigInteger> primes =
            Stream.iterate(BigInteger.ONE.add(BigInteger.ONE), n->n.nextProbablePrime());

   Function<Long, Stream<BigInteger>> primes_second = (limit) ->
           Stream.iterate(BigInteger.ONE.add(BigInteger.ONE), n->n.nextProbablePrime())
           .limit(limit);


    class PrimeStream{
        public PrimeStream(){}

        public void printFirstNPrimes(long limit){

            primes_second.apply(limit)
                    .forEach(System.out::println);
        }
    }
    public static void main(String[] args){

        /*list of all primes*/
        //primes.collect(Collectors.toList());

        PrimeStream primeStream = new Main().new PrimeStream();
        primeStream.printFirstNPrimes(5);

        System.out.println("==========================");
        primeStream.printFirstNPrimes(10);

    }
}
