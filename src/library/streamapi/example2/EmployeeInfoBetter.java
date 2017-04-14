package library.streamapi.example2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by orifjon9 on 3/16/2017.
 */

public class EmployeeInfoBetter {
    static enum SortMethod {
        BYNAME,
        BYSALARY
    };

    static HashMap<SortMethod, comperatorClass> map = new HashMap<>();
    static  HashMap<SortMethod, Pair> mapFunction = new HashMap<>();

    static {
        Comparator<Employee> name = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Comparator<Employee> salary = (e1, e2) -> ((e1.getSalary() == e2.getSalary()) ? 0 : ((e1.getSalary() < e2.getSalary()) ? -1 : 1));

        map.put(SortMethod.BYNAME, new comperatorClass(name, salary));
        map.put(SortMethod.BYSALARY, new comperatorClass(salary, name));

        Function<Employee, String> byName = e->e.getName();
        Function<Employee, Integer> bySalary = e->e.getSalary();

        mapFunction.put(SortMethod.BYNAME, new Pair(byName, bySalary));
        mapFunction.put(SortMethod.BYSALARY, new Pair(bySalary, byName));
    }

    public void sort(List<Employee> emps, final SortMethod method) {
        Collections.sort(emps, map.get(method).first
                .thenComparing(map.get(method).second));
    }

    public List<Employee> sortFunction(List<Employee> emps, final SortMethod method) {
        return (List<Employee>)emps.stream()
                .map(e->e)
                .sorted(Comparator.comparing(mapFunction.get(method).first)
                 .thenComparing(mapFunction.get(method).second))
                  .collect(Collectors.toList());
    }



    public static void main(String[] args) {

        Comparator<Employee> name = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Comparator<Employee> salary = (e1, e2) -> ((e1.getSalary() == e2.getSalary()) ? 0 : ((e1.getSalary() < e2.getSalary()) ? -1 : 1));


        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 10000000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Rick", 50000));
        emps.add(new Employee("Andy", 60000));
        emps.add(new Employee("Tim", 10000));
        EmployeeInfoBetter ei = new EmployeeInfoBetter();

        ei.sort(emps, SortMethod.BYNAME);
        System.out.println(emps);

        System.out.println("------------------");

        ei.sortFunction(emps, SortMethod.BYSALARY)
                .forEach(System.out::println);

    }


}
