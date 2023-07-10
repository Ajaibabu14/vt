package genericlibraries;



import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
//import objectrepository.Homepage;
//import objectrepository.loginpage;
import vtiger.ContactPage;
import vtiger.CreateLeads;
import vtiger.DeleteMultipleData;
import vtiger.HomepageOrg;
import vtiger.OrganisationCreatePage;
import vtiger.QuickCreateDD;
import vtiger.VtigerLoginpage;

public class baseClass {
  public 	WebDriverUtility ut;
	public static WebDriver driver;
	public propertiesUtility utility=new propertiesUtility();
	//public loginpage login;
	//public Homepage home;
	public QuickCreateDD QuickCreate;
    public ContactPage Contact;
    public VtigerLoginpage Vlogin;
    public  HomepageOrg Home;
    public OrganisationCreatePage Orgpage;
    public CreateLeads Leads;
    public DeleteMultipleData Del;
	
     
	@BeforeClass(alwaysRun = true)
    
	public void launchBrowse() throws IOException
	
	{
		if(utility.readDataFromFile("browser").equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	}
		else
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(utility.readDataFromFile("url"));
	Vlogin=new VtigerLoginpage(driver);
	
	 Vlogin.getUseNameTextField().sendKeys(utility.readDataFromFile("username"));
	 assertEquals(utility.readDataFromFile("username"),Vlogin.getUseNameTextField().getAttribute("value"));
	 Vlogin.getPasswordTextField().sendKeys(utility.readDataFromFile("password"));
	 assertEquals(utility.readDataFromFile("password"), Vlogin.getPasswordTextField().getAttribute("value"));
	 Vlogin.getLoginButton().click();

}
	@BeforeMethod
	public void navigateToApplication() throws IOException
	{
		ut=new WebDriverUtility();
		Vlogin=new VtigerLoginpage(driver);
		Home=new HomepageOrg(driver);
		Orgpage =new OrganisationCreatePage(driver);
		Contact=new ContactPage(driver);
		Leads=new CreateLeads(driver);
		QuickCreate =new QuickCreateDD(driver);
		Del=new DeleteMultipleData(driver);
		
		
	}
	@AfterMethod
	public void loggOut()
	{
		System.out.println("logged out");
	}
	@AfterClass
	public void teardownbrowser()
	{
		driver.quit();
	}
	
	
}
