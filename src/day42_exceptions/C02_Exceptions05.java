package day42_exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_Exceptions05 {
	public static void main(String[] args) {

		/*
		 * Eger handle edilecek excepsions'lar arsinda parent - child iliskisi varsa
		 * parent class excepsion'u creat edilip child class excepsion'u olmadan da code
		 * calisir ancak: olumlu durum : tek catch body ile tum exceptions handle
		 * edileblir olumsuz durum : bir hata durumunda hatanin turu vd verileri vs
		 * ulasimayacagi icin handle edilme imkani olmaz
		 */
		try {
			FileInputStream fis = new FileInputStream(
					"/Users/yeni/eclipse-workspace/javaSummer2021Tr/src/_14_Exceptions/file");
			fis.close();// fis obj close edildi
			int i = 0;

			while ((i = fis.read()) != -1) {
				System.out.print((char) (i));
			}
		}

		catch (IOException e) {// I :input O:output dosyalarla ilgili genel yazma ve okuma sorunlari ile handle
								// eder
			// e.printStackTrace();//daha cok kullanilir cunku hatanin tum verisini verir
			// handle kolayligi saglar
			System.out.println(e.getMessage());// hata mesajini yazdirir
		}

		System.out.println();
		System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
	}
}
