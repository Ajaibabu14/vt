package genericlibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesUtility implements IAutoConstants {
	
	public String readDataFromFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(PROPERTYPATH);
		Properties ppt=new Properties();
		ppt.load(fis);
		return ppt.getProperty(key);
	}  
	
}
