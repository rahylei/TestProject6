package propuesta_Interfaz.Modelo;

public class Usuario {
	
	private String nombre;
	private String tipo;
	private String password;
	
	public Usuario(String Nombre, String Password, String Tipo) {
		this.nombre = Nombre;
		this.password = Password;
		this.tipo = Tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
