package propuesta_Interfaz.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_Principal_Usuario extends JFrame {

	private JPanel contentPane;
	public JButton btnFormulario_Mantenimiento;
	public JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Principal_Usuario frame = new Menu_Principal_Usuario();
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
	public Menu_Principal_Usuario() {
		setTitle("Menu Principal Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 128);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnFormulario_Mantenimiento = new JButton("Formulario de mantenimiento");
		btnFormulario_Mantenimiento.setBounds(49, 11, 202, 23);
		contentPane.add(btnFormulario_Mantenimiento);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(108, 45, 89, 23);
		contentPane.add(btnCerrar);
	}

}
