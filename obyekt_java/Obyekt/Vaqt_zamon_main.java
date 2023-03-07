package Obyekt;

import Sinflar.Zamon_Vaqt;
import java.sql.Timestamp;

public class Vaqt_zamon_main {

	public static void main(String[] args) {
		Timestamp ts =new Timestamp((new java.util.Date()).getTime());
		/*statik metodlarni chaqirishimiz uchun new operatoridan foydalanishga kerak yo'q 
	metodlarga sinf nomi bilan erisha olamoz.	
*/
		String natija1 = Zamon_Vaqt.kunni_korsat(ts);
		String natija2 = Zamon_Vaqt.sananikorsat(ts);
		String natija3 = Zamon_Vaqt.vaqtni_korsat(ts);
		
		System.out.println("Bugunki kun : "+natija1);
		System.out.println("Bugunki sana : "+natija2);
		System.out.println("Soat : "+natija3);
	}

}
