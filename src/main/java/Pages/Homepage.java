package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Shopping Cart']") private WebElement Shoppingcart;
	@FindBy(xpath="//a[text()='iPhone']") private WebElement Iphone;
	@FindBy(xpath="//a[text()='Apple']") private WebElement Brandname;
	@FindBy(xpath="//span[text()='My Account']") private WebElement myaccoutopt;
	@FindBy(xpath="//a[text()='Login']") private WebElement login;
	@FindBy(xpath="//input[@name='email']") private WebElement email;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//input[@class='btn btn-primary']") private WebElement loginbtn;
	@FindBy(xpath="//h2") private WebElement myaccout;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public String verifytitle()
	{
	String Actualtitle=	driver.getTitle();
	return Actualtitle;
	}
	public boolean verifyshopingcarticon()
	{
	boolean actualicon=	Shoppingcart.isDisplayed();
	return actualicon;
	}
	
	public void clickiphone()
	{
		Iphone.click();
	}
	
	public String brandname()
	{
	String actualbrand=	Brandname.getText();
	return actualbrand;
	}
	
	public void clickonmyaccoutoption()
	{
		myaccoutopt.click();
	}
	
	public void clickonloginoption()
	{
		login.click();
	}
    public void Enteremail(String emailadd)
    {
    	email.sendKeys(emailadd);
    }
    
    public void Enterpassword(String pass) 
    {
    	password.sendKeys(pass);
    }
    public void Clickloginbtn()
    {
    	loginbtn.click();
    }
    
    public String verifymyaccout()
    {
  String actualresult= myaccout.getText();
  return actualresult;
    }
}
