package dbprogram;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbprogram.Tables.TreningsOkt;

public class getTables {
	
    public static TreningsOkt getTreningsokt(int treningsokt_id)  {      
        ResultSet rs = null;
        Connection connection = null;
        Statement statement = null; 
         
        TreningsOkt treningsokt = null;
        String query = "SELECT * FROM TreningsOkt WHERE treningsokt_id=" + treningsokt_id;
        try {           
            connection = JDBCMySQLConnection.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
             
            if (rs.next()) {
                treningsokt = new TreningsOkt();
                treningsokt.setIdTreningsOkt(rs.getInt("treningsokt_id"));
                treningsokt.setTidspunkt(rs.getDate("tidspunkt"));
                treningsokt.setVarighet(rs.getInt("varighet"));
                treningsokt.setKommentar(rs.getString("kommentar"));
                treningsokt.setForm(rs.getInt("form"));
                treningsokt.setPrestasjon(rs.getInt("prestasjon"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return treningsokt;
    }
    
    
    
    
}
	


