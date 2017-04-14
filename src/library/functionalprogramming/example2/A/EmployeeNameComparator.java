package library.functionalprogramming.example2.A;

import java.util.Comparator;

/**
 * Created by orifjon9 on 3/15/2017.
 */
public class EmployeeNameComparator implements Comparator<Employee> {
    public EmployeeNameComparator(){}


    @Override
    public int compare(Employee o1, Employee o2) {
        int compare = o1.name.compareTo(o2.name);

        if(compare == 0){
            compare = o1.salary < o2.salary ? -1 :((o1.salary == o2.salary) ? 0 : 1);
        }

        return compare;
    }
}
