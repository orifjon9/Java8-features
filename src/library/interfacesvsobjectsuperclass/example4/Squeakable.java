package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public interface Squeakable  extends QuackBehavior {

    default public void squeaking(){
        System.out.println("\tsqueaking");
    }
}
