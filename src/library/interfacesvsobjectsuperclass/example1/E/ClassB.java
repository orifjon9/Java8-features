package library.interfacesvsobjectsuperclass.example1.E;

@SuppressWarnings("unchecked")
interface ClassB extends ClassA {

    default void method() {
        System.out.println("method of ClassB");
    }
}
