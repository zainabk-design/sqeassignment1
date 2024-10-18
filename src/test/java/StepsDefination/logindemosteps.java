package StepsDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logindemosteps {
	
	WebDriver driver = null;
	
	@Given("browers is open")
	public void browers_is_open() {
		  System.out.println("Inside step browser is open");
		   String projectPath=System.getProperty("user.dir");
		   System.out.println("Project path is : "+ projectPath);
		   System.getProperty("webdriver.chrome.driver" ,projectPath+ "/src/test/resources/drivers/chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		
					   
		   
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://monark.com.pk/account/login");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("name")).sendKeys("haseeb");
		driver.findElement(By.id("password")).sendKeys("12345");
	  
	}
	
	@And("user clicks in login")
	public void user_clicks_in_login() {
	   
		driver.findElement(By.id("login")).click();
		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   
		((WebElement) driver.findElements(By.id("logout"))).isDisplayed();
		driver.close();
		driver.quit();
		
	}

}
