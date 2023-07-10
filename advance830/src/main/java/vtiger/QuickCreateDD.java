package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickCreateDD {
	public QuickCreateDD(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id = "qccombo")
	private WebElement QuickCreateDD;
	
	@FindBy(name = "subject")
	private WebElement SubjectTF;
	
	@FindBy(name = "eventstatus")
	private WebElement StatusDD;
	
	@FindBy(name = "due_date")
	private WebElement EndDate;
	 
	@FindBy(name = "date_start")
	private WebElement StartDate;
	
	@FindBy(name = "time_start")
	private WebElement StartTime;
	
	@FindBy(name = "activitytype")
	private WebElement ActivityType;
	
	@FindBy(xpath = "/html/body/div[4]/form/table/tbody/tr/td/table[2]/tbody/tr/td/table[1]/tbody/tr[3]/td[4]/input[2]")
	private WebElement assignToGroupRadioButton;
	
	@FindBy(xpath = "//select[@name='assigned_group_id']")
	private WebElement AssignToGroupDD;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement SaveButton;

	public WebElement getQuickCreateDD() {
		return QuickCreateDD;
	}

	public void setQuickCreateDD(WebElement quickCreateDD) {
		QuickCreateDD = quickCreateDD;
	}

	public WebElement getSubjectTF() {
		return SubjectTF;
	}

	public void setSubjectTF(WebElement subjectTF) {
		SubjectTF = subjectTF;
	}

	public WebElement getStatusDD() {
		return StatusDD;
	}

	public void setStatusDD(WebElement statusDD) {
		StatusDD = statusDD;
	}

	

	public WebElement getEndDate() {
		return EndDate;
	}

	public void setEndDate(WebElement endDate) {
		EndDate = endDate;
	}

	public WebElement getStartDate() {
		return StartDate;
	}

	public void setStartDate(WebElement startDate) {
		StartDate = startDate;
	}

	public WebElement getStartTime() {
		return StartTime;
	}

	public void setStartTime(WebElement startTime) {
		StartTime = startTime;
	}

	public WebElement getActivityType() {
		return ActivityType;
	}

	public void setActivityType(WebElement activityType) {
		ActivityType = activityType;
	}

	public WebElement getAssignToGroupRadioButton() {
		return assignToGroupRadioButton;
	}

	public void setAssignToGroupRadioButton(WebElement assignToGroupRadioButton) {
		this.assignToGroupRadioButton = assignToGroupRadioButton;
	}

	public WebElement getAssignToGroupDD() {
		return AssignToGroupDD;
	}

	public void setAssignToGroupDD(WebElement assignToGroupDD) {
		AssignToGroupDD = assignToGroupDD;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		SaveButton = saveButton;
	}
	
	

}
