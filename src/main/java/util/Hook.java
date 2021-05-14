package util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	public static WebDriver driver;

	@Before
	public void initdriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MeenakshiVenkatachal\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@After
	public void exitdriver()
	{
		driver.quit();
		System.out.println("Execution Successful");

	}

}
