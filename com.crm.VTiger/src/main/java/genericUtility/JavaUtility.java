package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is an Utility class which has the functionalities from Java library
 * @author Jaimini 
 * @version 25-06-02
 */
public class JavaUtility {
	/** 
	 * This is a generic method to generate random number for the given boundary
	 * @param bound
	 * @return 
	 */
	public int generateRandomNumber(int bound) {
		Random r=new Random();
		int num =r.nextInt(bound);
		return num;
	}
	
	
	/**
	 * This is a generic method to fetch Calendar details for the given pattern
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern) {
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;
		
	}

}
