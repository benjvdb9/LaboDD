package main;

import java.util.*;
import java.text.*;
import java.util.concurrent.*;

public class clock_code {
	
	private static boolean notif;
	
	public static void main(String args[]) {
		
		boolean notif = false;
		String Time = giveTime();
		
		System.out.println(notif);
		toggleNotifications();
		System.out.println(notif);
		
		if (notif) 
		{
			while (notif)
			{
				System.out.println("It is currently " + Time);
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Delay interrupted");
				}
			}
		}
		else if (notif == false)
		{
			System.out.println("It is currently " + Time);
		}
	}
	
	public static void toggleNotifications() {
		
		if (notif)
		{
			notif = false;
		}
		else if (notif == false)
		{
			notif = true;
		}
		else
		{
			System.out.println("Notif not defined");
		}
		
	}
	
	public static String giveTime() 
	{
		Date dnow = new Date();
		SimpleDateFormat ft =
		new SimpleDateFormat("hh:mm");
		
		String Time = ft.format(dnow);
		return Time;
	}
	
	public static boolean getNotif()
	{
		return notif;
	} 

}
