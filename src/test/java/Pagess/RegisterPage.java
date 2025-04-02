package Pagess;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
public class RegisterPage {
	
	public WebDriver driver;
	
	@FindBy(id = "name") WebElement Nam;
	@FindBy(id = "mobile") WebElement Mob;
	@FindBy(id = "email") WebElement Email;
	@FindBy(id = "password") WebElement Pass;
	@FindBy(xpath = "//*[@id=\"form\"]/div[5]/div/button") WebElement Signn;
	//@FindBy(xpath = "//button[contains(text(), 'OK')]") WebElement aler;
	@FindBy(xpath = "/html/body/div/div[2]/a") WebElement already;
@FindBy(xpath  ="/html/body/div/div[2]/a") WebElement cc;
	public RegisterPage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ccl() {
		cc.click();
	}
	
	public void enternamee(String uname) {
		Nam.sendKeys(uname);
	}
	public void enterPhoneno(String numm) {
		Mob.sendKeys(numm);	
	}
	public void emaill(String maill) {
		Email.sendKeys(maill);
	}
	public void Password(String passs) {
		Pass.sendKeys(passs);
	}
	public void Signin() {
		
		Signn.click();
	}
public void aleartt() {
		
	try {
        // Switch to alert and accept it
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Clicks "OK" button
        System.out.println("Alert accepted successfully.");
    } catch (NoAlertPresentException e) {
        System.out.println("No alert found.");
    }}
public void alre() {
	
	already.click();
	
	}
	
}
