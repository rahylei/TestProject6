package modelo;

import modelo.*;

import javax.swing.*;

public class SistemaP{

    private FuncionesBD FBD;

    public SistemaP(){
        moduloBD();
    }

    public void moduloBD() {
        FBD = new FuncionesBD();
    }

    public int Login(String[] Usuario) {

        String[] tipo= {"Administrador", "Mantenimiento", "Operador"};
        int modVistaI=0;

        Usuario usuarioT = FBD.searchBD(Usuario[0], Usuario[1]);

        if(usuarioT!=null) {
            for(int i=1;i<=tipo.length;i++) {
                if(usuarioT.getTipo().toString().equals(tipo[i-1])) {
                    modVistaI = i;
                    break;
                }
            }
        }

        return modVistaI;
    }

    public void registrarUsuario(String nombre, String password, String tipo) {
        Usuario usuarioT = new Usuario(nombre, password, tipo);
        FBD.insertUsuario(usuarioT);
    }

}

