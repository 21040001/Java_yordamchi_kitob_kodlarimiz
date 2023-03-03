package Obyekt;
import Sinflar.Foydalanuvchi;
public class obyekt_misol {

	public static void main(String[] args) {
		
		Foydalanuvchi foydalanuvchi_1 =new Foydalanuvchi();
		foydalanuvchi_1.setIsm("Akmal");
		foydalanuvchi_1.setFamilya("Roziboyev");
		foydalanuvchi_1.setYosh(21);
		foydalanuvchi_1.setJinsi("Erkak");
		
		/* birinchi foydalanuvchi ma'lumotlarini ekranga chiqarish: */
		System.out.println(foydalanuvchi_1.toliq_ismi());
		System.out.println("Yoshi: "+foydalanuvchi_1.getYosh());
		System.out.println("Jinsi: "+foydalanuvchi_1.getJinsi());
		
		System.out.println("-------------------------");
				
		/* boshqa bir foydalanuvchi ma'lumotlarini qoshish*/
		Foydalanuvchi foydalanuvchi_2 = new Foydalanuvchi("Shukurano","Abdurazzokova",20,"Ayol");
		
		/* ikkinchi foydalanuvchi ma'lumotlarini ekranga chiqarish: */
		System.out.println(foydalanuvchi_2.toliq_ismi());
		System.out.println("Yoshi: "+foydalanuvchi_2.getYosh());
		System.out.println("Jinsi: "+foydalanuvchi_2.getJinsi());
}}
