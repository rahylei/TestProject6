package propuesta_Interfaz.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log extends JFrame {

	private JPanel contentPane;
	private JTextField Usuario;
	private JTextField Password;
	public JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
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
	public Log() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 210, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Usuario = new JTextField();
		Usuario.setBounds(98, 32, 86, 20);
		contentPane.add(Usuario);
		Usuario.setColumns(10);
		
		Password = new JTextField();
		Password.setBounds(98, 63, 86, 20);
		contentPane.add(Password);
		Password.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(27, 35, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(27, 66, 72, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(69, 7, 46, 14);
		contentPane.add(lblLogin);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(55, 110, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				System.exit(0);
			}
		});
		btnCerrar.setBounds(55, 144, 89, 23);
		contentPane.add(btnCerrar);
		
		}
	
		public String sendNombre() {
			return Usuario.getText().toString();
		}
		
		public String sendPassword() {
			return Password.getText().toString();
		}
		
		public JButton btnIngreso() {
			return btnIngresar;
		}
		
		public void setVoid() {
			Usuario.setText("");
			Password.setText("");
		}
}
