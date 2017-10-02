package websites;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

public class WebScraper {

	private Map<String, String> websiteDictionary = new HashMap<>();
	
	private void populateDictionary() {
		websiteDictionary.put("instagram", "https://www.instagram.com/");
		websiteDictionary.put("reddit", "https://www.reddit.com/");
		websiteDictionary.put("twitter", "https://twitter.com/");
	}
	
	public static void main(String[] args) {
		
		Instagram ig = new websites.Instagram();
		String sourceUrl = ig.constructBaseUrl();
		List<List<WebElement>> parent = ig.scrapePage(sourceUrl);
		List<WebElement> children = new ArrayList<>();
		
		List<WebElement> currList = new ArrayList<>();
		WebElement currElem;
		for (int i = 0; i < parent.size(); i++) {
			currList = parent.get(i);
			for (int j = 0; j < currList.size(); j++) {
				currElem = currList.get(j);
				children.add(currElem);
			}
		}
		
		for (int elemIndex = 0; elemIndex < children.size(); elemIndex++) {
			System.out.println(children.get(elemIndex).getText());
		}
	}

}
