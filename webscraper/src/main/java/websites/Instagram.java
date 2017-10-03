package websites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram extends Scrapers {
	
	private String hashTag;
	private StringBuilder hashTagExtension;
	private ChromeDriver chromeDriver;
	private String igUrl = "https://www.instagram.com/"; 
	Scanner sc;
	
	/**
	 * Builds the URL that we will be scraping data from, by appending
	 * the hashtag to the Instagram URL.
	 * 
	 * @return constructedUrl.toString() - The newly created URL derived
	 * from both the Instagram tags URL "https://www.instagram.com/explore/tags
	 * and the provided hashtag.
	 */
	@Override
	protected String constructBaseUrl() {
		System.out.println("Please provide the hashtag from which we will be scraping data.");
		try (Scanner sc = new Scanner(System.in)) {
			hashTag = sc.nextLine();
			hashTagExtension = new StringBuilder("explore/tags/");
			hashTagExtension.append(hashTag);
			sc.close();
		} catch(InputMismatchException | NullPointerException e) {
			e.printStackTrace();
		}
		StringBuilder constructedUrl = new StringBuilder(igUrl);
		constructedUrl.append(hashTagExtension);
		
		return constructedUrl.toString();
	}
	
	/**
	 * Navigates to the web page via the ChromeDriver.
	 * 
	 * @param sourceUrl - 
	 * @return 
	 */
	public ChromeDriver chrome(String sourceUrl) {
		chromeDriver = new ChromeDriver();
		chromeDriver.get(sourceUrl);
		return chromeDriver;
	}

	/**
	 * Scrape the Instagram page associated with the newly constructed URL,
	 * built from the hashtag provided to the program.
	 * 
	 * @param baseUrl - The URL from which we intend to scrape data.
	 * @return childWebElems - A list of children associated with the retrieved
	 * WebElement.
	 */
	@Override
	protected List<List<WebElement>> scrapePage(String baseUrl) {
		ChromeDriver driver = chrome(baseUrl);
		Set<WebElement> set = new HashSet<>();
		List<WebElement> parentWebElems = driver.findElementsByCssSelector("#react-root > "
				+ "section > main > article > div:nth-child(4) > div._cmdpi");
		List<List<WebElement>> childWebElems = new ArrayList<List<WebElement>>();
		childWebElems.addAll(childWebElems);
//		driver.close();
		return childWebElems;
	}
	
	@Override
	protected ArrayList<String> getChildLinks() {
		return null;
	}

	@Override
	protected ArrayList<String> getHashTags() {
		return null;
	}

	@Override
	FirefoxDriver firefox(String sourceUrl) {
		// TODO FireFox support, not yet integrated.
		return null;
	}
}
