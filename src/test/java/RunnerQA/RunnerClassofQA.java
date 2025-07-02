package RunnerQA;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		//Path of feature file
features = {"C:\\Users\\Pooja\\eclipse-workspace\\MyBDDFramework\\src\\test\\resources\\AppTest"},	
		
		//Map/glue Test Steps with Methods of step definition class
glue = {"StepDefination", "Hooks"},  //Packagename of Step defination Class  and Hooks
	
	plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
	
	//publish=true
)
public class RunnerClassofQA extends AbstractTestNGCucumberTests {
	
	


}
