import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b/?_encoding=UTF8&node=1389401031&ref_=sv_top_elec_mega_1");
		Thread.sleep(5000);
		//count off all checkboxes
		int checkCount1=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(checkCount1);
		
		// identify the check box 
		WebElement checkbox=driver.findElement(By.xpath("(//*[@class='a-icon a-icon-checkbox'])[1]"));
		checkbox.click();
		Thread.sleep(5000);
		//identify next check box
		WebElement checkbox2=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]"));
		checkbox2.click();
		Thread.sleep(10000);
		//checkbox2.click();
		// to add second property to the same object
		//count of check boxes in app
		int checkCount=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(checkCount);
	}

}
