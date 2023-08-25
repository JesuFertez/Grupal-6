package cl.grupo2.GrupalJpa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.grupo2.GrupalJpa.model.entity.Capacitacion;
import cl.grupo2.GrupalJpa.model.service.CapacitacionesServicio;

@RestController
public class RestCapacitacionControlador{
	
	@Autowired
	private CapacitacionesServicio cap;
	
	@RequestMapping(value="/api/capacitaciones",headers="Accept=application/json")
	public ArrayList<Capacitacion> getCapacitaciones(){
	return cap.obtenerCapacitaciones();
	}
	@RequestMapping(value="/api/capacitaciones/{id}", headers="Accept=application/json")
	public Capacitacion getCapacitacion(@PathVariable("id") int id){
		return cap.obtenerCapacitacion(id);
	}
}
	