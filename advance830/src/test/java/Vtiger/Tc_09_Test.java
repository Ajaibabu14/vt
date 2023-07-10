package Vtiger;

import org.testng.annotations.Test;

import genericlibraries.baseClass;

public class Tc_09_Test extends baseClass {
	@Test(enabled=false)
	public void DelMulData() throws InterruptedException
	{
		Home.getLeadsTab().click();
		Del.getDelete1().click();
		Thread.sleep(2000);
		Del.getDelete2().click();
		Thread.sleep(2000);
		Del.getDelete3().click();
		Thread.sleep(2000);
		Leads.getDeleteButton().click();
		ut.switchToAlert().accept();
		Thread.sleep(4000);
		
	}

}
