package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public interface UnQuackable extends QuackBehavior {
    default public void cannotQuacking(){
        System.out.println("\tcannot quacking");
    }
}
