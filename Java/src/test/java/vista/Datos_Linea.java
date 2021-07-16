package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Datos_Linea extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    public JButton btnCancelar;

    public Datos_Linea() {

        setTitle("Informacion de la linea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        setResizable(false);
        setBounds(100, 100, 300, 233);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //pack();

        JLabel lblPiezasFinales = new JLabel("Piezas finales.");
        lblPiezasFinales.setBounds(23, 23, 93, 14);
        contentPane.add(lblPiezasFinales);

        JLabel lblScrap = new JLabel("SCRAP");
        lblScrap.setBounds(23, 48, 93, 14);
        contentPane.add(lblScrap);

        JLabel lblFallos = new JLabel("Fallos");
        lblFallos.setBounds(23, 74, 93, 14);
        contentPane.add(lblFallos);

        JLabel lblTiemposMuertos = new JLabel("Tiempos muertos");
        lblTiemposMuertos.setBounds(23, 124, 119, 14);
        contentPane.add(lblTiemposMuertos);

        textField = new JTextField();
        textField.setBounds(152, 20, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(152, 45, 86, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(152, 71, 86, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(152, 121, 86, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(23, 160, 89, 23);
        contentPane.add(btnCancelar);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(149, 160, 89, 23);
        contentPane.add(btnAceptar);

        JLabel lblMaterial = new JLabel("Material");
        lblMaterial.setBounds(23, 99, 62, 14);
        contentPane.add(lblMaterial);

        textField_4 = new JTextField();
        textField_4.setBounds(152, 96, 86, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
    }
}
