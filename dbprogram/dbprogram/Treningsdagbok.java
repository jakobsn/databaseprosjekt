package dbprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        		System.out.println("Det er ikke en gyldig kommando, skriv \"/hjelp\" for å få opp kommandoer.");
        	}
        }
	}
	
	public void addOvelse() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Navn p� �velse: ");
		String navn = reader.readLine();
        System.out.println("Beskrivelse: ");
        String beskrivelse = reader.readLine();
        System.out.println("Styrke eller utholdenhet?");
        String type = reader.readLine();
        System.out.println("Ute eller inne?");
        String miljo = reader.readLine();
        
        String ovelseQuery = "INSERT INTO OVELSE (navn, beskrivelse)" + 
        "values (?, ?)";
       
    	Connection connection=JDBCMySQLConnection.getConnection();
    	PreparedStatement ovelseStatement;
        int ovelse_fk = (Integer) null;

        //Legger inn øvelse i database
        try{
        	
        	ovelseStatement=connection.prepareStatement(ovelseQuery);
        	ovelseStatement.setString(1, navn);
        	ovelseStatement.setString(2, beskrivelse);
        	
        	ovelseStatement.execute();
        	
        	ResultSet rsOvelse_fk = ovelseStatement.getGeneratedKeys();
        	ovelse_fk = rsOvelse_fk.getInt(0);
        	
        	connection.close();
        	
        }catch (SQLException e){
        	e.printStackTrace();
        }
        if(type.equals("styrke")){
        	this.addStyrke(ovelse_fk);
        }
        else if(type.equals("utholdenhet")){
        	this.addUtholdenhet(ovelse_fk);
        }
        if(miljo.equals("ute")){
        	this.addUte(ovelse_fk);
        }
        else if(miljo.equals("inne")){
        	this.addInne(ovelse_fk);
        }
	}
	
	private void addInne(int ovelse_fk) {
		// TODO Auto-generated method stub
		
	}

	private void addUte(int ovelse_fk) {
		// TODO Auto-generated method stub
		
	}

	private void addUtholdenhet(int ovelse_fk) {
		
	}

	public void addStyrke(int ovelse_fk) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int setInt = 0;
        int repetisjonerInt = 0;
        int belastningInt = 0;

        System.out.println("Set: ");
        String set = br.readLine();
        setInt = Integer.parseInt(set);
        System.out.println("Repetisjoner: ");
        String repetisjoner = br.readLine();
        repetisjonerInt = Integer.parseInt(repetisjoner);
        System.out.println("Belastning: ");
        String belastning = br.readLine();
        belastningInt = Integer.parseInt(belastning);
        
        String styrkeQuery = "INSERT INTO STYRKE (set, repetisjoner, belastning, ovelse_fk)" + 
                "values (?, ?, ?, ?)";
    	Connection connection=JDBCMySQLConnection.getConnection();
    	PreparedStatement styrkeStatement;
        try{
       		styrkeStatement = connection.prepareStatement(styrkeQuery);
       		styrkeStatement.setInt(1, setInt);
       		styrkeStatement.setInt(2, repetisjonerInt);
       		styrkeStatement.setInt(3, belastningInt);
       	}catch (SQLException e){
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
		System.out.println("Mulige kommandoer:");
		System.out.println("==================");
		for(String kommando : this.commands){
		System.out.println(kommando);
		}
		System.out.println("==================");
	}
}