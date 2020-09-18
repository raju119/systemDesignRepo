package trending.hashtags;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	static List<Tweet> tweets = new ArrayList<Tweet>();
	static Map<String, HashTag> hashTags = new HashMap<String, HashTag>();

	public static void main(String[] args) {
		Scanner sc;
		String choice;
		TweetParserServiceImpl parserService;

		try {
			sc = new Scanner(System.in);
			System.out.println("***Welcome***");
			int chances = 3;
			parserService = new TweetParserServiceImpl();
			while (true) {
				System.out.println("Do you wish to tweet..?(y/n)");
				choice = sc.nextLine();
				if (choice.equals("n")) {
					break;
				} else if (!choice.equals("y")) {
					System.out.println("please enter a valid input and try again");
					chances--;
					System.out.println("you have " + chances + " chances left");
					if (chances == 0)
						break;
					continue;
				}

				System.out.println("please enter your tweet..:)");
				String tweetInput = sc.nextLine();
				parserService.parseTweet(tweetInput);
			}
			parserService.displayTrendingTweets();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
