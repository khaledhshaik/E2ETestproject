package end2endtesting.E2ETestproject;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

public class Homepage extends Base {
	
    @Test
	public void basePageNavigation() throws IOException
    {
    	driver=initializedriver();
    	driver.get("http://qaclickacademy.com");


        LandingPage l=new LandingPage(driver);
        l.getlogin().click();
        
        LoginPage lp=new LoginPage(driver);
        lp.getemail().sendKeys("khaledshaik");
        lp.getpassword().sendKeys("854796khel");
        lp.getlogin().click();
        driver.close();
      
}
}