package Pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchproductQA {
	
	WebDriver driver;
	@FindBy(xpath="//input[@name='search']") private WebElement search;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") private WebElement searchbtn;
	@FindBy(xpath="//a[text()='MacBook']") private WebElement macbook;
	@FindBy(xpath="//a[text()='MacBook Air']") private WebElement macbookair ;
	@FindBy(xpath="//a[text()='MacBook Pro']") private WebElement MacBookPro;
	
	
	public SearchproductQA(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void searchptoduct(String prod)
	{
		search.sendKeys(prod);
		
		
	}
	
	public void enterprod() {
		searchbtn.click();
	}
	
	public ArrayList<String> verifysearchedproduct()
	{
	String product1=macbook.getText();
	String product2=macbookair.getText();
	String product3=MacBookPro.getText();
ArrayList<String> al= new ArrayList<String>();
   al.add(product1);
   al.add(product2);
   al.add(product3);
   
	return al;

	}
	
	
}
