package RunAll;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Pagess.LoginPagee;
import Pagess.PageUser;
import Pagess.RegisterPage;


public class BaseClass {
	
	WebDriver driver;
	LoginPagee lp;
	RegisterPage rrp;
	PageUser up;
	
    @BeforeMethod
 	void Setup() {
		
	
	 driver= new ChromeDriver();
	 driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
   	lp = new LoginPagee(driver);
    rrp = new RegisterPage(driver);
    up = new PageUser(driver);
	 
	}
    
    
    @AfterMethod
	void end() {
	//	driver.quit();
	}
	
	
}
