package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate tarih=LocalDate.now();
        LocalDate date=LocalDate.of(2020,5,15);
        /*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : yılın tamamını
         * y : yılın tamamını
         * M : ay sırasını verir TEMMUZ için : 7
         * MM:  ay sırasını veriri TEMMUZ için : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamamını verir
         */
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yy");
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd*M*yyyy");
        
        System.out.println(dtf.format(tarih));//02/8/21
        System.out.println(dtf1.format(date));//15/05/20
        System.out.println(dtf2.format(tarih));//02/Aug./21
        System.out.println(dtf3.format(date));//15*5*2020
        
        //Kaç yaşındasın
        LocalDate dt=LocalDate.of(2011, 11, 11);
        System.out.println("bugunun tarihi : "+tarih);
        System.out.println("Bahar dt :"+dt);
        Period yasim=Period.between(dt, tarih);
        System.out.println("Bahar'ın yaşı : "+yasim);
        System.out.println(yasim.getYears());

	}

}
