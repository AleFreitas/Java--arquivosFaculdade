package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.lang.RuntimeException;
import java.lang.Exception;
import java.sql.SQLException;

public class select {
	
	public void selectUser(String log, String sen) {
		try {
			String url = "jdbc:mysql://localhost/projeto_prog";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement pesquisa = con.prepareStatement("select login from usuario where login = '"+log+"'"+" and senha ='"+sen+"'");
			ResultSet resultado = pesquisa.executeQuery();
			while(resultado.next()) {
				String login = resultado.getString("login");
				System.out.println("Login:"+login);
			}
		}catch(Exception erro){
				
		}
	}

}

