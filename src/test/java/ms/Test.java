package ms;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class Test {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse("2016-01-31 00:00:00");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		c.add(Calendar.MONTH, 1);
		
		System.out.println(sdf.format(c.getTime()));
		
		System.out.println(Integer.MAX_VALUE);
		
		 System.out.println( (int)Math.ceil(10/3));
		 System.out.println( new BigDecimal(3.53).setScale(0, BigDecimal.ROUND_HALF_UP).intValue());
		 
		 
	}

}
