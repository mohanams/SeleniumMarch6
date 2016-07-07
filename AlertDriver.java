package day4;

public class AlertDriver {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://in.rediff.com/";
		HandlingAlerts obj = new HandlingAlerts(url);
		/*obj.handlealertmessages();
		obj.tear_down();*/
		obj.runsequence();
	}

}
