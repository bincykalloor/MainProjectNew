package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
		public static String getCurrentDate(){  
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
		String formatteddate= sdf.format(date);
		return formatteddate;
}
}
		

