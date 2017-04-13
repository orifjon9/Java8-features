package library.interfacesvsobjectsuperclass.example1.E;


@SuppressWarnings("unchecked")
public class ClassD implements  ClassB, ClassC {

    @Override
    public void method(){
        ClassB.super.method();
    }

    public static void main(String[] args){
        ClassD d = new ClassD();
        d.method();
    }

}
