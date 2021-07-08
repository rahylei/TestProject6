package propuesta_Interfaz.Modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import propuesta_Interfaz.Modelo.Usuario;

public class FuncionesBD {
	
	public Connection conex = null;
	public PreparedStatement ps;
	private String servidor = "localhost:3306";
	private String nombreBD = "test_log";
	private String usuario = "root";
	private String password = "";
	
	public void conexion() {
		try {
			conex = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nombreBD,
			usuario , password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectBD() {
	try {
		conexion();
		ps = conex.prepareStatement("select * from usuario ");
		String nombre, password;
		ResultSet rs = ps.executeQuery();
		System.out.println("Lista de usuarios:");
		while (rs.next())
		{
		nombre = rs.getString(1);
		password =rs.getString(2);
		System.out.println(rs.getRow() + "-" + nombre + " " + password);
		}
		
		conex.close();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
			
	}
	
	public Usuario searchBD(String nombreExt, String passwordExt) {
		
		boolean sisiste=false;
		Usuario usuario = null;
		
		try {
		conexion();		
		ps = conex.prepareStatement("select * from usuario");
		
		String nombreInt = "";
		String passwordInt = "";
		String tipo="";
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			nombreInt = rs.getString(1);
			//nombreInt="don";
			passwordInt = rs.getString(2);
			tipo = rs.getString(3);
			System.out.println("BD: " + nombreInt);
			System.out.println("FunBD: " + nombreExt);
			usuario  = new Usuario(nombreInt, passwordInt, tipo);
			
			if(nombreExt.equals(nombreInt)) {
				sisiste = true;
				break;
			} 
		}
		
		if(sisiste == false) {
			JOptionPane.showMessageDialog(null, "No esiste el susuario");
		}
		
		if(sisiste == true) {
			if(!passwordInt.equals(passwordExt)) {
				JOptionPane.showMessageDialog(null, "Password Incorrecto Intentelo de nuevo..");
				sisiste = false;
			} 
		}
		
		conex.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(sisiste==true)
			return usuario;
		else
			return null;
	}
	
	public void insertUsuario(Usuario user) {
		try {
		conexion();
		
		ps = conex.prepareStatement("insert into usuario values( ?, ?, ? )");
		
		ps.setString(1, user.getNombre().toString());
		ps.setString(2, user.getPassword().toString());
		ps.setString(3, user.getTipo().toString());
		
		int i=ps.executeUpdate();
		
		System.out.println(i + " registro añadido");
		
		conex.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
