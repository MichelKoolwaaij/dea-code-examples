package nl.han.dea.twitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TwitterUserTest {

	private TwitterUser user;

	@Before
	public void setup() throws ParseException{
		this.user = new TwitterUser("user");
		TweetDateFormatter formatter = Mockito.mock(TweetDateFormatter.class);
		when(formatter.formattedTweetDate()).thenReturn("01.01.2015");
		user.setDateFormatter(formatter);
	}
	
	@Test
	public void testTweetNoFollowers() {
		user.tweet("msg");
		assertEquals("@user: msg 01.01.2015",user.lastTweet);
	}

	@Test
	public void testOneFollower() {
		Follower follower = new Follower("f");
		user.addFollower(follower);
		user.tweet("msg");
		assertEquals("@user tweets: msg", follower.lastTweet);
	}
	
	@Test
	public void testRemoveFollower() {
		Follower follower = new Follower("f");
		user.addFollower(follower);
		user.tweet("msg");
		assertEquals("@user tweets: msg", follower.lastTweet);
		user.removeFollower(follower);
		user.tweet("msg2");
		assertEquals("@user tweets: msg", follower.lastTweet);
	}
	
	@Test
	public void testTwoFollowers() {
		Follower follower1 = new Follower("f");
		user.addFollower(follower1);
		
		Follower follower2 = new Follower("g");
		user.addFollower(follower2);
		
		user.tweet("msg");
		assertEquals("@user tweets: msg", follower1.lastTweet);
		assertEquals("@user tweets: msg", follower2.lastTweet);
	}
	
	

}
