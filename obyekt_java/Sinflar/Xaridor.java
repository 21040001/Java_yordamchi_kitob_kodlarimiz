package Sinflar;

public class Xaridor extends Foydalanuvchilar{
	String manzil;
	int hisobraqami;
	
	public Xaridor() {
		super();
		this.manzil="";
		this.hisobraqami=0;
	
	}
	public Xaridor(Foydalanuvchilar k, String pmanzil, int phisobraqami) {
		super(k);
		this.manzil=pmanzil;
		this.hisobraqami=phisobraqami;
	}
	public Xaridor(Xaridor x) {
		super(x.getIsm(),x.getFamiliya(),x.getTugulgan_sana(),x.getJinsi());
		this.manzil=x.getManzil();
		this.hisobraqami=x.getHisobraqami();
		
	}
	public Xaridor(String pism,String pfamiliya, int ptugulgan_sana, String pjinsi, String pmanzil, int phisobraqami) {
		super(pism,pfamiliya,ptugulgan_sana,pjinsi);
		manzil=pmanzil;
		hisobraqami=phisobraqami;
	}
	
	public String getManzil() {
		return manzil;
	}
	public void setManzil(String manzil) {
		this.manzil = manzil;
	}
	public int getHisobraqami() {
		return hisobraqami;
	}
	public void setHisobraqami(int hisobraqami) {
		this.hisobraqami = hisobraqami;
	}
	
	
}
