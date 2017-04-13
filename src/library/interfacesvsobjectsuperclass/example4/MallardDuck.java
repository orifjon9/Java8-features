package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public class MallardDuck extends Duck {

    @Override
    public void fly() {
        flyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck:\n\tdisplay");
    }

    @Override
    public void quack() {
        quacking();
    }
}
