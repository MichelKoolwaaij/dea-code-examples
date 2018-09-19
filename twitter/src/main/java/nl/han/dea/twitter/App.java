package nl.han.dea.twitter;

public class App {
	public static void main(String[] args) {
		TwitterUser michel = new TwitterUser("Michel");
		TwitterUser marco = new TwitterUser("Marco");
		
		Follower steven = new Follower("Steven");
		Follower bonno = new Follower("Bonno");
		Follower klaas = new Follower("Klaas");
		
		michel.addFollower(steven);
		marco.addFollower(steven);
		marco.addFollower(bonno);
		marco.addFollower(klaas);
				
		michel.tweet("Mag het een interfeesje meer zijn?");
		marco.tweet("Dit domein model bevat navigatiepijlen, visibilty en datatypes. Foei!!!");
		
	}
}
