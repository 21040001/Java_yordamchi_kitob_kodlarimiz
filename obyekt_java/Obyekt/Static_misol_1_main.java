package Obyekt;

import Sinflar.Static_misol_1;
public class Static_misol_1_main {

	public static void main(String[] args) {
		Static_misol_1 son1 = new Static_misol_1();
		Static_misol_1 son2 = new Static_misol_1();
		
		son1.statik_ozgaruvchi = 5;
		System.out.println("Son1 nomli obyekt ichkarisidagi statik o'zgaruvchining qiymati :"+son1.statik_ozgaruvchi);
		System.out.println("Son2 nomli obyekt ichkarisidagi statik o'zgaruvchining qiymati :"+son2.statik_ozgaruvchi);
		
		System.out.println("----------------------");
		
		son1.normal_ozgaruvchi=5;
		System.out.println("Son1 nomli obyekt ichkarisidagi normal o'zgaruvchining qiymati :"+son1.normal_ozgaruvchi);
		System.out.println("Son2 nomli obyekt ichkarisidagi normal o'zgaruvchining qiymati :"+son2.normal_ozgaruvchi);
		
		System.out.println("----------------------");
		
		 /* static o'zgaruvuchilarga sinf nomi orqali to'g'ridan to'gri erisha olamiz*/
		System.out.println("Sinf nomini foydalangan holda o'zgaruvchimizga to'ridan erishish : "+Static_misol_1.statik_ozgaruvchi);
	
		/*pstki qatorda yozilgan kodimiz ishlamaydi chunki biz bu ozgaruvhini qiymatini final sozi orqali ozgarmaz shaklga keltirgandik */
		//son1.ozgarmaz= 3.141;
	
	}

}
