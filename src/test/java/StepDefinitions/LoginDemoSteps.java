package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
	   
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	    
		driver.get("https://example.testproject.io/web/");
	}

	@When("user enters valid usename and password")
	public void user_enters_valid_usename_and_password() throws InterruptedException {
	   
		driver.findElement(By.id("name")).sendKeys("Suraj");;
		driver.findElement(By.id("password")).sendKeys("12345");;
		
		Thread.sleep(2000);
		
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
	    
		driver.findElement(By.id("login")).click();;
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	    
		driver.findElement(By.id("logout")).isDisplayed();
		
		Thread.sleep(2000);
		
		driver.close();
	}

	
	
	

}
