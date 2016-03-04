package dbprogram.Tables;

public class Styrkemaal {
	
	private int idMaal;
	private int maal_sett;
	private int maal_repetisjoner;
	private int maal_belastning;
	private int styrke_fk;
	public int getIdMaal() {
		return idMaal;
	}
	public void setIdMaal(int idMaal) {
		this.idMaal = idMaal;
	}
	public int getMaal_sett() {
		return maal_sett;
	}
	public void setMaal_sett(int maal_sett) {
		this.maal_sett = maal_sett;
	}
	public int getMaal_repetisjoner() {
		return maal_repetisjoner;
	}
	public void setMaal_repetisjoner(int maal_repetisjoner) {
		this.maal_repetisjoner = maal_repetisjoner;
	}
	public int getMaal_belastning() {
		return maal_belastning;
	}
	public void setMaal_belastning(int maal_belastning) {
		this.maal_belastning = maal_belastning;
	}
	public int getStyrke_fk() {
		return styrke_fk;
	}
	public void setStyrke_fk(int styrke_fk) {
		this.styrke_fk = styrke_fk;
	}
	@Override
	public String toString() {
		return "Styrkemaal [idMaal=" + idMaal + ", maal_sett=" + maal_sett + ", maal_repetisjoner=" + maal_repetisjoner
				+ ", maal_belastning=" + maal_belastning + ", styrke_fk=" + styrke_fk + "]";
	}
	
	

}
