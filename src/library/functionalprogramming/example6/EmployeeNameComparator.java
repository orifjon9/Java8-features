package library.functionalprogramming.example6;

import java.util.Comparator;

/**
 * Created by orifjon9 on 3/15/2017.
 */
public class EmployeeNameComparator implements Comparator<Employee> {
    public EmployeeNameComparator() {
    }

    public int compare(Employee e1, Employee e2) {
        if (e1.getName().compareTo(e2.getName()) != 0) {
            return e1.getName().compareTo(e2.getName());
        }

        return (e1.getSalary() == e2.getSalary() ? 0 : (e1.getSalary() < e2.getSalary() ? -1 : 1));

    }
}
