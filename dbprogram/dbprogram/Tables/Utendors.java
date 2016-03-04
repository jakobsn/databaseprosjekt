package dbprogram.Tables;

public class Utendors {
	
	 private int idUtendors;
	 private String vaertype;
	 private int temperatur;
	 private int ovelse_fk;
	
	
	public int getIdUtendors() {
		return idUtendors;
	}
	public void setIdUtendors(int idUtendors) {
		this.idUtendors = idUtendors;
	}
	public String getVaertype() {
		return vaertype;
	}
	public void setVaertype(String vaertype) {
		this.vaertype = vaertype;
	}
	public int getTemperatur() {
		return temperatur;
	}
	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}
	public int getOvelse_fk() {
		return ovelse_fk;
	}
	public void setOvelse_fk(int ovelse_fk) {
		this.ovelse_fk = ovelse_fk;
	}
	
	@Override
	public String toString() {
		return "Utendors [idUtendors=" + idUtendors + ", vaertype=" + vaertype + ", temperatur=" + temperatur
				+ ", ovelse_fk=" + ovelse_fk + "]";
	}
	 
	 

}
