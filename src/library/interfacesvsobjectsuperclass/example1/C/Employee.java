package library.interfacesvsobjectsuperclass.example1.C;


@SuppressWarnings("unchecked")
public class Employee{
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
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
    @Override
    public String toString() {
        return "(" + name + ", " + salary + ")";
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(!(ob instanceof Employee)) return false;
        Employee emp = (Employee)ob;
        return emp.name.equals(name) && emp.salary == salary;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result += ((result * 31) + this.name.hashCode());
        result += ((result * 31) + this.salary);

        return result;
    }

}