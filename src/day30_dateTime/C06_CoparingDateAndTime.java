package day30_dateTime;

import java.time.LocalDate;

public class C06_CoparingDateAndTime {

	public static void main(String[] args) {
		LocalDate bugun=LocalDate.now();
        LocalDate date=LocalDate.of(2011,11,11);
        
        int fark=bugun.compareTo(date);
        System.out.println(bugun);
        System.out.println(date);
        System.out.println(fark);//1: karşılaştırılan iki tarihin en büyük parçaşının farkını verir
        

	}

}
