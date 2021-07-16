package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Formulario_Mantenimiento extends JFrame {

    private JPanel contentPane;
    public JButton btnCancelar;

    public Formulario_Mantenimiento() {
        setTitle("Formulario mantenimientos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        setResizable(false);
        setBounds(100, 100, 320, 164);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEncargadoDeMantenimiento = new JLabel("Encargado de Mantenimiento");
        lblEncargadoDeMantenimiento.setBounds(10, 11, 149, 14);
        contentPane.add(lblEncargadoDeMantenimiento);

        JLabel lblIdDeFormulario = new JLabel("ID de formulario");
        lblIdDeFormulario.setBounds(10, 36, 149, 14);
        contentPane.add(lblIdDeFormulario);

        JLabel lblLinea = new JLabel("Linea");
        lblLinea.setBounds(10, 61, 106, 14);
        contentPane.add(lblLinea);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(169, 7, 106, 22);
        comboBox.addItem("Encagado 1");
        contentPane.add(comboBox);

        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(169, 32, 106, 22);
        comboBox_1.addItem("36127382");
        contentPane.add(comboBox_1);

        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setBounds(169, 57, 106, 22);
        comboBox_2.addItem("Linea 1");
        contentPane.add(comboBox_2);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(33, 86, 89, 23);
        contentPane.add(btnCancelar);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(169, 86, 89, 23);
        contentPane.add(btnAceptar);
    }


}
