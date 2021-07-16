package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Registro_Personal extends JFrame{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    public JButton btnCancelar;
    public JComboBox cbPuestos;
    public JButton btnAceptar;
    private JTextField textField_Pass;

    public Registro_Personal() {
        setTitle("Registro de personal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        setResizable(false);
        setBounds(100, 100, 304, 285);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        pack();

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(10, 11, 46, 14);
        contentPane.add(lblNombre);

        JLabel lblApellido_p = new JLabel("Apellido paterno");
        lblApellido_p.setBounds(10, 36, 100, 14);
        contentPane.add(lblApellido_p);

        JLabel lblApellido_M = new JLabel("Apellido materno");
        lblApellido_M.setBounds(10, 61, 89, 14);
        contentPane.add(lblApellido_M);

        JLabel lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(10, 86, 89, 14);
        contentPane.add(lblTelefono);

        JLabel lblNss = new JLabel("NSS");
        lblNss.setBounds(10, 111, 46, 14);
        contentPane.add(lblNss);

        JLabel lblPuesto = new JLabel("Puesto");
        lblPuesto.setBounds(10, 136, 46, 14);
        contentPane.add(lblPuesto);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(10, 161, 89, 14);
        contentPane.add(lblPassword);

        textField = new JTextField();
        textField.setBounds(147, 8, 99, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(147, 33, 99, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(147, 58, 99, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(147, 83, 99, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(147, 108, 99, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        cbPuestos = new JComboBox();
        cbPuestos.setBounds(147, 132, 99, 22);
        cbPuestos.addItem("-------------");
        cbPuestos.addItem("Administrador");
        cbPuestos.addItem("Operador");
        cbPuestos.addItem("Mantenimiento");
        contentPane.add(cbPuestos);

        textField_Pass = new JTextField();
        textField_Pass.setBounds(147, 158, 99, 20);
        contentPane.add(textField_Pass);
        textField_Pass.setColumns(10);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(21, 199, 89, 23);
        contentPane.add(btnCancelar);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(134, 199, 89, 23);
        contentPane.add(btnAceptar);

    }

    public String getNombre() {
        return textField.getText().toString() + " " + textField_1.getText().toString() + " " + textField_2.getText().toString();
    }

    public String getPuesto() {
        return cbPuestos.getSelectedItem().toString();
    }

    public String getPass() {
        return textField_Pass.getText().toString();
    }
}
