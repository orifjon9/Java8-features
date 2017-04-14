This exercise asks you to work with potentially infinite streams of prime numbers.

A. To begin, create a final variable Stream<BigInteger> primes that contains all prime numbers (in particular, the Stream is infinite).

B. Next, create a variation of the primes Stream that can be called multiple times by a method printFirstNPrimes(long n), which prints to the console the first n prime numbers. Note that the Stream primes that you created in part A cannot be used a second time; how can you get around that limitation? Prove that you succeeded by calling the method printFirstNPrimes(long n) (from a main method) more than once.
If you succeed, you should be able to run the following code without getting a runtime exception:

public static void main(String[] args) {
    PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
    ps.printFirstNPrimes(10);
    System.out.println("====");
    ps.printFirstNPrimes(5);
}