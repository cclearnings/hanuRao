package main.java.com.project.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Validations {

     @Test(groups="suite")
     public void addition()
     {
          Assert.assertEquals(2, 2+2);
     }

     @Test(groups="suite")
     public void logic ()
     {
          Assert.assertTrue(true);
     }
}
