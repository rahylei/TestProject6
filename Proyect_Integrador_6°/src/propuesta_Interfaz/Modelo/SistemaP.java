package propuesta_Interfaz.Modelo;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import propuesta_Interfaz.Modelo.*;

public class SistemaP{

	private FuncionesBD FBD;
	
	public SistemaP(){
		moduloBD();
	}
	
	public void moduloBD() {
		FBD = new FuncionesBD();
	}
	
	public int Login(String[] Usuario) {
		
		String[] tipo= {"Administrador", "Mantenimiento", "Operador"};
		int modVistaI=0;
		
		Usuario usuarioT = FBD.searchBD(Usuario[0], Usuario[1]);
		
		if(usuarioT!=null) {
			for(int i=1;i<=tipo.length;i++) {
				if(usuarioT.getTipo().toString().equals(tipo[i-1])) {
					modVistaI = i;
					break;
				}
			}
		}
		
		return modVistaI;
	}
	
	public void registrarUsuario(String nombre, String password, String tipo) {
		Usuario usuarioT = new Usuario(nombre, password, tipo);
		FBD.insertUsuario(usuarioT);
	}
	
}
