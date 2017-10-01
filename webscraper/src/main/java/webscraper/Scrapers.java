package webscraper;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Scrapers {
	
	private static FirefoxDriver firefoxDriver;
	private static ChromeDriver chromeDriver;
	
	static ChromeDriver Chrome(String sourceUrl) {
		chromeDriver = new ChromeDriver();
		chromeDriver.get(sourceUrl);
		return chromeDriver;
	}
	
	static FirefoxDriver Firefox(String sourceUrl) {
		firefoxDriver = new FirefoxDriver();
		firefoxDriver.get(sourceUrl);
		return firefoxDriver;
	}
	
	static String instagramBase() {
		return "https://www.instagram.com/";
	}
	
	abstract String constructBaseUrl();
	abstract WebElement scrapePage();
	abstract ArrayList<String> getChildLinks();
	abstract ArrayList<String> getHashTags();
}
