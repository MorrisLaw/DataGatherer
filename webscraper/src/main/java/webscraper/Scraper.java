package webscraper;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Scraper {
	
	String sourceUrl;
	FirefoxDriver firefoxDriver;
	ChromeDriver chromeDriver;
	
	public void useChrome(String sourceUrl) {
		chromeDriver.get(sourceUrl);	
	}
	
	public void useFirefox(String sourceUrl) {
		firefoxDriver.get(sourceUrl);
	}
	
	abstract ArrayList<String> getChildUrls();
	abstract ArrayList<String> getHashTags();
}
