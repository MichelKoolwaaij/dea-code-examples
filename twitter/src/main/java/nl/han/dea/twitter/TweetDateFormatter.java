package nl.han.dea.twitter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TweetDateFormatter {

	private Date tweetDate = new Date();
	
	public String formattedTweetDate() {
		return new SimpleDateFormat("dd.MM.yyyy").format(tweetDate);
	}

	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}

}
