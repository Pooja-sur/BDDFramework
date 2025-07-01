package StepdefinitionQA;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.Homepage;
import QADriverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_stepdef {
	
	Homepage hp = new Homepage(DriverFactory.getdriver());
	@Given("the user is at Homepage")
	public void the_user_is_at_homepage() {
	WebDriver driver=DriverFactory.getdriver();
	
	driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}

	@Then("page title should contain {string}")
	public void page_title_should_contain(String Expectedtitle) {
String actitle=	hp.verifytitle();
Assert.assertEquals(actitle, Expectedtitle);
	}

	@Then("Shopping cart icon should displayed")
	public void shopping_cart_icon_should_displayed() {
	    
	boolean iconshop=hp.verifyshopingcarticon();
	Assert.assertTrue(iconshop);
	}

	@When("user clicks on iphone")
	public void user_clicks_on_iphone() {
	    hp.clickiphone();
	}

	@Then("user should able to see brand name {string}")
	public void user_should_able_to_see_brand_name(String expectedbrand) {
	String actualbrandname  = hp.brandname();
	Assert.assertEquals(actualbrandname, expectedbrand);
	}

	@When("user click on My accout dropndown")
	public void user_click_on_my_accout_dropndown() {
	    
		hp.clickonmyaccoutoption();
	}

	@When("user click on login option")
	public void user_click_on_login_option() {
	    
		hp.clickonloginoption();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String EM, String pwd) {
	    
		hp.Enteremail(EM);
		hp.Enterpassword(pwd);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    
		hp.Clickloginbtn();
	}

	@Then("user should redirected to {string} page")
	public void user_should_redirected_to_page(String Expectedname) {
	    
	String actualname=	hp.verifymyaccout();
	Assert.assertEquals(actualname,Expectedname);
	}




}
