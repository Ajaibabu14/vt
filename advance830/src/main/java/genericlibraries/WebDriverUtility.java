package genericlibraries;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class WebDriverUtility extends baseClass implements IAutoConstants{
	Actions action=new Actions(driver);
	public void dragAndDrop(WebElement src ,WebElement Destination)
	{
		action.dragAndDrop(src, Destination);
		
	}
	public void rightClick()
	{
		action.contextClick();
	}
	public void rightClick(WebElement element)
	{
		action.contextClick(element);
		
	}
	public void doubleClick(WebElement element)
	{
		action.doubleClick(element);
		
	}
	public void mouseOveringOnElement(WebElement element)
	{
		action.moveToElement(element);
		
		
	}
	public Select selectReference(WebElement dropdown)
	{
		Select select=new Select(dropdown);
		return select;
		
	}
	public void handlingDropDown(WebElement dropdown,String value)
	{
		Select select=new Select(dropdown);
		try {
			select.selectByVisibleText(value);
			
		} catch (NoSuchElementException e) {
		    select.selectByValue(value);
		}
	}
		public void handlingDropDown(WebElement dropdown,int index)
		{
			Select select=new Select(dropdown);
			select.selectByIndex(index);
		
	    }
		public void scrollingActions(int x,int y)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
		}
		public void clickingOnElement(WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
		}
		public void enteringDataIntoElement(WebElement element, String data)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='"+data+"'", element);
		}
		public void clearingDataFromElement(WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].value=''", element);
		}
		
	public void switchingToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
			
	
	public void switchingToFrame(String data){
		driver.switchTo().frame(data);
	}
	
	public void switchingBackToMain()
	{
		driver.switchTo().defaultContent();
		}
	
	public Alert switchToAlert()
	{
		Alert alert=driver.switchTo().alert();
		return alert;
	}
	public void switchToWindow(Set<String> allWindowId,String targetwindowTitle)
	{
		for (String id:allWindowId)
		{
			driver.switchTo().window(id);
			if(targetwindowTitle.equalsIgnoreCase(driver.getTitle())) {
					break;
		}
			else {
				driver.close();
			}
			
		}
	}
	
	}
	

