package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactIcon;
	
	@FindBy(name="salutationtype")
	private WebElement FirstNameDD;
	
	@FindBy(name = "firstname")
	private WebElement FirstNameTF;
	
	@FindBy(name = "lastname")
	private WebElement LastNameTF;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//img[@alt=\"Select\"][1]")
	private WebElement orgIcon;
	
	@FindBy(xpath = "//a[text()='Organization Name ']")
	private WebElement orgnames;

	public WebElement getOrgnames() {
		return orgnames;
	}

	public void setOrgnames(WebElement orgnames) {
		this.orgnames = orgnames;
	}

	public WebElement getOrgIcon() {
		return orgIcon;
	}

	public void setOrgIcon(WebElement orgIcon) {
		this.orgIcon = orgIcon;
	}

	public WebElement getCreateContactIcon() {
		return createContactIcon;
	}

	public WebElement getFirstNameDD() {
		return FirstNameDD;
	}

	public WebElement getFirstNameTF() {
		return FirstNameTF;
	}

	public WebElement getLastNameTF() {
		return LastNameTF;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	

}
