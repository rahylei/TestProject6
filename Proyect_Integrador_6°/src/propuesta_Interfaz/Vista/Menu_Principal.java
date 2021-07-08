package propuesta_Interfaz.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_Principal extends JFrame {

	private JPanel contentPane;
	public JButton btnFormLinea;
	public JButton btnAsignarPersonal;
	public JButton btnRegistro_Linea;
	public JButton btnRegistro_Personal;
	public JButton btnCerrar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Principal frame = new Menu_Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu_Principal() {
		setTitle("Menu principal Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRegistro_Linea = new JButton("Registro de Linea");
		btnRegistro_Linea.setBounds(63, 21, 153, 23);
		contentPane.add(btnRegistro_Linea);
		
		btnRegistro_Personal = new JButton("Registro de personal");
		btnRegistro_Personal.setBounds(63, 56, 153, 23);
		contentPane.add(btnRegistro_Personal);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(97, 158, 89, 23);
		contentPane.add(btnCerrar);
		
		btnFormLinea = new JButton("Formulario de linea");
		btnFormLinea.setBounds(63, 90, 153, 23);
		contentPane.add(btnFormLinea);
		
		btnAsignarPersonal = new JButton("Asignar personal");
		btnAsignarPersonal.setBounds(63, 124, 153, 23);
		contentPane.add(btnAsignarPersonal);
	}

}
