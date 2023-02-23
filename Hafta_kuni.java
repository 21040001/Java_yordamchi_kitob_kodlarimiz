import java.util.Scanner;

public class Hafta_kuni {
    public static  void  main(String[] args){


        System.out.print("1 va 7 orasida bo'lgan bir son kiring : ");
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();

        switch (son){
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seyshanba ");
                break;
            case 3:
                System.out.println("Chorshamba ");
                break;
            case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println("Juma");
                break;
            case 6:
                System.out.println("Shanba");
                break;
            case 7:
                System.out.println("Yakshanba");
                break;
            default:
                System.out.println("Kirgan soningiz 1 va 7 orasidagi bir son emas");
                break;

        }


    }
}
