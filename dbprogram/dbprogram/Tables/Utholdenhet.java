package dbprogram.Tables;

public class Utholdenhet {
	
	private int idUtholdenhet;
	private int lengde;
	private int varighet;
	private int ovelse_fk;
	
	public int getIdUtholdenhet() {
		return idUtholdenhet;
	}
	public void setIdUtholdenhet(int idUtholdenhet) {
		this.idUtholdenhet = idUtholdenhet;
	}
	public int getLengde() {
		return lengde;
	}
	public void setLengde(int lengde) {
		this.lengde = lengde;
	}
	public int getVarighet() {
		return varighet;
	}
	public void setVarighet(int varighet) {
		this.varighet = varighet;
	}
	public int getOvelse_fk() {
		return ovelse_fk;
	}
	public void setOvelse_fk(int ovelse_fk) {
		this.ovelse_fk = ovelse_fk;
	}
	
	@Override
	public String toString() {
		return "Utholdenhet [idUtholdenhet=" + idUtholdenhet + ", lengde=" + lengde + ", varighet=" + varighet
				+ ", ovelse_fk=" + ovelse_fk + "]";
	}
	
	
	
	
	
	

}
