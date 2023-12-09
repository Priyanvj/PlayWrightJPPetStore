package Pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	public Page page;
	
	public HomePage(Page page) {
		this.page = page;
	}
	
	
	public void clickLink(String linkValue, String IDValue) {
		page.locator("//*[@id='"+IDValue+"']/a[contains(@href,'"+linkValue+"')]").click();
	}

}
