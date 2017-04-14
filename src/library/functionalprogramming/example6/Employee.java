package library.functionalprogramming.example6;

/**
 * Created by orifjon9 on 3/15/2017.
 */

public class Employee {
    private String name;
    private int salary;

    public Employee(){}
    public Employee(String n, int s) {
        this.setName(n);
        this.setSalary(s);
    }

    public Employee(Employee emp) {
        this.setName(emp.getName());
        this.setSalary(emp.getSalary());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(this.getName());
        sb.append(" salary: ");
        sb.append(this.getSalary() + ">");
        return sb.toString();
    }

    public boolean equals(Object ob) {
        if(ob == null) {
            return false;
        } else if(!(ob instanceof Employee)) {
            return false;
        } else {
            Employee e = (Employee)ob;
            return e.getName().equals(this.getName()) && e.getSalary() == this.getSalary();
        }
    }


    public boolean isNameSame(Employee emp){
        return  (this.getName().compareTo(emp.getName())) == 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}