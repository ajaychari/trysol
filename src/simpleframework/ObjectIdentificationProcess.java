package simpleframework;

import org.openqa.selenium.By;

public class ObjectIdentificationProcess {
	//identify the object using id, name, css, xpath,linked text
	public static By objectLocator(String propertyname,String propertyvalue) 
	{
		By objinfo=null;
		if(propertyname.equalsIgnoreCase("id")) 
		{
			objinfo=By.id(propertyvalue);
			
		}
		else if(propertyname.equalsIgnoreCase("name")) 
		{
			objinfo=By.name(propertyvalue);
		}
		else if(propertyname.equalsIgnoreCase("css"))
		{
			objinfo=By.cssSelector(propertyvalue);
		}
		else if(propertyname.equalsIgnoreCase("linktext"))
		{
			objinfo=By.linkText(propertyvalue);
		}
		else if(propertyname.equalsIgnoreCase("xpath"))
		{
			objinfo=By.xpath(propertyvalue);
		}
		return objinfo;
	}

}
