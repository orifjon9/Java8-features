package library.functionalprogramming.example1.j;

import java.util.function.Supplier;

/**
 * Created by orifjon9 on 4/13/2017.
 */
public class Inner{
    Inner(){}

    class MySupplier implements Supplier<Double> {
        MySupplier(){}

        @Override
        public Double get() {
            return MyMath.random();
        }
    }
}