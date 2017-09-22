package nl.han.dea.twitter;

public class Follower implements IFollower {

	String lastTweet = null;
	String name;

	public Follower(String name){
		this.name=name;
	}

	public void update(TwitterUser user, String tweet) {
		lastTweet = "("+this.name+") - @" + user.getId() + " tweets: " + tweet;
		System.out.println(lastTweet);
	}

}
