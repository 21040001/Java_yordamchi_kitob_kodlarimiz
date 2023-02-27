import java.util.Scanner;

public class Massiv {
    public static void main(String[] args){

        String [] ism = new String[3];
        int [] yosh = new int[3];
        String [] millati = new String[3];
        ism[0]= "Davronbek Abdurazzokov";
        yosh[0]=20;
        millati[0]="o'zbek";
        ism[1]= "Abubakir Jagitay";
        yosh[1]=24;
        millati[1]="Pullo";
        ism[2]= "Mert Arikan";
        yosh[2]=22;
        millati[2]="Turk";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kim haqida ma'lumotga ega bo'lmoqchi bo'lsangiz, iltimos ismini katta harf bilan boshlagan holda kiring.");
        String malumot = scanner.nextLine();

        switch (malumot){
            case "Davronbek":
                System.out.println("To'liq ismi: " +ism[0]);
                System.out.println("Yoshi: "+yosh[0]);
                System.out.println("Millati: "+millati[0]);
                break;
            case "Abubakir":
                System.out.println("To'liq ismi: " +ism[1]);
                System.out.println("Yoshi: "+yosh[1]);
                System.out.println("Millati: "+millati[1]);
                break;
            case "Mert":
                System.out.println("To'liq ismi: " +ism[2]);
                System.out.println("Yoshi: "+yosh[2]);
                System.out.println("Millati: "+millati[2]);
                break;
            default:
                System.out.println("kiritilgan shaxsga oid har qanday bir malumot mavjud emas. Iltimos tekshirib qaytadan kiring.");
        }

    }
}
