import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import java.time.Duration;
import java.util.List;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the Chrome driver
		WebDriver driver = new ChromeDriver();

		// Step 1: Open the web browser and navigate to FitPeo
		driver.get("https://www.fitpeo.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		// Step 2: Navigate to the Revenue Calculator Page
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Revenue Calculator']")));
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();

		// Step 3: Scroll down to the slider section
		//WebElement slider = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("revenue-slider"))); // Replace
				Thread.sleep(4000);																								// with
		WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));																									// the
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slider);
		
		// Step 4: Adjust the slider to set its value to 820
		Actions actions = new Actions(driver);
		
		actions.dragAndDropBy(slider, 0, 820).build().perform();
		
		

		// Verify the slider value is updated to 820
	     WebElement sliderValue = driver.findElement(By.id("slider-value"));
		 assert sliderValue.getText().equals("820");

		// Step 5: Update the text field to 560 and validate the slider
		WebElement textField = driver.findElement(By.xpath("//input[@type='number']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", textField);
		
		textField.sendKeys("560");
		textField.sendKeys(Keys.RETURN);

		// Verify the slider position is updated to reflect the value 560
		WebElement sliderValue1 = driver.findElement(By.xpath("//input[@type='range']"));
		assert sliderValue1.getText().equals("560");

		// Step 6: Select CPT Codes
		String[] cptCodes = { "CPT-99091", "CPT-99453", "CPT-99454", "CPT-99474" };
		for (String cptCode : cptCodes) {
			WebElement checkbox = driver.findElement(By.xpath("//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")); // Replace with the actual ID of the checkboxes
			if (!checkbox.isSelected()) {
				checkbox.click();
			}
		}

		// Step 7: Validate Total Recurring Reimbursement
		WebElement totalReimbursement = driver.findElement(By.id("total-reimbursement"));
		assert totalReimbursement.getText().equals("$110700");

		// Close the browse
		driver.quit();
		
	}
}
