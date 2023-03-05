package Obyekt;

import Sinflar.kalit_sozlar;  

public class kalit_sozlar_main {

	public static void main(String[] args) {
		kalit_sozlar kalit_soz = new kalit_sozlar();
		
		/*Bu faylimiz ishga tushirilganda pastki qatordagi kodimiz hatolarsiz ishga tushadi chunki
		 *  Sinflar fayli ichkarisidagi kalit_sozlar faylimizda yosh1 o'zgaruvchini public kalit so'zi bilan berilgan edi.
		 *  Ya'ni public kalit so'zi bilan berilgan 'ozgaruvchilarni istalgan fayldan chaqirib, undan foydalana olamiz.  */
		kalit_soz.yosh1= 15;
		/*Bu faylimiz ishga tushirilganda pastki qatordagi kodimiz hato beradi chunki
		 *  Sinflar fayli ichkarisidagi kalit_sozlar faylimizda yosh2 o'zgaruvchi private kalit so'zi bilan berilgan edi.
		 *  Ya'ni private kalit so'zi bilan berilgan o'zgaruvchilarni boshqa fayllardan chaqirib foydalana olmaymiz  */
		kalit_soz.yosh2 = 15;
		/*Bu faylimiz ishga tushirilganda pastki qatordagi kodimiz hato beradi chunki
		 *  Sinflar fayli ichkarisidagi kalit_sozlar faylimizda yosh3 o'zgaruvchi protected kalit so'zi bilan berilgan edi.
		 *  Ya'ni protected kalit so'zi bilan berilgan o'zgaruvchilar, faqatgina shu fayl bilan bir fayl ichida bo'lgan boshqa bir java faylda chaqirib foydalana olar edik.
		 *  misol uchun kalit_sozlar sinfimiz joylashgan fayl ichida yani Sinflar fayli ichida boshqa bir kod fayli ochib yosh3 qiymatini chaqirib foydalana olamiz chunki ikkala faylimiz ham bir fayl joylashgan boladi.    */
		kalit_soz.yosh3 =15;
		
	}

}
