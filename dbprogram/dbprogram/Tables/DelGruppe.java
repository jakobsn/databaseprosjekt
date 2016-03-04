package dbprogram.Tables;

public class DelGruppe {
	
	private int idDelGruppe;
	private String navn;
	private int idGruppe_fk;
	public int getIdDelGruppe() {
		return idDelGruppe;
	}
	public void setIdDelGruppe(int idDelGruppe) {
		this.idDelGruppe = idDelGruppe;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getIdGruppe_fk() {
		return idGruppe_fk;
	}
	public void setIdGruppe_fk(int idGruppe_fk) {
		this.idGruppe_fk = idGruppe_fk;
	}
	@Override
	public String toString() {
		return "DelGruppe [idDelGruppe=" + idDelGruppe + ", navn=" + navn + ", idGruppe_fk=" + idGruppe_fk + "]";
	}
	
	

}
