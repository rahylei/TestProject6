package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipalUsuario extends JFrame{

    private JPanel contentPane;
    public JButton btnFormulario_Mantenimiento;
    public JButton btnCerrar;

    public MenuPrincipalUsuario() {
        setTitle("Menu Principal Usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);
        setResizable(false);
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
