package palywright;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class playwright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Playwright playwright = Playwright.create()) {
		      List<BrowserType> browserTypes = Arrays.asList(
		        playwright.chromium(),
		        playwright.webkit(),
		        playwright.firefox()
		      );
		      for (BrowserType browserType : browserTypes) {
		        try (Browser browser = browserType.launch()) {
		          BrowserContext context = browser.newContext();
		          Page page = context.newPage();
		          page.navigate("https://playwright.dev/");
		          page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot-" + browserType.name() + ".png")));
		        }
		      }
		    }
	}

}
