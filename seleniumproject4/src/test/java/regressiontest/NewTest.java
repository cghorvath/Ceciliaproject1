package regressiontest;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.fbhome;
import java.io.IOException;



public class NewTest extends baseclass{
  
	@Test
  public void f() throws IOException {
		fbhome ob = new fbhome(driver);
	//	ob.emailphone("abc@yahoo.com");
	//	ob.password("123456789");
		ob.findfblinks();
  }
  

}
