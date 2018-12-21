package HMS_PACKAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Hms {
	
	WebDriver driver=null;
	public void openbrowserNAME(String browsername) {
		if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep.mandhala\\Downloads\\All Jar files selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
	}
	public void openURL() {
		driver.get("http://ec2-54-177-6-43.us-west-1.compute.amazonaws.com");
		
	}
	public static WebElement visibilityOfElement(WebDriver driver,final By locator,int time) {
		
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public void click(By locator) {
		
		try {
			Thread.sleep(2000);
			driver.findElement(locator).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	
		public void readDATA(By locator,String data) {
			try {
				driver.findElement(locator).clear();
				driver.findElement(locator).sendKeys(data);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
		
			public void select(By locator,String da) {
				
				try {
					Select sa=new Select(driver.findElement(locator));
					sa.selectByVisibleText(da);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public  String getAlertMessageText()
			{
				String str1 = null;
				try{
					 str1 = driver.switchTo().alert().getText();
					return str1;
				}catch(Exception e){
					// readData.addStepDetails("Verify Popup message", "Popup message should be available", "Alert is not present", "FAIL","Y");
				}
				return str1;
			}
	
			public void dragAndDrop(By question, By target){
				WebElement e1=driver.findElement(question);
				WebElement e2=driver.findElement(target);
				Actions a=new Actions(driver);
				a.dragAndDrop(e1, e2).build().perform();
				
			}
			
			public void Mousehover(WebElement elem)
			{
				try
				{
					Actions action = new Actions(driver);
					action.moveToElement(elem).build().perform();
			
				
				}
				catch (RuntimeException localRuntimeException)
				{
					System.out.println("Error in Hover on element"+localRuntimeException.getMessage()+"Pass");
			
				}
			}
			public void alerts() {
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
				
			}
		
			
				
				
				
				
				
				

}