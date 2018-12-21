package Do_Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(Do_Listeners.Listener_example.class)

@Listeners(Do_Listeners.Listners_example.class)

public class Listener_Demo1 {
	//test
	WebDriver driver;
	
	@Test
	
	public void Test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep.mandhala\\Downloads\\All Jar files selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
	}
   @AfterTest
   
   public void tearDown(){
	   driver.quit();
	   
   }
}