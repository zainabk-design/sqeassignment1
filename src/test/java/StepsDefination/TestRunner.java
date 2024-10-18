package StepsDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features" , glue= {"StepsDefination"} , 
monochrome = true, 
plugin= {"pretty" , "json:traget/JSONReports.json",
		"junit:traget/JUnitReprts/report.xml","io.qameta.allure.cucumber5jvm.AllureCucumber5jvm"
		}
		)
public class TestRunner {

}
