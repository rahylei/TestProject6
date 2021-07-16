package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Registro_Linea  extends JFrame{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    public JButton btnCancelar;

    public Registro_Linea() {
        setTitle("Formulario para Registro de Linea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 321, 183);
        //setVisible(true);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel lblNombre_Linea = new JLabel("Nombre de linea");
        lblNombre_Linea.setBounds(10, 25, 121, 14);
        contentPane.add(lblNombre_Linea);

        JLabel lblNoDePieza = new JLabel("No. de Pieza");
        lblNoDePieza.setBounds(10, 82, 121, 14);
        contentPane.add(lblNoDePieza);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(63, 107, 89, 23);
        contentPane.add(btnCancelar);

        JButton btnAceptat = new JButton("Aceptar");
        btnAceptat.setBounds(162, 107, 89, 23);
        contentPane.add(btnAceptat);

        textField = new JTextField();
        textField.setBounds(154, 22, 100, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(151, 79, 100, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblIdDeMaquina = new JLabel("ID de maquina");
        lblIdDeMaquina.setBounds(10, 50, 121, 14);
        contentPane.add(lblIdDeMaquina);

        textField_5 = new JTextField();
        textField_5.setBounds(151, 47, 100, 20);
        contentPane.add(textField_5);
        textField_5.setColumns(10);


    }


}
