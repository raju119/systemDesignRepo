package trending.hashtags;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utility {

	public static Tweet buildTweet(String tweet) {

		return null;
	}

	public static List<String> getHashTags(String tweet) {

		String[] tags = tweet.split("#");
		List<String> hashTags = new ArrayList<String>();
		for (String tag : tags) {
			if (tweet.contains("#" + tag)) {
				hashTags.add(tag.substring(0, tag.indexOf(' ') == -1 ? tag.length() : tag.indexOf(' ')));
			}
		}

		return hashTags;
	}

	public static List<HashTag> trendingHashTags(Map<String, HashTag> tags) {

		Set<String> keys = tags.keySet();
		List<HashTag> tagList = new ArrayList<HashTag>();
		for (String key : keys) {
			tagList.add(tags.get(key));
		}
		Collections.sort(tagList, Collections.reverseOrder());

		return tagList;
	}

}
