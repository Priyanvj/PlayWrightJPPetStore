package Pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class AddtoCart {
	
	public Page page;
	
	public AddtoCart(Page page) {
		this.page = page;
	}
	
	public void toCart(String itemID, String value) {
		page.locator("//a[contains(@href,'"+itemID+"')][text()='"+value+"']").click();
	}
	
	public void dropDown(String dropdown, String value) {
		page.selectOption("//*[@*='"+dropdown+"']", new SelectOption().setValue(value));

	}

}
