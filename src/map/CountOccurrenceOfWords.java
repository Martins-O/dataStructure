package map;

import java.util.Map;
import java.util.TreeMap;

public class CountOccurrenceOfWords {
	public static void main(String[] args) {
		String text = "Good morning. Have a good class. " + "Have a good visit. Have fun!";
		Map<String, Integer> map = new TreeMap<>();
		String[] words = text.split("[\\s+\\p{P}]");
		for(String word : words) {
			String key = word.toLowerCase();
			if(key.length() > 0) {
				if(! map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		map.forEach((key, value) -> System.out.println(key + "\t" + value));
	}
}

