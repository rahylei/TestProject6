package propuesta_Interfaz.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Asignacion_Personal extends JFrame {

	private JPanel contentPane;
	public JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asignacion_Personal frame = new Asignacion_Personal();
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
	public Asignacion_Personal() {
		setTitle("Asignacion de personal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEncargadoDeLinea = new JLabel("Encargado de linea");
		lblEncargadoDeLinea.setBounds(10, 18, 143, 14);
		contentPane.add(lblEncargadoDeLinea);
		
		JLabel lblEncargadoDeMantenimiento = new JLabel("Encargado de mantenimiento");
		lblEncargadoDeMantenimiento.setBounds(10, 43, 155, 14);
		contentPane.add(lblEncargadoDeMantenimiento);
		
		JLabel lblOperador = new JLabel("Operador");
		lblOperador.setBounds(10, 68, 143, 14);
		contentPane.add(lblOperador);
		
		JLabel lblLimpieza = new JLabel("Limpieza");
		lblLimpieza.setBounds(10, 93, 117, 14);
		contentPane.add(lblLimpieza);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(191, 14, 115, 22);
		comboBox.addItem("Encargado 1");
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(191, 39, 115, 22);
		comboBox_1.addItem("Operador Man. 1");
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(191, 64, 115, 22);
		comboBox_2.addItem("Operador 1");
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(191, 89, 115, 22);
		comboBox_3.addItem("Encargado Limpieza 1");
		contentPane.add(comboBox_3);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(37, 118, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(170, 118, 89, 23);
		contentPane.add(btnAceptar);
	}
}
