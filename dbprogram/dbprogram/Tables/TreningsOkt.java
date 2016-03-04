package dbprogram.Tables;

import java.util.Date;

public class TreningsOkt {
     
    private int idTreningsOkt;
    private Date tidspunkt;
    private int varighet;
    private String kommentar;
    private int form;
    private int prestasjon;
 

    public int getIdTreningsOkt() {
		return idTreningsOkt;
	}


	public void setIdTreningsOkt(int idTreningsOkt) {
		this.idTreningsOkt = idTreningsOkt;
	}


	public Date getTidspunkt() {
		return tidspunkt;
	}


	public void setTidspunkt(Date tidspunkt) {
		this.tidspunkt = tidspunkt;
	}


	public int getVarighet() {
		return varighet;
	}


	public void setVarighet(int varighet) {
		this.varighet = varighet;
	}


	public String getKommentar() {
		return kommentar;
	}


	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}


	public int getForm() {
		return form;
	}


	public void setForm(int form) {
		this.form = form;
	}


	public int getPrestasjon() {
		return prestasjon;
	}


	public void setPrestasjon(int prestasjon) {
		this.prestasjon = prestasjon;
	}


	//toString()
    @Override
    public String toString() {
        return "TreningsOkt [idTreningsOkt=" + idTreningsOkt + ", tidspunkt=" + tidspunkt + ", kommentar="
                + kommentar + ", form=" + form + ", prestasjon=" + prestasjon + "]";
    }       
}
