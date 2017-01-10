package com.dh.may.fifth;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SechDemo01 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		System.out.println("start");
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hello");
				
			}
		}, new Date(System.currentTimeMillis()+5000), 200);
	}

}
