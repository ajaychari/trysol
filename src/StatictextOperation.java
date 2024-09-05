import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatictextOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser instance
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement fbtext=driver.findElement(By.xpath("//div/h2"));
		String expectedText=fbtext.getText();
		String actText="Facebook helps you connect and share with the people in your life.";
		System.out.println(expectedText);
		if(expectedText.equalsIgnoreCase (actText)) {
			System.out.println("expected text matter displayed");
			
		}
		else {
			System.out.println("not displayed");
		}
		driver.close();
	}

}
