//package StepsDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Searchsteps {
//
//	WebDriver driver= null; 
//	
//	@Given("browers is open")
//	public void browers_is_open() {
//	   System.out.println("Inside step browser is open");
//	   String projectPath=System.getProperty("user.dir");
//	   System.out.println("Project path is : "+ projectPath);
//	   System.getProperty("webdriver.chrome.driver" ,projectPath+ "/src/test/resources/drivers/chromedriver.exe");
//	   driver = new ChromeDriver();
//	   driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//	   //driver.manage().window().maximize();
//	}
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside steps user enter on search page ");
//		driver.navigate().to("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		
//		
//	}
//	@When("user is on google search box")
//	public void user_is_on_google_search_box() throws InterruptedException {
//		System.out.println("Inside steps user enter text box");
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		Thread.sleep(2000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside step user is on google page");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is naviagate to search results")
//	public void user_is_naviagate_to_search_results() {
//		System.out.println("Inside step user is navigated on search results");
//		driver.getPageSource().contains("Online Course");
//		driver.close();
//		driver.quit();
//		
//	}
//}
