package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	public WebDriver initializedriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Eclipse Project Practise\\E2ETestproject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			//execute in chrome driver
			System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			//execute in firefox driver
			System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			//execute in IE driver
			System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   return driver;
	}	
}
