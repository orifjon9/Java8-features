package library.unitestvsexceptionhandling.example5.soln1;

import library.unitestvsexceptionhandling.example5.Employee;
import library.unitestvsexceptionhandling.example5.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


/**
 * Created by orifjon9 on 3/19/2017.
 */
public class TestEmployeeResult {

    @Test
    public void runTestEmployeeResult(){

        Employee joe_Davies = new Employee("Joe", "Davis", 120000);
        Employee john_Sims = new Employee("John", "Sims", 110000);
        Employee joe_Stevens = new Employee("Joe", "Stevens", 200000);
        Employee andrew_Reardon = new Employee("Andrew", "Reardon", 80000);
        Employee joe_Cummings = new Employee("Joe", "Cummings", 760000);
        Employee steven_Walters = new Employee("Steven", "Walters", 135000);
        Employee thomas_Blake = new Employee("Thomas", "Blake", 111000);
        Employee alice_Richards = new Employee("Alice", "Richards", 101000);
        Employee donald_Trump = new Employee("Donald", "Trump", 100000);

        List<Employee> empsFirst = Arrays.asList(joe_Davies,john_Sims,joe_Stevens,andrew_Reardon,joe_Cummings,steven_Walters,
                thomas_Blake, alice_Richards,donald_Trump);

        List<Employee> empsSecond = Arrays.asList(joe_Davies,john_Sims,joe_Stevens,andrew_Reardon,joe_Cummings,steven_Walters,
                thomas_Blake, donald_Trump);

        Assert.assertEquals(Main.asString(empsFirst), Main.asString(empsSecond));
        Assert.assertEquals(Main.asString(empsFirst), Main.asString(empsFirst));
    }
}
