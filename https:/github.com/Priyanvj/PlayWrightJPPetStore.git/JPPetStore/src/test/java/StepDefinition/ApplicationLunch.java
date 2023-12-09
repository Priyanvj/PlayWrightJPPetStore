package StepDefinition;

import java.io.IOException;

import Pages.ApplicationLaunch;
import Utilis.DriverFactory;
import io.cucumber.java.en.*;

public class ApplicationLunch {
	
	public ApplicationLaunch launch = new ApplicationLaunch(DriverFactory.getPage());

	
	
	@Given("User launches the browser")
	public void browserLaunch() throws IOException {
		launch.browserLaunch();
	}
	
	

}
