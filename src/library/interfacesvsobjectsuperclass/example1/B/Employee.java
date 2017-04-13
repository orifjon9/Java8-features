package library.interfacesvsobjectsuperclass.example1.B;

@SuppressWarnings("unchecked")
public class Employee {
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
        return "(" + name + ", " + salary + ", " + hashCode() +")";
    }

    public boolean equals(Employee e) {
        return e.name.equals(name) && e.salary == salary;
    }

    /*My changes here */
    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o instanceof Employee){
            Employee emp = (Employee)o;
            return emp.name.equals(name) && emp.salary == salary;
        }
        return false;
    }
}