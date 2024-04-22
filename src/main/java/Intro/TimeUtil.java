package Intro;

public class TimeUtil {

	
	private final static int DEFAULT_SHORT_TIME =2000;
	private final static int DEFAULT_Medium_TIME =500;
	private final static int DEFAULT_Long_TIME =1000;
	private final static int Max_TIME =15000;

	
	public static void shortTime() {
		try {
			Thread.sleep(DEFAULT_SHORT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void mediumTime() {
          try {
			Thread.sleep(DEFAULT_Medium_TIME);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	}
	
	public static void longTime() {
        try {
			Thread.sleep(DEFAULT_Long_TIME);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	}
	
	public static void maxTime() {
        try {
			Thread.sleep(DEFAULT_Long_TIME);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	}
	
	
}
