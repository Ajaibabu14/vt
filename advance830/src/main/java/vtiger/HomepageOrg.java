package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageOrg {
	public HomepageOrg(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()='Organizations'][1]")
	private WebElement OrganisationsTab;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement ContactsTab;
	
	@FindBy(xpath = "//a[text()='Leads'][1]")
	private WebElement LeadsTab;
	
	@FindBy(xpath = "//select[@id='qccombo']")
	private WebElement QuickCreateDropDown;

	public WebElement getOrganisationsTab() {
		return OrganisationsTab;
	}

	public WebElement getContactsTab() {
		return ContactsTab;
	}

	public WebElement getLeadsTab() {
		return LeadsTab;
	}

	public WebElement getQuickCreateDropDown() {
		return QuickCreateDropDown;
	}
	
	
	
	

}
