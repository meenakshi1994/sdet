package IBM.SDET4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MeenakshiVenkatachal\\Downloads\\chromedriver.exe");
			String baseUrl = "http://elearningm1.upskills.in/";
			WebDriver driver = new ChromeDriver(); 
	        driver.get(baseUrl);	    
	       
	}

}
