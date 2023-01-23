package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver;
	
//	@Given("browser open")
//	public void browser_open() {
//	   
//		System.out.println("Inside step- browser is open");
//		driver=new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//	    
//		System.out.println("Inside step- user is on google page");
//		driver.navigate().to("https://www.google.co.in/");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//	   
//		System.out.println("Inside step- user enters a text in search box");
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		Thread.sleep(2000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//	  
//		System.out.println("Inside step- hits enter");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//	    
//		System.out.println("Inside step- use r navigate to search results");
//		driver.getPageSource().contains("Online Courses");
//		
//		driver.close();
//		
//	}

}
