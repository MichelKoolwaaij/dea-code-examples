package nl.han.dea.twitter;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

public class TweetDateFormatterTest {

	private TweetDateFormatter tweetDateFormatter;
	
	@Before
	public void setUp() throws Exception {
		tweetDateFormatter = new TweetDateFormatter();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		tweetDateFormatter.setTweetDate(dateFormat.parse("1.1.2015"));
		
	}

	@Test
	public void testFormatTweetDate() throws ParseException  {
		assertEquals("01.01.2015", tweetDateFormatter.formattedTweetDate());
	}

}
