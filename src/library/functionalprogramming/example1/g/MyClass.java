package library.functionalprogramming.example1.g;

import java.util.function.Predicate;

/**
 * Created by orifjon9 on 3/15/2017.
 */
public class MyClass {
    private String name ;
    private int key;

    public MyClass(String aName, int aKey){
        this.name = aName;
        this.key = aKey;
    }

    public void Action(MyClass myClass){
        Predicate<MyClass> predicate = p -> this.equals(p);
        Predicate<MyClass> predicate2 = this::equals;

        System.out.println("Compare two object: "+ this + " and " + myClass);
        System.out.println("Both equals : " + predicate2.test(myClass));
    }

    @Override
    public String toString(){
        return "(" + this.getName() + " , " + this.getKey() + ")";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof MyClass)) return false;

        MyClass myclass = (MyClass)obj;
        if(this.getName().equals(myclass.getName())){
            if(this.getKey() == myclass.getKey()){
                return true;
            }
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public int getKey() {
        return key;
    }
}
