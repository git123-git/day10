package com.zxh.util;

import java.util.Date;

public class DateUtil {

	
	//���ݴ�������ڻ�ȡ����
	@SuppressWarnings("deprecation")
	public static int getAge (Date src) {
		Date date = new Date();
		int year = date.getYear();
		
		return year;
	}
	
	//���ݴ���Ĳ�����ȡ�����ڵ��³����ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-01 00:00:00��
	public static Date getDateByMonthInit (Date src) {
		Date date = new Date();
		int year = date.getYear();
		
		return year;
	}
	
	//:���ݴ���Ĳ�����ȡ����������ĩ���ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-30 23:59:59����ע���´���С�Լ�����
	public static Date getDateByMonthLast(Date src) {
		
		Date date = new Date();
		int year = date.getYear();
		
		return year;
	}
	
	//��δ����������컹ʣ������
	public static int getDaysByFuture (Date future) {
		Date date = new Date();
		int year = date.getYear();
		
		return year;
		
	}
	

}
