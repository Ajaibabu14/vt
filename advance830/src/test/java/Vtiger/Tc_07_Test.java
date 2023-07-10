package Vtiger;

import org.testng.annotations.Test;

import genericlibraries.baseClass;

public class Tc_07_Test  extends baseClass{
	
	
	
	@Test
	public void NewEvent() throws InterruptedException
	{
		ut.handlingDropDown(Home.getQuickCreateDropDown(), "New Event");
		QuickCreate.getSubjectTF().sendKeys("project");
		ut.handlingDropDown(QuickCreate.getStatusDD(), "Planned");
		
		QuickCreate.getStartDate().clear();
		ut.enteringDataIntoElement(QuickCreate.getStartDate(), "2023-06-27");
		Thread.sleep(3000);
		
		QuickCreate.getStartTime().clear();
		ut.enteringDataIntoElement(QuickCreate.getStartTime(), "15:58");
		Thread.sleep(3000);
		QuickCreate.getEndDate().clear();
		ut.enteringDataIntoElement(QuickCreate.getEndDate(), "2023-06-28");
		Thread.sleep(3000);
		ut.handlingDropDown(QuickCreate.getActivityType(), "Call");
		QuickCreate.getAssignToGroupRadioButton().click();
		Thread.sleep(3000);
		ut.handlingDropDown(QuickCreate.getAssignToGroupDD(), "Support Group");
		Thread.sleep(3000);
		QuickCreate.getSaveButton().click();
		
	}

}
