package library.functionalprogramming.example1.j;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by orifjon9 on 3/15/2017.
 */
public class Main {

    public static void main(String[] args) {

        double t = Math.random();

        Supplier<Double> funcRandom = () -> Math.random();
        Supplier<Double> funcRandom2 = Math::random;

        Supplier<Double> funcRandom3 = MyMath::random;


        int index = 0;
        while (true){
            if(index++ == 10) break;

            //System.out.println(funcRandom.get());
            //System.out.println(funcRandom2.get());
            System.out.println(funcRandom3.get());
        }

        System.out.println("===================");

        Inner.MySupplier supplier = new Inner().new MySupplier();
        System.out.println(supplier.get());

    }


}


