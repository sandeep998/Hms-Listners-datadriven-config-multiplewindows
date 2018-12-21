package HMS_PACKAGE;




import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;


public class Multiple_windows {

	
	public class HMS_Popup {
		WebDriver driver;
		
		
		public void openBrowser(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep.mandhala\\Downloads\\All Jar files selenium\\chromedriver.exe");

			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		public void openURL(){
			driver.get("http://selenium4testing.com/hms/");
	}
		public void login(){
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("submit")).click();
		}
		public void popup() throws Exception{
			String mainHandle = driver.getWindowHandle();
			
			driver.findElement(By.linkText("Feedback")).click();
		
			waitForNewWindowAndSwitchToIt(driver);
			System.out.println(driver.getTitle());
			driver.findElement(By.id("name")).sendKeys("Testing");
			driver.findElement(By.id("email")).sendKeys("nag@gmail.com");
			new Select(driver.findElement(By.id("car"))).selectByVisibleText("Mercedes");

			closeAllOtherWindows(driver,mainHandle);
			Thread.sleep(2000);
			driver.findElement(By.linkText("ADT")).click();
			driver.close();
			
			
		}

		/*public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			HMS_Popup h=new HMS_Popup(); //Object or Instance
			h.openBrowser();
			h.openURL();
			h.login();
			h.popup();  

		}*/
		@Test
		public void test() throws Exception {
			openBrowser();
			openURL();
			login();
			popup();
			
			
			
		}

		 public void waitForNewWindowAndSwitchToIt(WebDriver driver) throws InterruptedException {
		        String cHandle = driver.getWindowHandle();

		        Set<String> allWindowHandles = driver.getWindowHandles();
		        String newWindowHandle = null;
		        //Wait for 20 seconds for the new window and throw exception if not found
		        for (int i = 0; i < 20; i++) {
		            if (allWindowHandles.size() > 1) {
		                for (String allHandlers : allWindowHandles) {
		                    if (!allHandlers.equals(cHandle))
		                    	newWindowHandle = allHandlers;
		                }
		                
		         
		                driver.switchTo().window(newWindowHandle);
		                break;
		            } else {
		                Thread.sleep(1000);
		            }
		        }
		        if (cHandle == newWindowHandle) {
		            throw new RuntimeException(
		                     "Time out - No window found");
		        }
		    }
		 
		 
		 public boolean closeAllOtherWindows(WebDriver driver, String openWindowHandle) {
				Set<String> allWindowHandles = driver.getWindowHandles();
				for (String currentWindowHandle : allWindowHandles) {
					if (!currentWindowHandle.equals(openWindowHandle)) {
						driver.switchTo().window(currentWindowHandle);
						driver.close();
					}
				}
				
				driver.switchTo().window(openWindowHandle);
				if (driver.getWindowHandles().size() == 1)
					return true;
				else
					return false;
			}
		
	}
	 }


