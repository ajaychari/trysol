import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*define chrome options(profile)

		 ChromeOptions coptions= new ChromeOptions();
		 coptions.addArguments("--disable-notifications");
	     WebDriver driver1=new ChromeDriver(coptions);
		 driver1.get("https://www.ajio.com/"); */
		
		//define firefox options
		
		/*WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.ajio.com/");*/
		
		// define edge bwoser
		EdgeOptions EdOptions= new EdgeOptions();
		EdOptions.addArguments("--disable-notifications");
		WebDriver edriver=new EdgeDriver(EdOptions);
		

	}

}
