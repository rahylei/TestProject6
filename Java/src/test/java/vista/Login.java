package vista;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends  JFrame {
    JPanel Center;
    JPanel South;
    JLabel usuario;
    JTextField usuarioIn;
    JLabel password;
    JTextField passwordIn;
    public JButton ingresar;
    JButton cerrar;

    //constructor
    public Login(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //setVisible(true);
        setLocationRelativeTo(null);
        setSize(300,200);
        setResizable(false);
        setTitle("Login");
        panelCentral();
        panelSur();
        pack();
    }

    //panel central con las etiquetas y campos de texto...
    public void panelCentral(){
        Center = new JPanel();
        Center.setLayout( new GridLayout(2,2));
        usuario = new JLabel("Usuario: ");
        Center.add(usuario);
        usuarioIn = new JTextField(10);
        Center.add(usuarioIn);
        password = new JLabel("Password: ");
        Center.add(password);
        passwordIn = new JTextField(10);
        Center.add(passwordIn);
        add(Center, BorderLayout.CENTER);

    }

    public void panelSur(){
        South = new JPanel();
        South.setLayout(new GridLayout(2,0));
        ingresar = new JButton("Ingresar");
        ingresar.setSize(100,30);
        South.add(ingresar);
        cerrar = new JButton("Cerrar");
        cerrar.setSize(100,30);
        cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent xnxx) {
                System.exit(0);
            }
        });
        South.add(cerrar);
        add(South,BorderLayout.SOUTH);
    }

    public String sendNombre() {
        return usuarioIn.getText().toString();
    }

    public String sendPassword() {
        return passwordIn.getText().toString();
    }

    public void setVoid() {
        usuarioIn.setText("");
        passwordIn.setText("");
    }
}
