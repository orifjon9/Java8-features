package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public class RedheadDuck extends Duck {
    @Override
    public void fly() {
        flyWithWings();
    }

    @Override
    public void quack() {
        quacking();
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck:\n\tdisplaying");
    }
}
