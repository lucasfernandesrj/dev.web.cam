package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	
	private Connection conexao;
	
	public Connection fazerConexao() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/aulaweb";
			String user = "root";
			String pass = "";
			this.conexao = DriverManager.getConnection(url,user,pass);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.conexao;	
	}
	
	public void fecharConexao() {
		try {
			this.conexao.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
