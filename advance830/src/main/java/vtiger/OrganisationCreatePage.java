package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationCreatePage {
	public OrganisationCreatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//img[@title='Create Organization...']")
	private WebElement CreateOrganisationButton;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement nameTf;
	
	@FindBy(name = "industry")
	private WebElement industryDD;
	
	@FindBy (name = "accounttype")
     private WebElement typeDD;
	
	@FindBy(xpath = "//input[@class='crmbutton small save'][1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement singout;
	
	

	public WebElement getCreateOrganisationButton() {
		return CreateOrganisationButton;
	}
    
	public WebElement getNameTf() {
		return nameTf;
	}

	public WebElement getIndustryDD() {
		return industryDD;
	}

	public WebElement getTypeDD() {
		return typeDD;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSingout() {
		return singout;
	}
	
	
	
	
	
	}


