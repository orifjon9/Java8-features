package library.streamapi.example7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by orifjon9 on 3/17/2017.
 */

public class Main {
    public static FourFunction<List<Employee>, Integer, Boolean, Character, Stream<Employee>> COUNT_OF_EMPLOYEES =
            (list, salary, isBefore ,aChar) ->
            list.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .filter(employee -> (isBefore ? (employee.getLastName().charAt(0)<= aChar): (employee.getLastName().charAt(0)>= aChar)));

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

        //print the number of Employees in list whose salary > 100000 and whose last name begins
        //with a letter that comes after the letter 'E'

        System.out.println(COUNT_OF_EMPLOYEES.apply(list, 100000, false, 'E').count());

        //print a list of sorted full names - all upper case -- of Employees with
        //salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'

        COUNT_OF_EMPLOYEES.apply(list, 85000, true, 'R')
        .map(employee -> employee.getFirstName() + " " + employee.getLastName().toUpperCase())
        .forEach(System.out::println);

    }
}