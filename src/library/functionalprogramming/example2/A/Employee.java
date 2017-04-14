package library.functionalprogramming.example2.A;

/**
 * Created by orifjon9 on 3/15/2017.
 */

public class Employee {
    String name;
    int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(this.name);
        sb.append(" salary: ");
        sb.append(this.salary + ">");
        return sb.toString();
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) {
            return false;
        } else if(ob.getClass() != this.getClass()) {
            return false;
        } else {
            Employee e = (Employee)ob;
            return e.name.equals(this.name) && e.salary == this.salary;
        }
    }
}