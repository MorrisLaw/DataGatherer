package webscraper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrapersTest {
	
	private String url = "https://www.google.com";
	
	@Test
	public void testChrome() {
		ChromeDriver standardDriver = new ChromeDriver();
		ChromeDriver chromeMethodDriver = webscraper.Scrapers.chrome(url);
		standardDriver.get("https://www.google.com");
		assertEquals(standardDriver, chromeMethodDriver);
	}
	
	@Test
	public void testFirefox() {
		FirefoxDriver standardDriver = new FirefoxDriver();
		FirefoxDriver firefoxMethodDriver = webscraper.Scrapers.firefox(url);
		standardDriver.get("https://www.google.com");
		assertEquals(standardDriver, firefoxMethodDriver);
	}
	
}
