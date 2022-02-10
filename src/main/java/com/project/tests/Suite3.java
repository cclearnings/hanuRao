package main.java.com.project.tests;


import org.junit.Assert;
import org.testng.annotations.Test;

public class Suite3 {

    @Test(groups="suite3")
    public void division()
    {
        Assert.assertEquals(2, 22/2);
    }

}
