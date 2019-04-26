package otherAPI_System;

import java.io.ObjectInputStream.GetField;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
//		System.out.println(c); //java.util.GregorianCalendar[time=1519310280145,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=38,SECOND=0,MILLISECOND=145,ZONE_OFFSET=28800000,DST_OFFSET=0]
		
//		System.out.println(c.get(Calendar.YEAR)); //2018
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; //要加一
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "." + month + "." +day);
		
		test(2018);
		

	}

	public static void test(int year) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(year, 2, 1); //三月一日
		
		c.add(Calendar.DAY_OF_MONTH, -1); //日期偏移
		
		int month = c.get(Calendar.MONTH) + 1; //要加一
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(month + "." +day);
		
		
		
	}

}
