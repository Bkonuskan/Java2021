package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("aktual tarih ve zaman : "+ldt);//2021-08-02T22:04:25.286958
        
        LocalDate d=LocalDate.of(2016, 1, 10);
        LocalTime t=LocalTime.of(13, 30);
        
        LocalDateTime ldt1=LocalDateTime.of(d, t);
        System.out.println(d);
        System.out.println(t);//13:30
        System.out.println(ldt1);//2016-01-10T13:30
        
        System.out.println(ldt.getHour());//22

	}

}
