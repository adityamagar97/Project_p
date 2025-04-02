package Pagess;



import org.openqa.selenium.Alert;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageUser {
	
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"username\"]") WebElement usernamee;
	@FindBy(xpath = "//*[@id=\"mobile\"]" ) WebElement Mobile;
	@FindBy(xpath = "//*[@id=\"email\"]") WebElement Email;
	@FindBy(xpath = "//*[@id=\"course\"]") WebElement Course;
	@FindBy(xpath = "//*[@id=\"Male\"]") WebElement Male;
	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select") WebElement Dropdown;
	@FindBy(xpath = "//*[@id=\"password\"]") WebElement password;
	@FindBy(xpath = "//*[@id=\"submit\"]") WebElement Submit;
	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[3]/a") WebElement fs;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button") WebElement dd;
	
	public PageUser(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void sf() {
		fs.click();
	}
	public void dfe() {
		dd.click();
	}
	
	public void usernameEnter(String una) {
		usernamee.sendKeys(una);
	}
	public void enterPhoneno(String num) {
		Mobile.sendKeys(num);	
	}
	public void emailiD(String mail) {
		Email.sendKeys(mail);
	}
	public void Selcourse(String corl) {
		Course.sendKeys(corl);
	}
	public void Cmale() {
		
		Male.click();
	}
	
public void DState() {
	Select stateDropdown = new Select(Dropdown);
	stateDropdown.selectByVisibleText("Maharashtra");
	}
public void Passwo(String passw) {
	password.sendKeys(passw);
}

public void sube() {
	
	Submit.click();
}
public void aleart() {
	
	try {
        // Switch to alert and accept it
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Clicks "OK" button
        System.out.println("Alert accepted successfully.");
    } catch (NoAlertPresentException e) {
        System.out.println("No alert found.");
    }}

	
	
	

}
