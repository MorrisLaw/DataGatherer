package websites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram extends Scrapers {
	
	protected String hashTag;
	protected StringBuilder hashTagExtension;
	Scanner sc;
	
	@Override
	String constructBaseUrl() {
		// Retrieve the hashtag from the user via console.
		System.out.println("Please provide the hashtag from which we will be scraping data.");
		try (Scanner sc = new Scanner(System.in)) {
			hashTag = sc.nextLine();
			hashTagExtension = new StringBuilder("explore/tags/");
			hashTagExtension.append(hashTag);
			sc.close();
		} catch(InputMismatchException | NullPointerException e) {
			e.printStackTrace();
		}
		// Concatenate the instagram url with the hashtag.
		String igUrl = Scrapers.instagramBase();
		StringBuilder constructedUrl = new StringBuilder(igUrl);
		constructedUrl.append(hashTagExtension);
		
		return constructedUrl.toString();
	}

	@Override
	List<List<WebElement>> scrapePage(String baseUrl) {
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
	ArrayList<String> getChildLinks() {
		return null;
	}

	@Override
	ArrayList<String> getHashTags() {
		return null;
	}
}
