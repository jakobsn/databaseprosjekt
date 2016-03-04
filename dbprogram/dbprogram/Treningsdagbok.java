package dbprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Treningsdagbok {

	List<String> commands = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		Treningsdagbok dagbok = new Treningsdagbok();
		dagbok.createCommands();
        System.out.println("Velkommen til din digitale treningsdagbok. Skriv \"/hjelp\" for � se kommandoer");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        	System.out.println("Skriv inn kommando: ");
        	String command = br.readLine();
        	if(command.equals("/hjelp")){
        		dagbok.hjelp();
        	}
        	else if(command.equals("/nyOvelse")){
        		dagbok.addOvelse();
        	}
        	else{
        		System.out.println("Det er ikke en gyldig kommando");
        	}
        }
	}
	
	public void addOvelse() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Navn p� �velse: ");
		String navn = br.readLine();
        System.out.println("Beskrivelse: ");
        String beskrivelse = br.readLine();
        System.out.println("Styrke eller utholdenhet?");
        String type = br.readLine();
        
        int setInt = 0;
        int repetisjonerInt = 0;
        int belastningInt = 0;
        if(type.equals("styrke")){
        	System.out.println("Set: ");
        	String set = br.readLine();
        	setInt = Integer.parseInt(set);
        	System.out.println("Repetisjoner: ");
        	String repetisjoner = br.readLine();
        	repetisjonerInt = Integer.parseInt(repetisjoner);
        	System.out.println("Belastning: ");
        	String belastning = br.readLine();
        	belastningInt = Integer.parseInt(belastning);
        }
        
        else if(type.equals("utholdenhet")){
        	
        }
        
        System.out.println("ute eller inne? ");
        String miljo = br.readLine();
        
        String ovelseQuery = "INSERT INTO OVELSE (navn, beskrivelse)" + 
        "values (?, ?)";
        
        String styrkeQuery = "INSERT INTO STYRKE (set, repetisjoner, belastning, ovelse_fk)" + 
        "values (?, ?, ?, ?)";
       
        Connection connection = null;
        PreparedStatement ovelseStatement = null; 
        PreparedStatement styrkeStatement = null;
        try{
        	connection=JDBCMySQLConnection.getConnection();
        	
        	ovelseStatement=connection.prepareStatement(ovelseQuery);
        	ovelseStatement.setString(1, navn);
        	ovelseStatement.setString(2, beskrivelse);
        	
        	ovelseStatement.execute();
        	connection.close();
        	
        }catch (SQLException e){
        	e.printStackTrace();
        }
        
        String getOvelse_fk = "SELECT idOvelse FROM OVELSE WHERE navn="+navn;
        //finn fremmednøkkelen til øvelsen
        try{
        	int ovelse_fk = 
        	if(type.equals("styrke")){
        		styrkeStatement = connection.prepareStatement(styrkeQuery);
        		styrkeStatement.setInt(1, setInt);
        		styrkeStatement.setInt(2, repetisjonerInt);
        		styrkeStatement.setInt(3, belastningInt);
        	}
        	else if(type.equals("utholdenhet")){
        		
        	}
        }
        catch (SQLException e){
        	e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}

	public void createCommands() {
		// TODO Auto-generated method stub
		this.commands.add("/hjelp");
		this.commands.add("/nyOvelse");
	}

	public void hjelp() {
		// TODO Auto-generated method stub
		for(String kommando : this.commands){
		System.out.println(kommando);
		}
	}
	
	
	
}