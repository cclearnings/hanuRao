package main.java.com.project.tests;


import org.junit.Assert;
import org.testng.annotations.Test;


public class TestAddition {

    @Test(groups="suite2")
    public void subtraction()
    {
        Assert.assertEquals(2, 2-1);
    }

}
