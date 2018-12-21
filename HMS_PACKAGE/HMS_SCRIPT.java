package HMS_PACKAGE;

public class HMS_SCRIPT extends Base_Hms {
	
	HMS_LOCATORS locassign=new HMS_LOCATORS();
	
	
public void launchapp() {
	
	openbrowserNAME("chrome");
	openURL();
	
}

public void login() throws Exception {
	readDATA(HMS_LOCATORS.username_suite, "admin@suiteamerica.com");
	readDATA(HMS_LOCATORS.Password_suite,"Dev@2017" );
	click(HMS_LOCATORS.Submit_suite);
	click(HMS_LOCATORS.SERVICE);
	
	readDATA(HMS_LOCATORS.ORDER_ID, "159047");
	
	
}

public void otherFIELDS() {
	
	click(HMS_LOCATORS.INVOICE);
	//click(HMS_LOCATORS.delete);
	readDATA(HMS_LOCATORS.SERVICE_LASTNAME, "sandeepreddy");
	alerts();
	
	
}

}