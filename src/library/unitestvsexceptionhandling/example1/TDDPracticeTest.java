package library.unitestvsexceptionhandling.example1;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by orifjon9 on 3/18/2017.
 */
public class TDDPracticeTest {

    @Test
    public void runTestArray(){
        List<String> list = new TDDPractice().changeLastCharToUpper(Arrays.asList("Tom","Ani","Donald"));
        List<String> list2 = Arrays.asList("ToM","AnI","DonalD");
        List<String> list3 = Arrays.asList("ToM","Ani","DonalD");

        //Assertions.assertEquals(list, list2);
        Assert.assertEquals(list, list3);
    }
}