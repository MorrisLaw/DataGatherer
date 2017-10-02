package websites;

import java.util.HashMap;
import java.util.Map;

public class WebScraper {

	private Map<String, String> websiteDictionary = new HashMap<>();
	
	private void populateDictionary() {
		websiteDictionary.put("instagram", "https://www.instagram.com/");
		websiteDictionary.put("reddit", "https://www.reddit.com/");
		websiteDictionary.put("twitter", "https://twitter.com/");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
