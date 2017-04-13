package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public class DecoyDuck extends Duck {
    @Override
    public void fly() {
        cannotFly();
    }

    @Override
    public void quack() {
        cannotQuacking();
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck:\n\tdisplaying");
    }
}
