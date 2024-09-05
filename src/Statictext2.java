import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictext2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser instance
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.facebook.com/");
		//identify the element
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		ele.click();
		//to identify static text
		WebElement FbText=driver.findElement(By.xpath("//td/div"));
		//print the static text  
		System.out.println(FbText.getText());
		//capture static text from application
		String expeText="Please enter your email address or mobile number to search for your account.";
		//get the static text
		String actText=FbText.getText();
		System.out.println(expeText);
		// verify static is displayed or not
		if(expeText.equalsIgnoreCase(actText)) {
			System.out.println("Static text displayed correctly");
		}
		else
		{
			System.out.println("static textnot displayed");
		}
	}

}
