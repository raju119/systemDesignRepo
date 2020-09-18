package trending.hashtags;

import java.util.List;

public class Tweet {
	private String tweet;
	private List<HashTag> tags;

	public Tweet(String tweetInput, List<HashTag> tagList) {
		// TODO Auto-generated constructor stub
		this.tweet = tweetInput;
		this.tags = tagList;
	}

	public String getTweet() {
		return tweet;
	}

	public void setTweet(String tweetInfo) {
		this.tweet = tweetInfo;
	}

	public List<HashTag> getTags() {
		return tags;
	}

	public void setTags(List<HashTag> tags) {
		this.tags = tags;
	}
}
