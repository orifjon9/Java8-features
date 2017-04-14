package library.streamapi.example6.A;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        //your stream pipeline here
        String result = list.stream()
                .filter(employee -> employee.getSalary() > 100000)
                .filter(employee -> (employee.lastName.charAt(0) >= 'N' && employee.lastName.charAt(0) <= 'Z'))
                .map(employee -> employee.firstName + " " + employee.lastName)
                .sorted()
                //.sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
