import java.util.Scanner;

public class while_skil {
    public static  void  main(String[] args){

        System.out.print("Son kiriting : ");
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();

        int s=0;
        while(s<son) {
            System.out.println("Son: "+s+" Bu sonning kvadrati:" +(s*s));
            s=s+1;
        }
    }
}
