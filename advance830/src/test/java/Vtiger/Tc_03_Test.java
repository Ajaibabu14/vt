package Vtiger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibraries.baseClass;
import genericlibraries.listenerImplimentation;
@Listeners(genericlibraries.listenerImplimentation.class)
public class Tc_03_Test extends baseClass {
	
	@Test
	public void Createcontact() throws InterruptedException, IOException
	{
		assertEquals(false, false);
		Home.getContactsTab().click();
		
		listenerImplimentation.logger.log(Status.INFO,"clicked on login page");
		
		Contact.getCreateContactIcon().click();
		listenerImplimentation.logger.log(Status.INFO,"clicked on contacticon ");
		WebElement firstnameDD = Contact.getFirstNameDD();
		
		ut.selectReference(firstnameDD).selectByValue("Mr.");
		
		Contact.getFirstNameTF().sendKeys(utility.readDataFromFile("FirstName"));
		listenerImplimentation.logger.log(Status.INFO,"entered first name");
		
		
		Contact.getLastNameTF().sendKeys(utility.readDataFromFile("LastName"));
		listenerImplimentation.logger.log(Status.INFO,"entered lastname");
		//assertEquals(false, true);
		Contact.getSaveButton().click();
		listenerImplimentation.logger.log(Status.INFO,"clicked on save button");
	
		Thread.sleep(3000);
		
	}

}
