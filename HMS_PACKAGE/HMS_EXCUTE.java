package HMS_PACKAGE;

import org.testng.annotations.Test;

public class HMS_EXCUTE extends Base_Hms {
	 
	
	HMS_SCRIPT hm=new HMS_SCRIPT();
  @Test
  public void f() throws Exception {
	  hm.launchapp();
	  hm.login();
	  Thread.sleep(5000);
	 hm.otherFIELDS();
	  driver.close();
  }
}
