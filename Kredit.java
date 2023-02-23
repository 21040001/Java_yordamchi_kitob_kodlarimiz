import java.util.Scanner;

public class Hisoblash {
    public static  void  main(String[] args){


        System.out.print("Yoshingizni kiring : ");
        Scanner scanner = new Scanner(System.in);
        double yosh = scanner.nextDouble();

        if (yosh<=18 ){
            System.out.println("Voyaga yetmaganiz sababli kredit ololmaysiz.");
        }
        else if(18 < yosh && yosh<= 30 ){
           System.out.println("Maksimum 50000000 so'm miqdorda kredit ololasiz.");
        }
        else if(30 < yosh && yosh<= 45 ){
            System.out.println("Maksimum 40000000 so'm miqdorda kredit ololasiz.");
        }
        else if(45 < yosh ){
            System.out.println("Maksimum 20000000 so'm miqdorda kredit ololasiz.");
        }
    }
}
