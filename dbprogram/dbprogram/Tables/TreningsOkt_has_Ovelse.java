package dbprogram.Tables;

public class TreningsOkt_has_Ovelse {
	
	private int TreningsOkt_idTreningsOkt;
	private int Ovelse_idOvelse;
	public int getTreningsOkt_idTreningsOkt() {
		return TreningsOkt_idTreningsOkt;
	}
	public void setTreningsOkt_idTreningsOkt(int treningsOkt_idTreningsOkt) {
		TreningsOkt_idTreningsOkt = treningsOkt_idTreningsOkt;
	}
	public int getOvelse_idOvelse() {
		return Ovelse_idOvelse;
	}
	public void setOvelse_idOvelse(int ovelse_idOvelse) {
		Ovelse_idOvelse = ovelse_idOvelse;
	}
	@Override
	public String toString() {
		return "TreningsOkt_has_Ovelse [TreningsOkt_idTreningsOkt=" + TreningsOkt_idTreningsOkt + ", Ovelse_idOvelse="
				+ Ovelse_idOvelse + "]";
	}
	
	

}
