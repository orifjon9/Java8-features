package library.functionalprogramming.example2.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by orifjon9 on 3/15/2017.
 */

public class EmployeeInfo {
    EmployeeInfo.SortMethod method;

    public EmployeeInfo(EmployeeInfo.SortMethod method) {
        this.method = method;
    }

    public void sort(List<Employee> emps) {
        if(this.method == EmployeeInfo.SortMethod.BYNAME) {
            Collections.sort(emps, new EmployeeNameComparator());
        } else if(this.method == EmployeeInfo.SortMethod.BYSALARY) {
            Collections.sort(emps, new EmployeeSalaryComparator());
        }

    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList();
        Employee joe = new Employee("Joe", 300000);
        Employee joe2 = new Employee("Joe", 200000);
        list.add(joe);
        list.add(joe2);


        System.out.println("joe equals joe2? " + joe.equals(joe2));

        EmployeeNameComparator c = new EmployeeNameComparator();
        System.out.println("joe equals joe2? " + (c.compare(joe, joe2) == 0));


        new EmployeeInfo(SortMethod.BYNAME).sort(list);

        list.forEach(System.out::println);

    }

    static enum SortMethod {
        BYNAME,
        BYSALARY;

        private SortMethod() {
        }
    }
}