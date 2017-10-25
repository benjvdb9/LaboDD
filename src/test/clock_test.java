package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Test;
import main.clock_code;

public class clock_test {
	
	@Test
	public void testTime()
	{
		Date dnow = new Date(); //test
		SimpleDateFormat ft =
		new SimpleDateFormat("hh:mm");
		String expTime = ft.format(dnow);
		
		assertEquals(expTime, clock_code.giveTime());
	}
	
	@Test
	public void testNotification()
	{
		boolean notif1 = clock_code.getNotif();
		clock_code.toggleNotifications();
		boolean notif2 = clock_code.getNotif();
		
		assertThat(notif1, IsNot.not(IsEqual.equalTo(notif2)));
	}

}