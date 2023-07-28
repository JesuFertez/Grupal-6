package cl.grupo2.GrupalJpa.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.grupo2.GrupalJpa.model.entity.Capacitacion;
import cl.grupo2.GrupalJpa.model.repository.ICapacitacionesRepository;


@Service
public class CapacitacionesServicio {

	public CapacitacionesServicio() {
		super();
	}
	
	@Autowired
	private ICapacitacionesRepository capaRepo;
	
	public ArrayList<Capacitacion> obtenerCapacitaciones(){
		return (ArrayList<Capacitacion>) capaRepo.findAll();
	}
	
	public Capacitacion obtenerCapacitacion(int id) {
		return capaRepo.getOne(id);
	}
	
	public void crearCapacitacion(Capacitacion cap) {
		capaRepo.save(cap);
	}
	
	public void actualizar(Capacitacion cap) {
		capaRepo.save(cap);
	}
	
	public void borrarCapacitacion(int id) {
		capaRepo.delete(capaRepo.getOne(id));
	}

}
