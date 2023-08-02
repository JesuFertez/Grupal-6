package cl.grupo2.GrupalJpa.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="nombre")
	private String nombreUsuario;
	@Column(name="contrasena")
	private String contraseña;
	@Column(name="tipo")
	private String tipo;
	
	public Usuario() {}
	
	public Usuario(int id) {
		super();
		this.id = id;
		
	}
	
	public Usuario(int id, String nombreUsuario) {
		super();
		this.id = id;
		this.nombreUsuario=nombreUsuario;
	}
	

	public Usuario(int id, String nombreUsuario, String tipo) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.tipo = tipo;
	}

	public Usuario(String nombreUsuario, String contraseña, String tipo) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contraseña= contraseña;
		this.tipo = tipo;
	}
	
	public Usuario(int id, String nombreUsuario, String contraseña, String tipo) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.contraseña= contraseña;
		this.tipo = tipo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombreUsuario;
	}
	public void setNombre(String nombre) {
		this.nombreUsuario = nombre;
	}
	
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", tipo=" + tipo + ", contraseña=" + contraseña + "]";
	}
	
}
