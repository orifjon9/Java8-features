package library.streamapi.example6.B;

import java.util.Arrays;
import java.util.List;

/**
 * Created by orifjon9 on 3/17/2017.
 */

public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        System.out.println(LambdaLibrary.LIST_OF_EMPLOYEES.apply(list));
        System.out.println("--------------------");

        System.out.println(LambdaLibrary.LIST_OF_EMPLOYEES_BY_SEPERATE.apply(list, "; "));
        System.out.println("--------------------");

        System.out.println(LambdaLibrary.LIST_OF_EMPLOYEES_BY_DIFFERENT_PARAM.apply(list, 110000, ", "));

    }

}