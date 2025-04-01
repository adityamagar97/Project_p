package RunAll;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import Utilities.ExcelUtils;

public class RunAllTogether extends BaseClass{
	
	@Test ( dataProvider = "loginData", dataProviderClass = ExcelUtils.class)
	void LetsRun(String em,String ps , String condition) {
		
		
//		lp.email("Aditya");
//		lp.passw("aditya");
//		lp.cl();
		
		lp.login(em,ps,condition);
        
        
        if(condition.equals("Valid")) {
        	AssertJUnit.assertEquals(lp.wrval(),"file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
        }
        else if(condition.equals("invalid")) {
        	AssertJUnit.assertEquals(lp.wrval(),"file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
        }
        
        
        
	}
	

}
