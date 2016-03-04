package dbprogram.Tables;

public class Gruppe {
	
	private String navn;
	private int idGruppe;
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getIdGruppe() {
		return idGruppe;
	}
	public void setIdGruppe(int idGruppe) {
		this.idGruppe = idGruppe;
	}
	@Override
	public String toString() {
		return "DelGruppe [navn=" + navn + ", idGruppe=" + idGruppe + "]";
	}
	
	

}
