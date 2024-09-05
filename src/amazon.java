import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//a[text()='here']"));
		element.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		WebElement cross=driver.findElement(By.xpath("//div[@role='button']"));
		cross.click();

	}

}
