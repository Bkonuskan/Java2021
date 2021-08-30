package day07_ifElse;

import java.util.Scanner;

public class C9_NestedIfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen sifre giriniz...");
		
		char sifreIlkHarf =scan.next().charAt(0);
		
		if (sifreIlkHarf>='a' && sifreIlkHarf<='z') {
			if(sifreIlkHarf== 'z') {
				System.out.println("Geçerli şifre");
			}else {
				System.out.println("Geçersiz şifre");
			}			
			
			
		}else if(sifreIlkHarf>='A' && sifreIlkHarf<='Z') {
			if(sifreIlkHarf== 'A') {
				System.out.println("Geçerli şifre");
			}else {
				System.out.println("Geçersiz şifre");}
			
							
			}else {
				System.out.println("Şifrenin ilk karakteri harf olmalı");
			}
			
						
			
		}
		
		
	}



