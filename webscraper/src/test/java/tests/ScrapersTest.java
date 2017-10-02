package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrapersTest {
	
	private String url = "https://www.google.com";
	
	@Test
	public void testGoogleSearch() {
		ChromeDriver driver = websites.Scrapers.chrome(url);
		driver.get("http://www.google.com/xhtml");
		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		// Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		// Let the user actually see something!
		driver.quit();
	}
}
