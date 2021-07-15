package utils;

import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class ListsUtilsTest {
    private ListUtils utils = new ListUtils();

    @Test
    public void simpleTest()
    {

        List<Integer> l = Arrays.asList(1,2,3,4);
        Assert.assertEquals(utils.sum(l),10);
    }

}
