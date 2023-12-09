package Utilis;

import java.io.IOException;

import com.microsoft.playwright.*;

import Functional.WebActions;

public class DriverFactory {

	public Browser browser;
	public static BrowserContext context;
	public static Page page;
	public static ThreadLocal<Page> threadlocalpage = new ThreadLocal<>();
	public static ThreadLocal<BrowserContext> threadlocalcontext = new ThreadLocal<>();

	public Page InitBrowser(String BrowserName) throws IOException {
		BrowserType browsertype = null;
		boolean headless = Boolean.valueOf(WebActions.getProperty("Headless"));
		switch (BrowserName) {
		case ("firefox"):
			browsertype = Playwright.create().firefox();
			browser = browsertype.launch(new BrowserType.LaunchOptions().setHeadless(headless));
			break;
		case ("chrome"):
			browsertype = Playwright.create().chromium();
			browser = browsertype.launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(headless));
			break;
		case ("webkit"):
			browsertype = Playwright.create().webkit();
			browser = browsertype.launch(new BrowserType.LaunchOptions().setHeadless(headless));
			break;
		}	
		if(browser == null);
		context = browser.newContext();
		page = context.newPage();
		threadlocalpage.set(page);
		threadlocalcontext.set(context);
		return page;

	}
	
	public static synchronized Page getPage() {
		return threadlocalpage.get();
	}
	
	public static synchronized BrowserContext getContext() {
		return threadlocalcontext.get();
	}

}
