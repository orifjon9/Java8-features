package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public interface Quackable extends QuackBehavior {
    default public void quacking(){
        System.out.println("\tquacking");
    }
}
