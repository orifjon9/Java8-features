package library.functionalprogramming.example6;

import java.util.Comparator;
import java.util.function.*;

/**
 * Created by orifjon9 on 3/16/2017.
 */

public class Examples {
    Function<String, String> upper1 = (x) ->  x.toUpperCase();
    Function<String, String> upper2 = String::toUpperCase;

    Function<Employee, String> eToString1 = (e) -> e.getName();
    Function<Employee, String> eToString2 = Employee::getName;

    Consumer<Employee> consumer = Employee::new;

    Supplier<Employee> supplier = Employee::new;

    Predicate<Employee> predicate = x -> equals(x);

    BiPredicate<Employee, Employee> bipred = (x,y)-> x.isNameSame(y);

    Runnable run = ()->{
      System.out.println("This is last part of lab, thank you for attention. ");
    };


    BiConsumer<Employee, String> setName1 = (e, s) -> {
        e.setName(s);
    };
    BiConsumer<Employee, String> setName2 = Employee::setName;

    Comparator<String> strComp1 = (s1, s2) -> {
        return s1.compareTo(s2);
    };
    Comparator<String> strComp2 = String::compareTo;

    BiFunction<Integer, Integer, Integer> min1 = (x, y) -> {
        return Integer.valueOf(Math.min(x.intValue(), y.intValue()));
    };
    BiFunction<Integer, Integer, Integer> min2 = Math::min;

    Function<Apple, Double> appleWeight1 = (a) -> {
        return Double.valueOf(a.getWeight());
    };
    Function<Apple, Double> appleWeight2 = Examples.Apple::getWeight;

    Examples.NoArgNoReturn threadDump1 = () -> {
        Thread.dumpStack();
    };
    Examples.NoArgNoReturn threadDump2 = Thread::dumpStack;

    Function<String, Integer> parser1 = (x) -> {
        return Integer.valueOf(Integer.parseInt(x));
    };
    Function<String, Integer> parser2 = Integer::parseInt;

    EmployeeNameComparator comp = new EmployeeNameComparator();

    Comparator<Employee> empComp1 = (e1, e2) -> {
        return this.comp.compare(e1, e2);
    };
    Comparator<Employee> empComp2;

    public Examples() {
        this.empComp2 = this.comp::compare;
    }

    public void evaluator() {
        Employee testEmp = new Employee("John", 100000);
        Examples.Apple testApple = new Examples.Apple(4.5D);
        System.out.println((String)this.upper2.apply("hello"));
        System.out.println((String)this.eToString2.apply(testEmp));
        this.setName2.accept(testEmp, "Ralph");
        System.out.println(testEmp.getName());
        System.out.println(this.strComp2.compare("a", "b"));
        System.out.println(this.min2.apply(Integer.valueOf(5), Integer.valueOf(8)));
        System.out.println(this.appleWeight2.apply(testApple));
        System.out.println(this.parser2.apply("15"));
        System.out.println(this.empComp2.compare(testEmp, new Employee("John", 100000)));
    }

    public static void main(String[] args) {
        Examples e = new Examples();
        e.evaluator();
    }

    static class Apple {
        private double weight;

        Apple(double weight) {
            weight = 3.0D;
        }

        public double getWeight() {
            return this.weight;
        }
    }

    @FunctionalInterface
    public interface NoArgNoReturn {
        void act();
    }
}