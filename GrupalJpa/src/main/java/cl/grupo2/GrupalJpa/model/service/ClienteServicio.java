package cl.grupo2.GrupalJpa.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.grupo2.GrupalJpa.model.entity.Cliente;
import cl.grupo2.GrupalJpa.model.repository.IClienteRepository;

@Service
public class ClienteServicio {

	public ClienteServicio() {
		super();
	}
	
	@Autowired
	private IClienteRepository cliRepo;
	
	public ArrayList<Cliente> obtenerClientes(){
		return (ArrayList<Cliente>) cliRepo.findAll();
	}
	
	public Cliente obtenerCliente(int id) {
		return cliRepo.findById(id).get();
	}
	
	public void crearCliente(Cliente cli) {
		cliRepo.save(cli);
	}
	
	public void actualizar(Cliente cli) {
		cliRepo.save(cli);
	}
	
	public void borrarCliente(int id) {
		cliRepo.delete(cliRepo.getOne(id));
	}
}
