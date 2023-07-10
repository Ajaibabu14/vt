package Vtiger;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlibraries.baseClass;

public class Tc_2_Test extends baseClass{
	
	@Test
	public void createOrgwithTypeAndIndustry() throws InterruptedException, IOException
	{
		Home.getOrganisationsTab().click();
		Orgpage.getCreateOrganisationButton().click();
		Orgpage.getNameTf().sendKeys(utility.readDataFromFile("Name"));
		WebElement industry = Orgpage.getIndustryDD();
		ut.selectReference(industry).selectByValue("Chemicals");
		WebElement type = Orgpage.getTypeDD();
		ut.selectReference(type).selectByValue("Customer");
		Orgpage.getSaveButton().click();
		
		Thread.sleep(4000);
		
		Orgpage.getSingout().click();
		System.out.println("test case passed");
		
		
	}

}
