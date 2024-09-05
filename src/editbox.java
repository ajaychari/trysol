import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// driver instance
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.amazon.in/");
		//home page display process
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
			System.out.println("amazon home page displayed");
		}
		else {
			System.out.println("not displayed");
		}
		//to find dropdown
		WebElement drop=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		drop.click();
		//identify the list box
		//int listCount=driver.findElements(By.xpath("//option")).size();
		//System.out.println(listCount);
		
		// to find elements in drop down
		List<WebElement>DropCount=driver.findElements(By.xpath("//option"));
		System.out.println(DropCount.size()); 
		
		//select the drop down element
		WebElement list=driver.findElement(By.linkText("Gift Cards"));
		list.click();
	}

}
