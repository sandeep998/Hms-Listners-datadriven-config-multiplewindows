package HMS_PACKAGE;

import org.openqa.selenium.By;

public class HMS_LOCATORS {
	
   public static final By username_suite = By.xpath("//input[@id=\"Email\"]");

	
	public static final By Password_suite = By.xpath("//input[@id=\"password\"]");
	public static final By Submit_suite = By.xpath("//button[@type=\"submit\"]");
	public static final By SERVICE = By.xpath("//*[@id='wrapper']/div[3]/div/div[1]/div/div/div/div/ul/li[10]/a/div");
	public static final By ORDER_ID = By.id("OrderTId");
	public static final By INVOICE = By.xpath("//*[@id='wrapper']/div[3]/div/div[1]/div/div/div/div/ul/li[9]/a/div");
	//public static final By Clients = By.id("//*[@id='wrapper']/div[3]/div/div[1]/div/div/div/div/ul/li[2]/a/div");
	public static final By delete = By.id("//*[@id=\"addResultsGrid\"]/div[2]/div[1]/table/tbody/tr[1]/td[11]/a[2]");
	public static final By SERVICE_LASTNAME = By.id("LastName");
	
}
