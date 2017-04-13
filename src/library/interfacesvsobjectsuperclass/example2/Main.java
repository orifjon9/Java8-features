package library.interfacesvsobjectsuperclass.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by orifjon9 on 3/14/2017.
 */

public class Main {

    @SuppressWarnings({ "serial", "unused" })
    public static void main(String[] args) {

        List<Customer> list1 = new ArrayList<Customer>() {
            {
                add(new Customer("Joe", "xyz12"));
                add(new Customer("Dave", "uvw23"));
            }
        };

        List<Customer> list2 = new ArrayList<Customer>() {
            {
                add(new Customer("Sue", "abz12"));
                add(new Customer("Annie", "dew23"));
            }
        };

        login(list1);

        showLoggedIn();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            //do nothing
        }

        showLoggedIn();
    }

    private static void login(List<Customer> list) {
        List<String> storageList = new ArrayList<>();
        StaticStorage.getINSTANCE().add(StorageKey.LOGGED_IN.toString(), storageList);
        for(Customer c : list) {
            storageList.add(c.getName());
        }
    }
    @SuppressWarnings("unchecked")
    private static void showLoggedIn() {
        List<String> stored = (List<String>)StaticStorage.getINSTANCE().get(StorageKey.LOGGED_IN.toString());
        String output = "Customers who are logged in now:";
        System.out.println(output + "\n" + stored);
    }

}
