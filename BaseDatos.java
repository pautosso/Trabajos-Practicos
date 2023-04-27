package JDBCconexio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class BaseDatos {

	public static void main(String[] args) {
		
		
		try {
// 1. Registrar el driver
		//Class.forName("com.mysql.jdbc.Driver");
		
		
//2. Crear la coneccion 
		Connection conX = DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar2022", "root", "Pelusa1998");
		
//3. 
		
		/*Statement cSQL = conX.createStatement();
	
		String consulta = "select * from productos where precio <1000";
		ResultSet.executeQuery (consulta);
		while (resp.next()) {
			System.out.println(resp.getIn(1) + "\t" + resp.getDouble(4)+"\t"+ resp.getString(2));
			
		}*/
		
		Statement cSQL = conX.createStatement();
		
		String consulta = "select * from productos order by precio asc";
		ResultSet.executeQuery (consulta);
		while (resp.next()) {
			System.out.println(resp.getIn(1) + "\t" + resp.getDouble(4)+"\t"+ resp.getString(2));
			
		}
		
	//Punto 3 a, b y c del Tp Num 14
		
	/*
	String consulta = "insert into clientes values(idC, 'Blas Sabrina', now())";
	cSQL.executeUpdate(consulta);
	
	String consulta = "update empleados set nomE = 'Perez Romina' where idE = 1";
		
	cSQL.executeUpdate(consulta)
		
		String consulta = "delete from empleados where idE = 1";
	*/
		
		
		
	
	/*	String consulta = "secet * from productos";
	 
	    ResultSet resultadoC = cSQL.executeQuery(consulta);
		
		System.out.println("CODIGO\tPRECIO\tPRODUCTO");
		
		while (resultadoC.next()) {
			
			System.out.println(resultadoC.getInt(1)+ "\t"+resultadoC.getDouble(4)+ "\t"+resultadoC.getString(2));
		}
		
		}catch (Exception e) {
		System.out.println("Error en la coneccion con la base de datos");
		System.out.println(e.fillInStackTrace());
		}
		}*/
		}
	}
}
		
	



