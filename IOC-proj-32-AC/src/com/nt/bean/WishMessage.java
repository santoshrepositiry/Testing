package com.nt.bean;

import java.util.Date;

public class WishMessage {
	
	private String msg;
	private Date date;
	private int hour;
	
	public void getMessage(String name) {
		date=new Date();
		hour=date.getHours();
		if(hour<12)
			msg="GOOD MORNING";
		else
			msg="GOOD EVENING";
		
		System.out.println(msg+" "+name);
	}
	

}
