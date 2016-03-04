package dbprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Treningsdagbok {

	List<String> commands = new ArrayList<String>();
	
	public static void main(String[] args) {
		Treningsdagbok dagbok = new Treningsdagbok();
		dagbok.createCommands();
        BufferedReader command = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Velkommen til din digitale treningsdagbok. Skriv \"/hjelp\" for å se kommandoer");
        if(command.equals("/hjelp")){
        	dagbok.hjelp();
        }
        else if(command.equals("/nyOvelse")){
        	dagbok.addOvelse();
        }
	}
	
	public void addOvelse(){
		System.out.println("Navn på øvelse: ");
        BufferedReader navn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Beskrivelse: ");
        BufferedReader beskrivelse = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("utendørs eller innendørs? ");
        BufferedReader type = new BufferedReader(new InputStreamReader(System.in));
        
        String query = "INSERT INTO OVELSE (navn, beskrivelse, type)";
        Connection connection = null;
        Statement statement = null; 
        try{
        	connection=JDBCMySQLConnection.getConnection();
        	statement=connection.prepareStatement(query);
        
        	
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
