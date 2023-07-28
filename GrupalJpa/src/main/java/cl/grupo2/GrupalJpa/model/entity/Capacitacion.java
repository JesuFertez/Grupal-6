package cl.grupo2.GrupalJpa.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import cl.grupo2.GrupalJpa.utils.ValidarDatos;

@Entity
@Table(name="Capacitaciones")
public class Capacitacion {

	@Id
	@Column(name="id")
	private int id;
	private String nombre;
	private String detalle;
	@Column(name="rut_cliente")
	private int rutCliente ;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	@Column(name="cantidad_asistentes")
	private int cantidadAsistentes;

	
	public Capacitacion() {
	}
	//Constructor formulario
	public Capacitacion(String nombre, String detalle, int rutCliente, String dia, String hora, String lugar,
			String duracion, int cantidadAsistentes) {
		super();
		setNombre(nombre);
		setDetalle(detalle);
		setRutCliente(rutCliente);
		setDia(dia);
		setHora(hora);
		setLugar(lugar);
		setDuracion(duracion);
		setCantidadAsistentes(cantidadAsistentes);
	}
	//Constructor DAO
	public Capacitacion(int id, String nombre, String detalle, int rutCliente, String dia, String hora, String lugar,
			String duracion, int cantidadAsistentes) {
		super();
		setId(id);
		setNombre(nombre);
		setDetalle(detalle);
		setRutCliente(rutCliente);
		setDia(dia);
		setHora(hora);
		setLugar(lugar);
		setDuracion(duracion);
		setCantidadAsistentes(cantidadAsistentes);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(ValidarDatos.esObligatorio(String.valueOf(id))) {
			this.id = id;			
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(ValidarDatos.RangoCaracteres(nombre, 5, 100)) {
			this.nombre = nombre;
		}
	}

	public String getDetalle() {
		return detalle;
	}
	
	public void setDetalle(String detalle) {
		if(ValidarDatos.RangoCaracteres(detalle, 5, 100)) {
			this.detalle = detalle;
		}
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		if(ValidarDatos.esObligatorio(String.valueOf(rutCliente))) {			
			this.rutCliente = rutCliente;
		}
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		if(ValidarDatos.esDiaValido(dia)) {
			this.dia = dia;
		}
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		if(ValidarDatos.esHoraValida(hora)) {
			this.hora = hora;			
		}
	}

	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		if(ValidarDatos.RangoCaracteres(lugar, 10, 50)) {
			this.lugar = lugar;			
		}
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		if(ValidarDatos.RangoCaracteres(duracion, 0, 70)) {
			this.duracion = duracion;			
		}
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		if(ValidarDatos.Numero(String.valueOf(cantidadAsistentes), 0, 1000)) {
			this.cantidadAsistentes = cantidadAsistentes;			
		}
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", nombre=" + nombre + ", detalle=" + detalle + ", rutCliente=" + rutCliente
				+ ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion
				+ ", cantidadAsistentes=" + cantidadAsistentes + "]";
	}
	
	
	
}
