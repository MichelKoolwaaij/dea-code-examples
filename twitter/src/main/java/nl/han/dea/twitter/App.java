package nl.han.dea.twitter;

public class App {
	public static void main(String[] args) {
		TwitterUser michel = new TwitterUser("Michel");
		TwitterUser herman = new TwitterUser("Herman");
		
		Follower bram = new Follower("Bram");
		Follower luc = new Follower("Luc");
		Follower sven = new Follower("Sven");
		
		michel.addFollower(bram);
		herman.addFollower(bram);
		herman.addFollower(luc);
		herman.addFollower(sven);
				
		michel.tweet("Studenten #DEA vinden patterns maar saai.");
		herman.tweet("Waarom staat dat lijntje daar?");
		
	}
}
