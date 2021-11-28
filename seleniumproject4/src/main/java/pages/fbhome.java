package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class fbhome {

public static WebDriver driver;
	
	@FindBy (id= "email") WebElement emailfield;
	@FindBy (id= "pass") WebElement passwordfield;
	@FindBy (xpath="//*[@name='login']") WebElement login;
	
	public fbhome(WebDriver driver) {
		fbhome.driver=driver;
		   PageFactory.initElements(driver, this);
		  }
	
	
	public void emailphone(String emailtxt) {
		emailfield.clear();
		emailfield.sendKeys(emailtxt);
	}
	
	public void password(String passtxt) {
		passwordfield.sendKeys(passtxt);
	}
	public void loginclick() {
		  login.click();
	}
	
	public void findfblinks() {
		 List<WebElement>  listoflinks =driver.findElements(By.tagName("a"));
		 System.out.println("Total links are= " + listoflinks.size());
		 
		 for (int i=0;i<listoflinks.size();i++) {
		  System.out.println(listoflinks.get(i).getAttribute("href")); //href is where the links are store
		 } 
		 }
}
