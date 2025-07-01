package RunnerQafox;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features= {"C:\\Javaprogramworkspace\\BDDCUCUMBERFRAMEWORK\\src\\test\\resources\\AppTest"},
		
		glue= {"StepdefinitionQA" ,"Hooks"},
		
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
		//tags ="@sanity"
		
		)



public class Ruunerhomepage extends AbstractTestNGCucumberTests {

	
}
