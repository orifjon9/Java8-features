package library.unitestvsexceptionhandling.example5.soln2;

import library.unitestvsexceptionhandling.example5.Employee;
import library.unitestvsexceptionhandling.example5.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by orifjon9 on 3/19/2017.
 */
public class TestCheckEmployeeOptions {

    @Test
    public void runTestCheckEmployeeSalaryGreaterThan10000(){
        Employee john_Sims = new Employee("John", "Sims", 110000);
        Employee joe_Stevens = new Employee("Joe", "Stevens", 200000);
        Employee andrew_Reardon = new Employee("Andrew", "Reardon", 80000);

        Assert.assertEquals(Main.salaryGreaterThan100000(john_Sims), Main.salaryGreaterThan100000(andrew_Reardon));

        //Assert.assertEquals(Main.salaryGreaterThan100000(john_Sims), Main.salaryGreaterThan100000(joe_Stevens));
    }

    @Test
    public void runTestLastAfterM(){
        Employee andrew_Reardon = new Employee("Andrew", "Reardon", 80000);
        Employee steven_Walters = new Employee("Steven", "Walters", 135000);
        Employee thomas_Blake = new Employee("Thomas", "Blake", 111000);

        Assert.assertEquals(Main.lastNameAfterM(andrew_Reardon), Main.lastNameAfterM(steven_Walters));

        //Assert.assertEquals(Main.lastNameAfterM(andrew_Reardon), Main.lastNameAfterM(thomas_Blake));
    }
}
