package trending.hashtags;

import java.util.ArrayList;
import java.util.List;

public class TweetParserServiceImpl implements TweetParserService {

	public void parseTweet(String tweet) {
		// TODO Auto-generated method stub
		List<String> tags;
		List<HashTag> tagList;

		tags = Utility.getHashTags(tweet);
		tagList = new ArrayList<HashTag>();

		for (String t : tags) {
			if (TweetDAO.hashTags.containsKey(t.toLowerCase())) {
				HashTag hashTag = TweetDAO.hashTags.get(t.toLowerCase());
				hashTag.setTrend(hashTag.getTrend() + 1);
				TweetDAO.hashTags.put(t.toLowerCase(), hashTag);
				tagList.add(hashTag);
			} else {
				HashTag hashTag = new HashTag(t.toLowerCase(), 1);
				TweetDAO.hashTags.put(t.toLowerCase(), hashTag);
				tagList.add(hashTag);
			}
		}
		TweetDAO.tweets.add(new Tweet(tweet, tagList));
	}

	public void displayTrendingTweets() {
		// TODO Auto-generated method stub
		System.out.println("Top 10 trending hashtags");
		int count = 0;

		for (HashTag tag : Utility.trendingHashTags(TweetDAO.hashTags)) {
			if (count >= 10)
				break;
			System.out.println(tag);
		}
	}

}
