package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeads {

public CreateLeads(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


@FindBy(xpath = "//img[@alt='Create Lead...']")
private WebElement LeadsIcon;

public WebElement getDuplicateButton() {
	return DuplicateButton;
}

public void setDuplicateButton(WebElement duplicateButton) {
	DuplicateButton = duplicateButton;
}


@FindBy(xpath = "//input[@class='crmbutton small create'][1]")
private WebElement DuplicateButton;

@FindBy(name="salutationtype")
private WebElement FirstNameDD;

@FindBy(name = "firstname")
private WebElement FirstName;

@FindBy(name = "lastname")
private WebElement LastName;

@FindBy(name = "company")
private WebElement CompanyName;

@FindBy(xpath = "//input[@class='crmButton small save']")
private WebElement saveButton;

@FindBy(name = "selectall")
private WebElement Checkbox;



@FindBy(xpath = "//input[@value='Delete'][1]")
private WebElement DeleteButton;

public WebElement getLeadsIcon() {
	return LeadsIcon;
}

public void setLeadsIcon(WebElement leadsIcon) {
	LeadsIcon = leadsIcon;
}

public WebElement getFirstNameDD() {
	return FirstNameDD;
}

public void setFirstNameDD(WebElement firstNameDD) {
	FirstNameDD = firstNameDD;
}

public WebElement getFirstName() {
	return FirstName;
}

public void setFirstName(WebElement firstName) {
	FirstName = firstName;
}

public WebElement getLastName() {
	return LastName;
}

public void setLastName(WebElement lastName) {
	LastName = lastName;
}

public WebElement getCompanyName() {
	return CompanyName;
}

public void setCompanyName(WebElement companyName) {
	CompanyName = companyName;
}

public WebElement getSaveButton() {
	return saveButton;
}

public void setSaveButton(WebElement saveButton) {
	this.saveButton = saveButton;
}

public WebElement getCheckbox() {
	return Checkbox;
}

public void setCheckbox(WebElement checkbox) {
	Checkbox = checkbox;
}

public WebElement getDeleteButton() {
	return DeleteButton;
}

public void setDeleteButton(WebElement deleteButton) {
	DeleteButton = deleteButton;
}


}
