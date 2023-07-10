package Vtiger;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlibraries.baseClass;

public class Tc_04_Test extends baseClass{
	@Test
	public void createContactWithOrg() throws IOException
	{

	Home.getContactsTab().click();
	Contact.getCreateContactIcon().click();
    Contact.getLastNameTF().sendKeys(utility.readDataFromFile("LastName"));
   String parentId= driver.getWindowHandle();
    
    Contact.getOrgIcon().click();
    
    Set<String>allid=driver.getWindowHandles();
    for (String id : allid) {
    	driver.switchTo().window(id);
    }
    try {
    	Thread.sleep(3000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    Contact.getOrgnames().click();
    Contact.getSaveButton();
    
    driver.switchTo().window(parentId);
    Contact.getSaveButton().click();
    
		
	}
}
