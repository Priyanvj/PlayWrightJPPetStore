package StepDefinition;

import Pages.HomePage;
import Utilis.DriverFactory;
import io.cucumber.java.en.*;

public class homepage {
	
	HomePage homepage = new HomePage(DriverFactory.getPage());
	
	
	@When("user clicks on {string} product link where ID is {string}")
	public void clickLinks(String linkValue, String IDvalue) {
		homepage.clickLink(linkValue, IDvalue);
	}

}
