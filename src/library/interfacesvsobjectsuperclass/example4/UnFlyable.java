package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public interface UnFlyable extends FlyBehavior {

    default public void cannotFly(){
        System.out.println("\tcannot fly");
    }
}
