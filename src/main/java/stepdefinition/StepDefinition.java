package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import util.Hook;;

public class StepDefinition {
	
	WebDriver driver = Hook.driver;
	
	@Given("^I want to navigate to Elearning site$")
	public void i_want_to_navigate_to_Elearning_site() throws Throwable {
		
		
		String baseUrl = "http://elearningm1.upskills.in/";
		
		driver.get(baseUrl);	 
		driver.findElement(By.linkText("Sign up!")).click();
	    
	}
	@Given("^I enter the \"([^\"]*)\" , \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" details for Signup$")
	public void i_enter_the_and_details_for_Signup(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		Thread.sleep(5000);
	    driver.findElement(By.id("registration_firstname")).sendKeys(arg1);
	    driver.findElement(By.id("registration_lastname")).sendKeys(arg2);
	    driver.findElement(By.id("registration_email")).sendKeys(arg4);
	    driver.findElement(By.id("username")).sendKeys(arg3);
	    driver.findElement(By.id("pass1")).sendKeys(arg5);
	    driver.findElement(By.id("pass2")).sendKeys(arg5);
	    
	}

	@Then("^Register$")
	public void register() throws Throwable {
	    
	    driver.findElement(By.id("registration_submit")).click();
	    Thread.sleep(5000);	            
	  
	}

	@Then("^Compose Email$")
	public void compose_Email() throws Throwable {
		driver.findElement(By.xpath("//*[@class='img-circle']")).click();
		driver.findElement(By.xpath("//*[contains(@title,'Inbox')]")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Compose message')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("test");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='select2-compose_message_users-results']/li[1]")).click();
		
	
		driver.findElement(By.id("compose_message_title")).sendKeys("Test");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Test");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("compose_message_compose")).click();
		
		
	}



}
