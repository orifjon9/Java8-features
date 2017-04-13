package library.interfacesvsobjectsuperclass.example2;

/**
 * Created by orifjon9 on 3/14/2017.
 */

public class Customer {
    private String name;
    private String password;
    public Customer(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}