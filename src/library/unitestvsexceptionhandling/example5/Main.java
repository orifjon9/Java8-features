package library.unitestvsexceptionhandling.example5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	private static Function<List<Employee>, String> EMPLOYEE_LIST = (list) ->
			list.stream()
					//.filter(e -> (e.getSalary() > 100000))
					.filter(e -> salaryGreaterThan100000(e))
					//.filter(e -> (e.getLastName().charAt(0) > 'M'))
					.filter(e -> lastNameAfterM(e))
					.map(e -> fullName(e))
					.sorted()
					.collect(Collectors.joining(", "));

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));
		/*
		  System.out.println(emps
				    .filter(e -> (e.getSalary() > 100000))
				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
				    .map(e -> fullName(e))
				    .sorted()
				    .collect(Collectors.joining(", ")));
				       */

		printEmps(emps);

	}

	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

	public static String asString(List<Employee> employeeList) {
		return EMPLOYEE_LIST.apply(employeeList);
	}

	public static void printEmps(List<Employee> employeeList) {
		System.out.println(asString(employeeList));
	}

	public static boolean salaryGreaterThan100000(Employee e) {
		return e.getSalary() > 100000;
	}

	public static boolean lastNameAfterM(Employee e) {
		return e.getLastName().charAt(0) > 'M';
	}

}
