package QADriverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	static WebDriver driver;
	public WebDriver initbrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		
		else if(browserName.equals("chrome"))
		{
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	public static WebDriver getdriver()
	{
		return driver;
	}

}
