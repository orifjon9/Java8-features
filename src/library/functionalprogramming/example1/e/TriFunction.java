package library.functionalprogramming.example1.e;

/**
 * Created by orifjon9 on 4/13/2017.
 */
@FunctionalInterface
interface TriFunction<X,Y,Z,R>{
    R calculate(X x, Y y, Z z);
}
