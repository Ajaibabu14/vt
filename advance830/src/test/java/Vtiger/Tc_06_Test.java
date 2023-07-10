package Vtiger;

import org.testng.annotations.Test;

import genericlibraries.baseClass;

public class Tc_06_Test extends baseClass {
	
	@Test
 public void deletelead() throws InterruptedException
 {
		Home.getLeadsTab().click();
		Leads.getCheckbox().click();
		Thread.sleep(3000);
		Leads.getDeleteButton().click();
		Thread.sleep(3000);
		ut.switchToAlert().accept();
		Thread.sleep(3000);
 }

}
