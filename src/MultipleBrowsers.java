import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String [] browsers= {"Chrome","FireFox","Edge"};
			WebDriver driver=null;
			for(int i=0;i<browsers.length;i++) 
			{
				//capture position data
				 String browsername=browsers[i];
				 if(browsername.equalsIgnoreCase("Chrome"))
				 {
					 driver= new ChromeDriver();
				 }
				 else if(browsername.equalsIgnoreCase("FireFox"))
				 {
					 driver= new FirefoxDriver();
				 }
				 else if(browsername.equalsIgnoreCase("Edge"))
				 {
					  driver=new EdgeDriver();
				 }
				 driver.get("https://www.facebook.com/");
				
				
			}
			
		  //create driver instance
		  //WebDriver driver =new ChromeDriver();
		  // open application
		 // driver.get("https://www.facebook.com/");
		  
		  
	}

}
