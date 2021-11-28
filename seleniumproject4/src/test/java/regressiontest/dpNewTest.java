package regressiontest;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.fbhome;

import org.testng.annotations.DataProvider;

public class dpNewTest extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String emailid, String passid) throws InterruptedException {
	  fbhome ob = new fbhome(driver);
	  ob.emailphone(emailid);
	  ob.password(passid);
	  ob.loginclick();
	  driver.navigate().back();      //to go back on the website
	  Thread.sleep(5000);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "cghs@yahoo.com", "123456789" },
      new Object[] { "ati@hotmail.com", "987654321" },
    };
  }
}
