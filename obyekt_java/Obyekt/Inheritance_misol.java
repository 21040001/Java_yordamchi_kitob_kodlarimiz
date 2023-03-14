package Obyekt;

import Sinflar.Foydalanuvchilar;
import Sinflar.Sotuvchi;
import Sinflar.Xaridor;

public class Inheritance_misol {

	public static void main(String[] args) {
		Foydalanuvchilar foydalanuvchi_1 = new Foydalanuvchilar();
		Foydalanuvchilar foydalanuvchi_2 = new Foydalanuvchilar();
		Foydalanuvchilar foydalanuvchi_3 = new Foydalanuvchilar();
		
		// 1-foydalanuvchi
		foydalanuvchi_1.setIsm("Davronbek");
		foydalanuvchi_1.setFamiliya("Abdurazzokov");
		foydalanuvchi_1.setTugulgan_sana(2003);
		foydalanuvchi_1.setJinsi("Erkak");
		
		// 2-foydalanuvchi
		foydalanuvchi_2.setIsm("Sherzodbek");
		foydalanuvchi_2.setFamiliya("Sultonov");
		foydalanuvchi_2.setTugulgan_sana(2003);
		foydalanuvchi_2.setJinsi("Erkak");
		
		// 3-foydalanuvchi
		foydalanuvchi_3.setIsm("Guli");
		foydalanuvchi_3.setFamiliya("Abdullayeva");
		foydalanuvchi_3.setTugulgan_sana(2005);
		foydalanuvchi_3.setJinsi("Ayol");
		
		// 2- kishidan Sotuvchi obyekti tayyorlaymiz
		Sotuvchi sotuvchi_1 = new Sotuvchi(foydalanuvchi_2,"Oziq-ovqat","Do'kon nomi Oila");
		
		// 3-kishidan ham sotuvchi obyekti tayyorlaymiz
		Xaridor xaridor_1 = new Xaridor(foydalanuvchi_3,"Manzili-Fargona", 12345);
		
		//tur o'zgartisrishlar
		//past sinfdan bir obyekt ust sinfdagiga almashtirilishi mumkin
		
		Foydalanuvchilar foydalanuvchi_4=(Foydalanuvchilar)sotuvchi_1;

		Foydalanuvchilar foydalanuvchi_5=(Foydalanuvchilar)xaridor_1;

		//tur o'zgartisrishlar
		/*ust sinfdan bir obyekt past sinfdagiga almashtirila olinmaydi bu sababdan pastki qatordagi kod ishlamaydi*/
		
		// Sotuvchi sotuvchi = (Sotuvchi)foydalanuvchi_1;
		
		// Ma'lumotlarni ekranga chiqarish
		
		malumotlarni_yoz(foydalanuvchi_1);
		malumotlarni_yoz(foydalanuvchi_2);
		malumotlarni_yoz(foydalanuvchi_3);
		malumotlarni_yoz(foydalanuvchi_4);
		malumotlarni_yoz(sotuvchi_1);
		malumotlarni_yoz(xaridor_1);
		
		System.out.println("-- instanceof qarshilashtirma javoblari--");
		instanceoftest(foydalanuvchi_1, sotuvchi_1, xaridor_1);
		System.out.println("---------------");
		
	}
	public static void malumotlarni_yoz(Object s) {
		System.out.println("---------------");
		
		if(s instanceof Sotuvchi) {
			/* Agar objekt Sotuvchi turida bo'lsa, Sotuvchining ma'lumotlarini chiqar.*/
			Sotuvchi otuvchi = (Sotuvchi)s;
			System.out.println(otuvchi.getIsm());
			System.out.println(otuvchi.getFamiliya());
			System.out.println(otuvchi.getTugulgan_sana());
			System.out.println(otuvchi.getJinsi());
			System.out.println(otuvchi.getDokon_nomi());
			System.out.println(otuvchi.getSavdo_turi());
			
		}
		else if(s instanceof Xaridor) {
			/* Agar objekt Xaridor turida bo'lsa, Xaridorning ma'lumotlarini chiqar.*/
			Xaridor otuvchi= (Xaridor)s;
			System.out.println(otuvchi.getIsm());
			System.out.println(otuvchi.getFamiliya());
			System.out.println(otuvchi.getTugulgan_sana());
			System.out.println(otuvchi.getJinsi());
			System.out.println(otuvchi.getHisobraqami());
			System.out.println(otuvchi.getManzil());
		}
		else if(s instanceof Foydalanuvchilar) {
			/* Agar objekt Foydalanuvchilar turida bo'lsa, Foydalanuvchilarning ma'lumotlarini chiqar.*/
			Foydalanuvchilar otuvchi= (Foydalanuvchilar)s;
			System.out.println(otuvchi.getIsm());
			System.out.println(otuvchi.getFamiliya());
			System.out.println(otuvchi.getTugulgan_sana());
			System.out.println(otuvchi.getJinsi());
			
		}
	}
	
	public static void instanceoftest(Foydalanuvchilar k, Sotuvchi s, Xaridor x) {
		if (k instanceof Foydalanuvchilar) {
			System.out.println("k obyekti Foydlanuvchilar sinifi uchun bir misol");
		}
		else {
			System.out.println("k obyekti Foydlanuvchilar sinifi uchun bir misol emas");
		}
		if (s instanceof Foydalanuvchilar) {
			System.out.println("s obyekti Foydlanuvchilar sinifi uchun bir misol");
		}
		else {
			System.out.println("s obyekti Foydlanuvchilar sinifi uchun bir misol emas");
		}
		if (x instanceof Foydalanuvchilar) {
			System.out.println("x obyekti Foydlanuvchilar sinifi uchun bir misol");
		}
		else {
			System.out.println("x obyekti Foydlanuvchilar sinifi uchun bir misol emas");
		}
		if (k instanceof Sotuvchi) {
			System.out.println("k obyekti Sotuvchi sinifi uchun bir misol");
		}
		else {
			System.out.println("k obyekti Sotuvchi sinifi uchun bir misol emas");
		}
		if (k instanceof Xaridor) {
			System.out.println("k obyekti Xaridor sinifi uchun bir misol");
		}
		else {
			System.out.println("k obyekti Xaridor sinifi uchun bir misol emas");
		
	}

}
	
	

}

