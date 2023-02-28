
import java.util.Scanner;

public class Do_while {
    public static  void  main(String[] args){

        int s = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Kubini hisoblamoiqchi bo'lgan soningizni kiriting : ");
            int son = scanner.nextInt();
            System.out.println("kiritgan soningiz : "+son+" kiritgan soningizning kubi : "+ (Math.pow(son,3)));
            System.out.print("Dasturdan chiqish uchun 0 sonini kiriting. Boshqa bir sonning kubini hisoblamoqchi bo'lsangiz iltimos 1 sonnini kiriting :");
            s =scanner.nextInt();
        }while (s!=0);
        System.out.println("Programmamizning ishga tushishi to'xtatildi.");

    }
}
