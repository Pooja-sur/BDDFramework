package StepdefinitionQA;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.Homepage;
import Pages.SearchproductQA;
import QADriverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SerachprodctQa {
	
	Homepage hp = new Homepage(DriverFactory.getdriver());
	SearchproductQA sp = new SearchproductQA(DriverFactory.getdriver());
	@Given("the user is at the Homepage")
	public void the_user_is_at_the_homepage() {

	WebDriver driver =	DriverFactory.getdriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}

	@When("user searches {string}")
	public void user_searches(String mac) {
	   sp.searchptoduct(mac);
	  sp.enterprod();
	}

	@Then("user should be able to see {string}, {string} and {string}")
	public void user_should_be_able_to_see_and(String ExpectedProduct1, String ExpectedProduct2, String ExpectedProduct3) throws InterruptedException {
	   
	
		ArrayList<String> Products=sp.verifysearchedproduct();  //MacBook  ////MacBook Air  //MacBook Pro
		
        String  ActualProduct1=Products.get(0);  //MacBook
        String  ActualProduct2=Products.get(1);  //MacBook Air  
        String  ActualProduct3=Products.get(2);  //MacBook Pro
        
Assert.assertEquals(ActualProduct1, ExpectedProduct1);

Assert.assertEquals(ActualProduct2, ExpectedProduct2);       
 
Assert.assertEquals(ActualProduct3, ExpectedProduct3);
	
	}

}
