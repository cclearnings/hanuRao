package main.java.com.project.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Suite4 {

    @Test(groups="suite4")
    public void multiply()
    {
        Assert.assertEquals(2, 2*4);
    }

}
