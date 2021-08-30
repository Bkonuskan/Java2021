package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		LocalTime zaman=LocalTime.now();
		System.out.println("Local saat : "+ zaman);//20:37:00.999831500
		LocalTime time1=LocalTime.of(12, 35, 23);
		System.out.println("Local saat : "+time1);
		System.out.println("Şu zamandan 2 saat ileri 34 dk geri 45 sn ileri :"+zaman.plusHours(2).minusMinutes(34).plusSeconds(45));

		for (int i = 0; i < 10000; i++) {
			System.out.print(i);
			
		}
		LocalTime zaman2=LocalTime.now();
		System.out.println();
		System.out.println(zaman2);
		
		ZonedDateTime ülke=ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(ülke);
		
		
	}

}
