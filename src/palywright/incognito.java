package palywright;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class incognito {

	
		// TODO Auto-generated method stub
		
		@Test
		public void   setUp() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.setAcceptInsecureCerts(true);
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
				
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);

			WebDriverManager.chromedriver().setup();
			WebDriver driver=null;
			
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			
			driver.quit();
		}
	}

