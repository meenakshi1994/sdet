package TestRunner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)
@CucumberOptions(
  
   features= "src/main/java/feature",
   glue = {"stepdefinition","util"},
   plugin = {"pretty","junit:target/reports/jreport.xml"}
			
  )						
public class TestRunner 				
{		

}