package co.edu.unbosque.tiendavirtual.tiendavirtualbackendGr3.TiendavirtualbackendGr3.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Aqui vamos a conectar a la base de datos
*en local con MYSQL y dejaremos conexion comentariada para mariadb
*Ivan Herrera 27-09-2021*/

public class conexion {
	static String bd="unbosque";
	static String login="root";
	static String password="millonarios";
	static String url= "jdbc:mysql://localhost:3306";
	
	/*static String bd="aqui va la base de tatos de aws";
	static String login="administracion que me dieron de la bd";
	static String password="la clave que dio amazon";
	static String url= "jdbc:mariadb//aqui la url que de amazon de la bd";*/
	
	Connection connection=null;
	
	//Constructor de la conexión a base de datos
	
	public conexion() {
		try {
			//Aqui obtenemos el driver de MYSQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("org.mariadb.jdbc.Driver");
				//obteniendo la conexión
			
			connection=DriverManager.getConnection(url,login,password);
			
			if(connection != null) {
				System.out.println("Conexión a base de datos "+ bd + " ok\n");
			}
		}catch(SQLException e ){
			System.out.println(e);
			
		}catch(ClassNotFoundException e) {
			System.out.println(e);	
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	// Retorneme la conexion
	
	public Connection getConnection() {
		return connection;
	}
	
	//Aqui para esconectar la dase de datos
	
	public void desconectar() {
		connection = null;		
	}
}
