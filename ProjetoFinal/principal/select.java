package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class select {
	public void selectAll() {
		try {
			String url = "jdbc:mysql://localhost/projeto_prog";
			Connection con = DriverManager.getConnection(url,"root","");
			PreparedStatement pesquisa = con.prepareStatement("SELECT * FROM USUARIO");
			ResultSet resultado = pesquisa.executeQuery();
			while(resultado.next()) {
				String login = resultado.getString("login");
				String senha = resultado.getString("senha");
				System.out.println("Login:"+login+"\nsenha:"+senha);
			}
			}catch(Exception erro){
				
			}
	}

}
