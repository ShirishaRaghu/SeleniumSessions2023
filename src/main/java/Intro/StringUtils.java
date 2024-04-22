package Intro;

public class StringUtils {

	
	private StringUtils() {}
	
	public static String getRandomEmail() {
		return "automation" + System.currentTimeMillis() + "@" + "opencart.com";
		// return "automation" + UUID.randomUUID()+"@opencart.com";

		// automation14256@opencart.com
		// automation14256@opencart.com
		// automation14256@opencart.com
		// automation14256@opencart.com
		
		//Delete from user where email like "%automation%";
		//End of the day it will delete all emails -- clean up strategy

	}

}
