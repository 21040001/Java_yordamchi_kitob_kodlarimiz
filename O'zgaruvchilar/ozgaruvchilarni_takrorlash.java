public class ozgaruvchilarni_takrorlash {
    public static void main(String[] args) {

        byte byte_turi = 6;
        short short_turi = 12;
        /* 2 dona byte va short turida o'zgaruvchi tanitdik va qiymatlarini berdik */
        System.out.println("byte turidagi o'zgaruvchi ="+ byte_turi);
        System.out.println("short turidagi o'zgaruvchi ="+ short_turi);

        int int_turi=123;
        long long_turi= 64765;
        System.out.println("int turidagi o'zgaruvchi ="+ int_turi);
        System.out.println("long turidagi o'zgaruvchi ="+ long_turi);

        int x = byte_turi+short_turi;
        System.out.println("Byte + short= " +x);

        float float_turi= 12.4f;
        double double_turi= 12.34;
        System.out.println("float turidagi o'zgaruvchi="+float_turi);
        System.out.println("double turidagi o'zgaruvchi="+double_turi);

        double y=float_turi+double_turi;
        System.out.println("float + double = "+y);

        String string_turi="ITIMUS_Academy";
        char char_turi='$';
        /* String turidagi bir o'zgaruvchiga qiymat berishda juft qoshtirnoqlardan doydalaniladi yani "ITIMUS_Academy "
        char turidagi bir o'zgaruvchiga qiymat berishda birli bo'lgan qoshtirnoqlardan doydalaniladi yani '$ '
         */
        System.out.println("String turidagi o'zgaruvchi = "+string_turi);
        System.out.println("char turidagi o'zgaruvchi = "+char_turi);



}
}
