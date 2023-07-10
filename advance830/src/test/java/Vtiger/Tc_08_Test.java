package Vtiger;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlibraries.baseClass;

public class Tc_08_Test extends baseClass {
	@Test
	public void DeleteLeads() throws IOException, InterruptedException
	{
	   Home.getLeadsTab().click();
		Leads.getLeadsIcon().click();
		WebElement firstnameDD = Leads.getFirstNameDD();
		ut.selectReference(firstnameDD).selectByValue("Mr.");
		Leads.getFirstName().sendKeys(utility.readDataFromFile("FirstName"));
		Leads.getLastName().sendKeys(utility.readDataFromFile("LastName"));
		Leads.getCompanyName().sendKeys(utility.readDataFromFile("ComName"));
		Leads.getSaveButton().click();
		Thread.sleep(3000);
		Leads.getDuplicateButton().click();
		Thread.sleep(3000);
		Leads.getSaveButton().click();
		Thread.sleep(3000);
		
		Leads.getDeleteButton().click();
		ut.switchToAlert().accept();
		Thread.sleep(3000);
		
		
	}

}
