package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshotutility extends baseClass implements IAutoConstants {
	 public static  String takescreenshot(String screenshotName)
	    {
	       TakesScreenshot ts=(TakesScreenshot)driver;    
	       File src = ts.getScreenshotAs(OutputType.FILE);
	       String ldt=LocalDateTime.now().toString().replace(':', '-');
	      String path = System.getProperty("user.dir")+sspath+screenshotName+""+ldt+".png";
	      File dest=new File(path);
	      try {
	    	  FileUtils.copyFile(src, dest);
			
		} catch (IOException e) {
		e.printStackTrace();
		}
		return path;
				
	    }

}
