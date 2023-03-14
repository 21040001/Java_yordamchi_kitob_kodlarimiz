package Sinflar;

public class Sotuvchi extends Foydalanuvchilar {
	String dokon_nomi;
	String savdo_turi;
		
	public Sotuvchi() {
		/* ust sinfda paremetr olmaydigan quruvchilarni chaqir */
		super();
		this.dokon_nomi="";
		this.savdo_turi="";
		
	}
		
	public Sotuvchi(Foydalanuvchilar k, String psavdo_turi, String pdokon_nomi ) {
		/* ust sinfdagi Foydlanuvchi turidagi parametr oladigan quruvchilarni chaqir*/
		super(k);
		this.savdo_turi=psavdo_turi;
		this.dokon_nomi=pdokon_nomi;
		
	}
	public Sotuvchi(Sotuvchi s) {
		super(s.getIsm(),s.getFamiliya(),s.getTugulgan_sana(),s.getJinsi());
		/*Yuqoridagi bir qator kodni bajaradigan ishini pastdagi 8 qatordagi kod ham bajara oladi*/
		//super.ism=s.getIsm();
		//this.ism=s.getIsm();
		//super.familiya=s.getFamiliya();
		//this.familiya=s.getFamiliya();
		//super.tugulgan_sana=s.getTugulgan_sana();
		//this.tugulgan_sana=s.getTugulgan_sana();
		//super.jinsi=s.getJinsi();
		//this.jinsi=s.getJinsi();
		
		this.dokon_nomi=s.getDokon_nomi();
		this.savdo_turi=s.getSavdo_turi();
	}
	public Sotuvchi(String pism, String pfamiliya,int ptugulgan_sana, String pjinsi, String pdokon_nomi, String psavdo_turi) {
		/* Ust sinfdagi 4 paremetr oladigan quruvchini chaqir*/
		super(pism,pfamiliya,ptugulgan_sana,pjinsi);
		this.dokon_nomi=pdokon_nomi;
		/* Pastki qatordagi kod, yuqori qatordagi kod bilan bir xil vazifa bajaradi*/
		//this.setDokon_nomi(pdokon_nomi);
		
		this.savdo_turi=psavdo_turi;
		/* Pastki qatordagi kod, yuqori qatordagi kod bilan bir xil vazifa bajaradi*/
		//this.setSavdo_turi(psavdo_turi);
	}

	public String getDokon_nomi() {
		return dokon_nomi;
	}

	public void setDokon_nomi(String dokon_nomi) {
		this.dokon_nomi = dokon_nomi;
	}

	public String getSavdo_turi() {
		return savdo_turi;
	}

	public void setSavdo_turi(String savdo_turi) {
		this.savdo_turi = savdo_turi;
	}
	
	
	
	}


