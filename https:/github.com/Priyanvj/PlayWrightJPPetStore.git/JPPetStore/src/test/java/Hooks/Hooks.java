package Hooks;

import java.io.IOException;
import java.nio.file.Paths;

import com.microsoft.playwright.Page;

import Functional.WebActions;
import Utilis.DriverFactory;
import io.cucumber.java.*;

public class Hooks {

	public Page page;
	public DriverFactory driverfactory;

	@Before
	public void launchbrowser() throws IOException {
		String BrowserName = WebActions.getProperty("Browser");
		driverfactory = new DriverFactory();
		page = driverfactory.InitBrowser(BrowserName);
	}

	@After
	public void closeBrowser() {
		page.close();
	}

	@AfterStep
	public void TakeScreenshot(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		byte[] sourcePath = page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot.png")));
		scenario.attach(sourcePath, "img/png", screenshotName);
	}

}
