package day4;

public class DriverGoogleOpenClose {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		String url = "http://google.com/";
		Googleopenclose goo = new Googleopenclose(url);
		goo.selectlink("Gmail");
		goo.tear_down();

	}

}
