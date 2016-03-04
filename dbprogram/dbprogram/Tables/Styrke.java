package dbprogram.Tables;

public class Styrke {
	
	private int idStyrke;
	private String navn;
	private int sett;
	private int repetisjoner;
	private int belastning;
	private int ovelse_fk;
	public int getIdStyrke() {
		return idStyrke;
	}
	public void setIdStyrke(int idStyrke) {
		this.idStyrke = idStyrke;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getSett() {
		return sett;
	}
	public void setSett(int sett) {
		this.sett = sett;
	}
	public int getRepetisjoner() {
		return repetisjoner;
	}
	public void setRepetisjoner(int repetisjoner) {
		this.repetisjoner = repetisjoner;
	}
	public int getBelastning() {
		return belastning;
	}
	public void setBelastning(int belastning) {
		this.belastning = belastning;
	}
	public int getOvelse_fk() {
		return ovelse_fk;
	}
	public void setOvelse_fk(int ovelse_fk) {
		this.ovelse_fk = ovelse_fk;
	}
	@Override
	public String toString() {
		return "Styrke [idStyrke=" + idStyrke + ", navn=" + navn + ", sett=" + sett + ", repetisjoner=" + repetisjoner
				+ ", belastning=" + belastning + ", ovelse_fk=" + ovelse_fk + "]";
	}
	
	
	

}
