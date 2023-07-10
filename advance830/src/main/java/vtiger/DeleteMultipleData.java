package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteMultipleData {
	public DeleteMultipleData(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "21")
	private WebElement Delete1;
	
	@FindBy(id = "24")
	private WebElement Delete2;
	
	@FindBy(id = "25")
	private WebElement Delete3;

	public WebElement getDelete1() {
		return Delete1;
	}

	public void setDelete1(WebElement delete1) {
		Delete1 = delete1;
	}

	public WebElement getDelete2() {
		return Delete2;
	}

	public void setDelete2(WebElement delete2) {
		Delete2 = delete2;
	}

	public WebElement getDelete3() {
		return Delete3;
	}

	public void setDelete3(WebElement delete3) {
		Delete3 = delete3;
	}
	

}
