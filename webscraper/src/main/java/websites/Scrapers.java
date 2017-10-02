package websites;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Scrapers {
	
	private static FirefoxDriver firefoxDriver;
	private static ChromeDriver chromeDriver;
	
	public static ChromeDriver chrome(String sourceUrl) {
		chromeDriver = new ChromeDriver();
		chromeDriver.get(sourceUrl);
		return chromeDriver;
	}
	
	public static FirefoxDriver firefox(String sourceUrl) {
		firefoxDriver = new FirefoxDriver();
		firefoxDriver.get(sourceUrl);
		return firefoxDriver;
	}
	
	static String instagramBase() {
		return "https://www.instagram.com/";
	}
	
	abstract String constructBaseUrl();
	abstract List<List<WebElement>> scrapePage(String baseUrl);
	abstract ArrayList<String> getChildLinks();
	abstract ArrayList<String> getHashTags();
}
