package Data_Driven_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Driven_manualyEnter_data {
	WebDriver driver;
	
 @Test(dataProvider="testdata")
 public void dataTest(String username,String password) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep.mandhala\\Downloads\\All Jar files selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://ec2-54-177-6-43.us-west-1.compute.amazonaws.com/");
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("password")).clear();
	
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			
			driver.findElement(By.xpath("/html/body/div/div/form/div[3]/button")).click();
			Thread.sleep(2000);
			
		
			String str =driver.getTitle();
			System.out.println(str);
			//Assert.assertEquals(str.contains("Site Admin - SuiteAmerica"), "not able");
			Assert.assertTrue(str.contains("Site Admin - SuiteAmerica"));
			System.out.println("page title verified user is able to login");
}

@AfterMethod

public void tearDown() {
	
	driver.quit();
}
	@DataProvider(name="testdata")
	 public Object[][] TestDataFeed()
	 {
		
		//for read excel
	/*	ExcelDataConfig config =new ExcelDataConfig("excel file path");
		
		
		int rows=config.getRowCount(0);
		
		Object[][] Exceldata = new Object[rows][2];
		
	 
	   for (int i = 0; i < rows; i++) {
		   
		   Exceldata[i][0]=config.getData(0, i, 0);
		   Exceldata[i][0]=config.getData(0, i, 1);
	}*/
		
		
		  Object[][] credentials = new Object[4][2];
	///credentials[0][0]="admin";
	//credentials[0][1]="demo";
	
	
	credentials[1][0]="admin@suiteamerica.com";
	credentials[1][1]="Dev@2017";
	
	credentials[2][0]="admin";
	credentials[2][1]="demo";
	
	credentials[3][0]="sandeep";
	credentials[3][1]="sandeep";
	 return credentials;

}
}