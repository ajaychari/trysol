import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(5000);
		WebElement uname=driver.findElement(By.name("username"));
			uname.sendKeys("Admin");
			//Thread.sleep(3000);
			WebElement pwd=driver.findElement(By.name("password"));
			pwd.sendKeys("admin123");
			
			WebElement accept=driver.findElement(By.xpath("//button[@type='submit']"));
			accept.click();
			WebElement admin=driver.findElement(By.xpath("//span[text()='Admin']"));
			admin.click();
			WebElement add=driver.findElement(By.xpath("//button[text()=' Add ']"));
			add.click();
			
			WebElement selectUser=driver.findElement(By.xpath("(//div[@tabindex='0'])[1]"));
			selectUser.click();
			WebElement ess=driver.findElement(By.linkText("ESS"));
			ess.click();
				
	}

}
