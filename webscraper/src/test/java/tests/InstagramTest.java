package tests;

import static org.junit.Assert.fail;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import websites.Instagram;

public class InstagramTest {

	@Test
	public void testGoogleSearch() {
		Instagram ig = new Instagram();
		ChromeDriver driver = ig.chrome("http://www.google.com/xhtml");
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
	
	@Test
	public void testConstructBaseUrl() {
		fail("Not yet implemented");
	}

	@Test
	public void testScrapePage() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetChildLinks() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetHashTags() {
		fail("Not yet implemented");
	}
}
