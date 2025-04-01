package RunAll;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Pagess.LoginPagee;


public class BaseClass {
	
	WebDriver driver;
	LoginPagee lp;
	
    @BeforeMethod
 	void Setup() {
		
	
	 driver= new ChromeDriver();
	 driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
   	lp = new LoginPagee(driver);
	 
	}
    
    
    @AfterMethod
	void end() {
	//	driver.quit();
	}
	
	
}
