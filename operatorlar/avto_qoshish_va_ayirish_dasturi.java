public class avto_qoshish_va_ayirish_dasturi {
    public static void main(String[] args){
        int x = 12;
        int y = 77;
        //farqlarni ko'rishni boshladik

        int x_1 = ++x;
        /* yuqoridagi qatorda shunday dedik
        avval x qiymatiga 1 qo'sh keyin esa
        uni x_1 nomli o'zgaruvchiga qiymat sifatida ber.
         */
        int y_1 = --y;
        /* yuqoridagi kod qatorimizda shunday dedik
        avval y qiymatidan 1 ayir keyin esa
        uni y_1 nomli o'zgaruvchiga qiymat sifatida ber.
         */
        System.out.println("x="+x+", y="+y+",x_1="+x_1+", y_1="+y_1);

        int x_2 = x++;
        /* yuqoridagi kod qatorimizda dasturga shunday
         buyruq berdik: avval x nomli o'zgaruvchi qiymatini
         x_2 nomli o'zgaruvchi qiymati sifatida ol keyin esa
         x nomli o'zgaruvchi qiymatiga 1 qoshib qo'y
         */
        int y_2 = y--;
        /* yuqoridagi kod qatorimizda dasturga shunday
         buyruq berdik: avval y nomli o'zgaruvchi qiymatini
         y_2 nomli o'zgaruvchi qiymati sifatida ol keyin esa
         y nomli o'zgaruvchi qiymatidan 1 ayirib  qo'y
         */
        System.out.println("x="+x+", y="+y+",x_2="+x_2+", y_2="+y_2);
    }
}
