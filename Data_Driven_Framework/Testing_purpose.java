package Data_Driven_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing_purpose {
	
	WebDriver driver;
	
	@Test
	 public void testing() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep.mandhala\\Downloads\\All Jar files selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	String url	=("http://ec2-54-177-6-43.us-west-1.compute.amazonaws.com/");
	    
		
		//String expectdresults=("User Login - Suite America");
		
		//String actualresults=("");	
	driver.get(url);

		  
    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@suiteamerica.com");
	

    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dev@2017");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	

	//if (pass) {
		
	}
		
	/*String title=	driver.getTitle();
	System.out.println("the title is "+title);
		
		
		if(title.equalsIgnoreCase("User Login - Suite America")) {
			
			System.out.println("test passed by sandeep");
		}
		
		else if (actualresults.equalsIgnoreCase("welcome to my world")) {
			
			System.out.println("test excuted");
			
		 else {
			
			System.out.println("test failed");

		}
	
		driver.close();
	}*/

}
