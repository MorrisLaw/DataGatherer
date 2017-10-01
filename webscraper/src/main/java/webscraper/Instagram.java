package webscraper;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
		} catch(InputMismatchException | NullPointerException e) {
			e.printStackTrace();
		}
		sc.close();
		// Concatenate the instagram url with the hashtag.
		String igUrl = Scrapers.instagramBase();
		StringBuilder constructedUrl = new StringBuilder(igUrl);
		constructedUrl.append(hashTagExtension);
		
		return constructedUrl.toString();
	}

	@Override
	WebElement scrapePage() {
		ChromeDriver driver = Chrome(constructBaseUrl());
		return driver.findElementByCssSelector("");
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
