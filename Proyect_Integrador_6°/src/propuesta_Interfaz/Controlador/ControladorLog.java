package propuesta_Interfaz.Controlador;
import propuesta_Interfaz.Vista.*;
import propuesta_Interfaz.Modelo.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;




public class ControladorLog {

	private static Log log;
	private static SistemaP sistem;
	private static Menu_Principal menuAdministrador;
	private static Menu_Principal_Usuario menuUsuario;
	private static Formulario_Mantenimiento formMant;
	private static Registro_Linea formLinea;
	private static Registro_Personal formPersonal;
	private static Datos_Linea DisplayLinea;
	private static Asignacion_Personal personalAsig;
	
	public static void main(String [] Ray) {
		//ESTOS SON LOS MODULOS QUE LLEVAMOS... :)
		moduloLog();
		moduloFormularioMantenimiento();
		moduloDisplayLinea();
		moduloPersonalAsignado();
		moduloRegistroLinea();
		moduloRegistroPersonal();
		moduloMenuUsuario();
		moduloMenuAdministrador();
		moduloSistema();
	}
	
	//Inicializacion de modulo login y eventos de la interfaz. 
	public static void moduloLog() {
		 log = new Log();
		 log.setVisible(true);
		 log.btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent x) {
					String nombreT = log.sendNombre();
					String passT = log.sendPassword();
					String[] Usuario = {nombreT, passT};
					
					int vista = sistem.Login(Usuario);//Funcion del modulo sistema para loguear al usuario.
					seleccionMenu(vista);
					log.setVoid();
				}
			});
	}
	
	public static void seleccionMenu(int vista) {
		
		if(vista>0) {
			switch(vista) {
			case 1:
				log.setVisible(false);
				menuAdministrador.setVisible(true);
				break;
			case 2:
				log.setVisible(false);
				menuUsuario.setVisible(true);
				break;
			case 3:
				log.setVisible(false);
				DisplayLinea.setVisible(true);
				break;
			}
		}
	}
	
	//Inicializacion del modulo de sistema.
	public static void moduloSistema() {
		sistem = new SistemaP();
	}
	
	//Inicializacion del modulo Menu del Usuario normal
	public static void moduloMenuUsuario() {
		menuUsuario = new Menu_Principal_Usuario();
		menuUsuario.btnFormulario_Mantenimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				menuUsuario.setVisible(false);
				formMant.setVisible(true);
			}
		});
		
		menuUsuario.btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				menuUsuario.setVisible(false);
				log.setVisible(true);
			}
		});
		
	}
	
	//Inicializcion del Formulario de mantenimiento.
	public static void moduloFormularioMantenimiento() {
		formMant = new Formulario_Mantenimiento();
		formMant.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				menuUsuario.setVisible(true);
				formMant.setVisible(false);
			}
		});
	}
	
	//Inicializacion del Menu de Administrador
	public static void moduloMenuAdministrador() {
		menuAdministrador = new Menu_Principal();
		
		menuAdministrador.btnFormLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayLinea.setVisible(true);
			}
		});
		
		menuAdministrador.btnAsignarPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				personalAsig.setVisible(true);
			}
		});
		
		menuAdministrador.btnRegistro_Linea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				formLinea.setVisible(true);
			}
		});
		
		menuAdministrador.btnRegistro_Personal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				formPersonal.setVisible(true);
			}
		});
		
		menuAdministrador.btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				menuAdministrador.setVisible(false);
				log.setVisible(true);
			}
		});
	}
	
	//Inicializacion del modulo  de formulario de datos de la linea.
	public static void moduloDisplayLinea() {
		DisplayLinea = new Datos_Linea();
		
		DisplayLinea.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				DisplayLinea.setVisible(false);
				menuAdministrador.setVisible(true);
			}
		});
	}
	
	//Inicializacion del modulo de Asignacion de personal.
	public static void moduloPersonalAsignado() {
		personalAsig = new Asignacion_Personal();
	
		personalAsig.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				personalAsig.setVisible(false);
				menuAdministrador.setVisible(true);
			}
		});
	}
	
	//Inicializacion del modulo de Registro de linea.
	public static void moduloRegistroLinea() {
		formLinea = new Registro_Linea();
		
		formLinea.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				formLinea.setVisible(false);
				menuAdministrador.setVisible(true);
			}
		});
	}
	
	//Inicializacioin del modulo de Registro de  personal.
	public static void moduloRegistroPersonal() {
		formPersonal = new Registro_Personal();
		
		formPersonal.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				formPersonal.setVisible(false);
				menuAdministrador.setVisible(true);
			}
		});
		
		formPersonal.btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				sistem.registrarUsuario(formPersonal.getNombre(), formPersonal.getPass(), formPersonal.getPuesto());
			}
		});
		
	}
	
}
