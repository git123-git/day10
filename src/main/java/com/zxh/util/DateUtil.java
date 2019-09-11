package com.zxh.util;

import java.util.Date;

public class DateUtil {

	
	//根据传入的日期获取年龄
	@SuppressWarnings("deprecation")
	public static int getAge (Date src) {
		Date date = new Date();
		int year = date.getYear();
		
		return year;
	}
	
	//根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	public static Date getDateByMonthInit (Date src) {
		Date date = new Date();
		int year = date.getYear();
		
		return year;
	}
	
	//:根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年
	public static Date getDateByMonthLast(Date src) {
		
		Date date = new Date();
		int year = date.getYear();
		
		return year;
	}
	
	//求未来日期离今天还剩的天数
	public static int getDaysByFuture (Date future) {
		Date date = new Date();
		int year = date.getYear();
		
		return year;
		
	}
	

}
