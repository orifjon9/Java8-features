package library.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public class Main {

    public static void main(String[] args){
        Duck[] ducks =  { new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck() };

        for (Duck duck: ducks){
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }
    }
}
