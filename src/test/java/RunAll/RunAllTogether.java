package RunAll;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import Utilities.ExcelUtils;

public class RunAllTogether extends BaseClass{

	
	
	
//	@Test(priority = 3, enabled =true)
	void UserPagestarts()
	{
		up.sf();
		up.dfe();
		up.usernameEnter("Aditya Magar");
		up.enterPhoneno("7776836496");
		up.emailiD("adityamagar08@gmail.com");
		up.Selcourse("java");
		up.Cmale();
		up.DState();
		up.Passwo("Aditya$55");
		up.sube();
// up.aleart();
		
	}
	
//	@Test (priority = 1, enabled = true)
	void RegisterFisrst() throws InterruptedException {
		
		rrp.ccl();
		rrp.enternamee("Aditya Magar");
		rrp.enterPhoneno("7776836496");
		rrp.emaill("adityamagar07@gmail.com");
		rrp.Password("Adiitya@565");
		Thread.sleep(2000);
		rrp.Signin();
		Thread.sleep(2000);
		rrp.aleartt();
		Thread.sleep(2000);
		rrp.alre();
		
	}
	
	
	
	@Test (priority = 1, dataProvider = "loginData", dataProviderClass = ExcelUtils.class )  
	void LetsRun(String em,String ps , String condition) throws InterruptedException {
		
		
//		lp.email("Aditya");
//		lp.passw("aditya");
//		lp.cl();
		rrp.ccl();
		rrp.enternamee("Aditya Magar");
		rrp.enterPhoneno("7776836496");
		rrp.emaill("adityamagar07@gmail.com");
		rrp.Password("Adiitya@565");
		Thread.sleep(2000);
		rrp.Signin();
		Thread.sleep(2000);
		rrp.aleartt();
		Thread.sleep(2000);
		rrp.alre();
		lp.login(em,ps,condition);
		up.sf();
		up.dfe();
		up.usernameEnter("Aditya Magar");
		up.enterPhoneno("7776836496");
		up.emailiD("adityamagar08@gmail.com");
		up.Selcourse("java");
		up.Cmale();
		up.DState();
		up.Passwo("Aditya$55");
		up.sube();
     // up.aleart();
        
        if(condition.equals("Valid")) {
        	AssertJUnit.assertEquals(lp.wrval(),"file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
        }
        else if(condition.equals("invalid")) {
        	AssertJUnit.assertEquals(lp.wrval(),"file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
        }
        
        
        
	}
	

}
