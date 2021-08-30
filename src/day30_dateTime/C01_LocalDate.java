package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		LocalDate tarih=LocalDate.now();
		System.out.println("Bugünün tarihi : "+ tarih);
		System.out.println("Bugünden 21 gün sonrası tarihi : "+ tarih.plusDays(21));//2021-08-23
		System.out.println("Bugünden 3 yıl sonrası tarihi : "+ tarih.plusYears(3));//2024-08-02
		System.out.println("Bugünden 3 gün 5 ay 2 yıl sonrası tarihi : "
		+ tarih.plusDays(3).plusMonths(5).plusYears(2));//2024-01-05
		System.out.println("Bugünden 40 gün öncesi tarihi : "+ tarih.minusDays(40));//2021-06-23
		
		System.out.println("Bugünden 5 yıl öncesinin 2 ay sonrasının 3 hafta ertesi : " 
		+tarih.minusYears(5).plusMonths(2).plusWeeks(3));
		System.out.println(tarih.getDayOfMonth());
		System.out.println(tarih.getDayOfWeek());
		System.out.println(tarih.getMonthValue());
		System.out.println(tarih.getMonth());
		
		LocalDate dogumGunu=LocalDate.of(1979,8, 24);
		System.out.println("Benim Doğum  tarihim : "+ dogumGunu);
		System.out.println("Doğum  tarihi : "+ dogumGunu.getDayOfWeek());//FRIDAY
		
		
		
	}

}
