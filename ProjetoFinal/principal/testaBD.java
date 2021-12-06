package principal;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class testaBD {
	public void conecta() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_prog","root","");
		    System.out.println("Conectado");
		}catch(ClassNotFoundException e){
			System.out.println("Não foi possivel carregar o Driver do BD");
		}catch(SQLException e){
		    System.out.println("Falha ao conectar no BD");
		}
	}

}