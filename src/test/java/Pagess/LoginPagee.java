package Pagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagee {
	
	@FindBy (xpath ="//*[@id=\"email\"]" ) WebElement emailid;
	@FindBy (xpath ="//*[@id=\"password\"]" ) WebElement passwordent;
	@FindBy (xpath ="//*[@id=\"form\"]/div[3]/div/button" ) WebElement submitbtn;
	
	WebDriver driver ;
	
	public LoginPagee(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void login(String em,String ps , String condition) {
		emailid.sendKeys(em);
		passwordent.sendKeys(ps);
		submitbtn.click();
		
		
	}
//	
//public	void email(String em) {
//		emailid.sendKeys(em);
//	}
//public	void passw(String ps) {
//		passwordent.sendKeys(ps);
//	}
//public void cl() {
//		submitbtn.click();
//	}
public String wrval() {
	
	   return driver.getCurrentUrl();
		
	}
	
	
	

}
