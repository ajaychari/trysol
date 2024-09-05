package fitpeo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create browser instance
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fitpeo.com/");
			driver.manage().window().maximize();
		// identify the web element
			WebElement Revenue=driver.findElement(By.name("Revenue Calculator"));
			Revenue.click();

	}

	
}
