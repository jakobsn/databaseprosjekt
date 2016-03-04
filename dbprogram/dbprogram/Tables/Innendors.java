package dbprogram.Tables;

public class Innendors {
	
	private int idInnendors;
	private String luftKondisjon;
	private int tilskuere;
	private int ovelse_fk;
	private int paagang;
	
	public int getIdInnendors() {
		return idInnendors;
	}
	public void setIdInnendors(int idInnendors) {
		this.idInnendors = idInnendors;
	}
	public String getLuftKondisjon() {
		return luftKondisjon;
	}
	public void setLuftKondisjon(String luftKondisjon) {
		this.luftKondisjon = luftKondisjon;
	}
	public int getTilskuere() {
		return tilskuere;
	}
	public void setTilskuere(int tilskuere) {
		this.tilskuere = tilskuere;
	}
	public int getOvelse_fk() {
		return ovelse_fk;
	}
	public void setOvelse_fk(int ovelse_fk) {
		this.ovelse_fk = ovelse_fk;
	}
	public int getPaagang() {
		return paagang;
	}
	public void setPaagang(int paagang) {
		this.paagang = paagang;
	}
	
	@Override
	public String toString() {
		return "Innendors [idInnendors=" + idInnendors + ", luftKondisjon=" + luftKondisjon + ", tilskuere=" + tilskuere
				+ ", ovelse_fk=" + ovelse_fk + ", paagang=" + paagang + "]";
	}
	

}
