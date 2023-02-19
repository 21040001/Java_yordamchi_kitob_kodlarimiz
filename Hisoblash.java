import java.util.Random;
import java.util.Scanner;

public class Hisoblash {
    public static  void  main(String[] args){
        Random random = new Random();
        double hisobim = random.nextInt(2000);
        System.out.println("Hisobingizdagi pul miqdori = " + hisobim);

        System.out.print("Hisobingizdan yechmoqchi bo'lgan pul miqdoringizni kiring : ");
        Scanner scanner = new Scanner(System.in);
        double yechiladigan_pul = scanner.nextDouble();

        if (hisobim>yechiladigan_pul){
            hisobim -= yechiladigan_pul;
            System.out.println("Hisobingizdan yechib olingan pul miqdori = " + yechiladigan_pul);
            System.out.println("Hisobingizda qolgan pul miqdori = " + hisobim);
        }

    }
}
