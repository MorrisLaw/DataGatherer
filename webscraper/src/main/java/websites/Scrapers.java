package websites;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Scrapers {
	
	abstract String constructBaseUrl();
	abstract ChromeDriver chrome(String sourceUrl);
	abstract FirefoxDriver firefox(String sourceUrl);
	abstract ArrayList<String> getChildLinks();
	abstract ArrayList<String> getHashTags();
	abstract List<List<WebElement>> scrapePage(String baseUrl);

}
