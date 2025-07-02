package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfactory {
	static WebDriver driver;
    ////Chrome
public WebDriver initBrowser(String Browsername) 
{
////Chrome
if(Browsername.equals("Chrome")) 
{
driver=new ChromeDriver();
}	    
else if(Browsername.equals("Firefox")) 
{
driver=new FirefoxDriver();
}

return driver;

}


public static WebDriver getdriver() 
{
return driver;
}

}
