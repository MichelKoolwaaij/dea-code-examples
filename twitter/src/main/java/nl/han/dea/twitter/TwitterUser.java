package nl.han.dea.twitter;

import java.util.ArrayList;

public class TwitterUser {

	private String id;
	private TweetDateFormatter dateFormatter = new TweetDateFormatter();
	private ArrayList<IFollower> followers = new ArrayList<IFollower>();
	
	String lastTweet = null;
	
	public TwitterUser(String id) {
		this.id = id;
	}

	public void tweet(String tweet) {
		lastTweet = "@" + id + ": " + tweet + " "
				+ dateFormatter.formattedTweetDate();
		System.out.println(lastTweet);
		notifyFollowers(tweet);
	}

	public String getId() {
		return id;
	}

	private void notifyFollowers(String tweet) {
		for (IFollower follower : followers) {
			follower.update(this, tweet);
		}
	}

	public void addFollower(IFollower follower) {
		followers.add(follower);
	}

	public void removeFollower(IFollower follower) {
		followers.remove(follower);
	}

	public void setDateFormatter(TweetDateFormatter dateFormatter) {
		this.dateFormatter = dateFormatter;
	}

}