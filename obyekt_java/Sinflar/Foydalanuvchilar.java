package Sinflar;

public class Foydalanuvchilar {
	String ism;
	String familiya;
	int tugulgan_sana;
	String jinsi;
	
	public Foydalanuvchilar(){
		ism="";
		familiya="";
		tugulgan_sana=0;
		jinsi="";
	}
	public Foydalanuvchilar(String pism , String pfamiliya, int ptugulgan_sana, String pjinsi) {
		this.ism = pism;
		//this.setIsm(pism);
		this.familiya=pfamiliya;
		//this.setFamiliya(pfamiliya);
		this.tugulgan_sana=ptugulgan_sana;
		//this.setTugulgan_sana(ptugulgan_sana);
		this.jinsi=pjinsi;
		//this.setJinsi(pjinsi);
	}
	public Foydalanuvchilar(Foydalanuvchilar k) {
	/* Pastki 3 qatordagi kod bir xil */
		this.setIsm(k.getIsm());
		//this.setIsm(k.ism);
		//this.ism=k.ism;
		
	/* Pastki 3 qatordagi kod bir xil */	
		this.setFamiliya(k.getFamiliya());
		//this.setFamiliya(k.familiya);
		//this.familiya=k.familiya;
		
	/* Pastki 3 qatordagi kod bir xil */
		this.setTugulgan_sana(k.getTugulgan_sana());
		//this.setTugulgan_sana(k.tugulgan_sana);
		//this.tugulgan_sana=k.tugulgan_sana;
	/* Pastki 3 qatordagi kod bir xil */
		this.setJinsi(k.getJinsi());
		//this.setJinsi(k.jinsi);
		//this.tugulgan_sana=k.tugulgan_sana;
	}
	
	public String getIsm() {
		return ism;
	}

	public void setIsm(String ism) {
		this.ism = ism;
	}

	public String getFamiliya() {
		return familiya;
	}

	public void setFamiliya(String familiya) {
		this.familiya = familiya;
	}

	public int getTugulgan_sana() {
		return tugulgan_sana;
	}

	public void setTugulgan_sana(int tugulgan_sana) {
		this.tugulgan_sana = tugulgan_sana;
	}

	public String getJinsi() {
		return jinsi;
	}

	public void setJinsi(String jinsi) {
		this.jinsi = jinsi;
	}

	
}
