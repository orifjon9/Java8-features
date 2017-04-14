package library.streamapi.example6.B;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by orifjon9 on 3/17/2017.
 */
public class LambdaLibrary {
    public static Function<List<Employee>, String> LIST_OF_EMPLOYEES = (list) ->
            list.stream()
            .filter(employee -> employee.getSalary() > 100000)
            .filter(employee -> (employee.getLastName().charAt(0) >= 'N' && employee.getLastName().charAt(0) <= 'Z'))
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .sorted()
            .collect(Collectors.joining(", "));

    public static BiFunction<List<Employee>, String, String> LIST_OF_EMPLOYEES_BY_SEPERATE = (list, coma) ->
            list.stream()
            .filter(employee -> employee.getSalary() > 100000)
            .filter(employee -> (employee.getLastName().charAt(0) >= 'N' && employee.getLastName().charAt(0) <= 'Z'))
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .sorted()
            .collect(Collectors.joining(coma));

    public static TriFunction<List<Employee>, Integer, String, String> LIST_OF_EMPLOYEES_BY_DIFFERENT_PARAM = (list, salary, coma) ->
            list.stream()
            .filter(employee -> employee.getSalary() > salary)
            .filter(employee -> (employee.getLastName().charAt(0) >= 'N' && employee.getLastName().charAt(0) <= 'Z'))
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .sorted()
            .collect(Collectors.joining(coma));
}
