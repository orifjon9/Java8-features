package library.functionalprogramming.example2.A;

import java.util.Comparator;

/**
 * Created by orifjon9 on 3/15/2017.
 */
public class EmployeeSalaryComparator implements Comparator<Employee> {
    EmployeeSalaryComparator(){}

    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.salary == o2.salary ? 0 : ((o1.salary > o2.salary ? 1 : -1)));
    }
}
