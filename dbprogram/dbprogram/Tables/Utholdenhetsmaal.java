package dbprogram.Tables;

public class Utholdenhetsmaal {
	
	private int idUtholdenhetmaal;
	private int maal_lengde;
	private int maal_varighet;
	private int utholdenhet_fk;
	public int getIdUtholdenhetmaal() {
		return idUtholdenhetmaal;
	}
	public void setIdUtholdenhetmaal(int idUtholdenhetmaal) {
		this.idUtholdenhetmaal = idUtholdenhetmaal;
	}
	public int getMaal_lengde() {
		return maal_lengde;
	}
	public void setMaal_lengde(int maal_lengde) {
		this.maal_lengde = maal_lengde;
	}
	public int getMaal_varighet() {
		return maal_varighet;
	}
	public void setMaal_varighet(int maal_varighet) {
		this.maal_varighet = maal_varighet;
	}
	public int getUtholdenhet_fk() {
		return utholdenhet_fk;
	}
	public void setUtholdenhet_fk(int utholdenhet_fk) {
		this.utholdenhet_fk = utholdenhet_fk;
	}
	@Override
	public String toString() {
		return "Utholdenhetsmaal [idUtholdenhetmaal=" + idUtholdenhetmaal + ", maal_lengde=" + maal_lengde
				+ ", maal_varighet=" + maal_varighet + ", utholdenhet_fk=" + utholdenhet_fk + "]";
	}
	
	

}
