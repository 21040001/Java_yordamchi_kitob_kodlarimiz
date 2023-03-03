
public class Sinflar {

	//o'zgaruvchilar
    private String ism ;
    private String familiya;
    private int yosh;
    private String jinsi;

    //quruvchi metodlar
    public Sinflar() {
        ism = "";
        familiya = "";
        yosh =-1 ;
        jinsi="";
    }
    public Sinflar(String pism , String pfamiliya, int pyosh, String pjinsi){
        ism = pism;
        familiya =pfamiliya;
        yosh =pyosh;
        jinsi = pjinsi;
    }

    /* foydalanuvchi haqidagi malumotlarga
    erishishimizni saqlaydigan getter/setter metodlari*/

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamilya() {
        return familiya;
    }

    public void setFamilya(String familya) {
        this.familiya = familya;
    }

    public int getYosh() {
        return yosh;
    }

    public void setYosh(int yosh) {
        this.yosh = yosh;
    }

    public String getJinsi() {
        return jinsi;
    }

    public void setJinsi(String jinsi) {
        this.jinsi = jinsi;
    }
    // boshqa metodlar
    public String toliq_ismi(){
        return this.ism + " " + this.familiya;
    }
	
}
