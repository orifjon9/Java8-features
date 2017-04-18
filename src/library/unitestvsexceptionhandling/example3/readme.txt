there is a class FixThis in which a stream map is called which accesses another method that throws an Exception. The code will not compile as it is written. Use one of the Java 8 exception-handling strategies to get the code to compile and run
– create a new class FixThisSoln for this purpose. A (commented) main method is provided.
Expected output for the first call to processList is
[not, too, big, yet]
However, the second call should throw a RuntimeException