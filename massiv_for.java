

import java.util.Scanner;

public class massiv_for {

    public static void main(String[] args){
        Scanner gr=new Scanner(System.in);
        Scanner hr=new Scanner(System.in);

        int[][] matris=new int[3][3];
        int[][] matris2=new int[3][3];

        for (int i=0;i<3;i++){
            for(int k=0;k<3;k++){
                System.out.print("Birinchi matritsaning"+i+" ustun "+k+" elemanini gir : ");
                int a= gr.nextInt();
                matris[i][k]=a;
            }
        }
        for (int h=0;h<3;h++){
            for(int l=0;l<3;l++){
                System.out.print("Ikkinchi matritsaning "+h+" ustun "+l+" elemanini gir : ");
                int b= hr.nextInt();
                matris2[h][l]=b;
            }
        }
        int r=(matris[0][0]*matris2[0][0])+(matris[0][0]*matris2[0][1])+(matris[0][0]*matris2[0][2]);
        int b=(matris[1][0]*matris2[1][0])+(matris[1][0]*matris2[1][1])+(matris[1][0]*matris2[1][2]);
        int c=(matris[2][0]*matris2[2][0])+(matris[2][0]*matris2[2][1])+(matris[2][0]*matris2[2][2]);
        int k=(matris[0][1]*matris2[0][0])+(matris[0][1]*matris2[0][1])+(matris[0][1]*matris2[0][2]);
        int q=(matris[1][1]*matris2[1][0])+(matris[1][1]*matris2[1][1])+(matris[1][1]*matris2[1][2]);
        int p=(matris[2][1]*matris2[2][0])+(matris[2][1]*matris2[2][1])+(matris[2][1]*matris2[2][2]);
        int j=(matris[0][2]*matris2[0][0])+(matris[0][2]*matris2[0][1])+(matris[0][2]*matris2[0][2]);
        int m=(matris[1][2]*matris2[1][0])+(matris[1][2]*matris2[1][1])+(matris[1][2]*matris2[1][2]);
        int v=(matris[2][2]*matris2[2][0])+(matris[2][2]*matris2[2][1])+(matris[2][2]*matris2[2][2]);
        System.out.println("["+r+" "+b+" "+c+"]");
        System.out.println("["+k+" "+q+" "+p+"]");
        System.out.println("["+j+" "+m+" "+v+"]");

    }
}
