package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public abstract class Duck implements Flyable, UnFlyable, Quackable, Squeakable, UnQuackable {
    abstract public void display();


    public void swim(){
        System.out.println("\tswimming");
    }
}
