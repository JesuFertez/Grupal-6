package cl.grupo2.GrupalJpa.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.grupo2.GrupalJpa.model.entity.Capacitacion;
import cl.grupo2.GrupalJpa.model.entity.Cliente;
import cl.grupo2.GrupalJpa.model.service.CapacitacionesServicio;
import cl.grupo2.GrupalJpa.model.service.ClienteServicio;


@Controller
public class CapacitacionesControlador {
	
	@Autowired
	private CapacitacionesServicio cap;

	@Autowired
	private ClienteServicio cliServ;
	
	@Autowired
	private RestCapacitacionControlador restCap;
	
	@RequestMapping(value ="/ListarCapacitaciones",method = RequestMethod.GET)
	public ModelAndView listarCapacitaciones() {
		ArrayList<Capacitacion> listaCapacitacion = new ArrayList<>();
		listaCapacitacion = cap.obtenerCapacitaciones();
		
		return new ModelAndView ("listar-capacitaciones","listaCapacitacion",listaCapacitacion);
	}
	
	@RequestMapping(value ="/CrearCapacitacion",method = RequestMethod.GET)
	public ModelAndView mostrarInicio(ModelMap model) {
		List<Cliente>listadoClientes= cliServ.obtenerClientes();
		model.addAttribute("listadoClientes", listadoClientes);
        return new ModelAndView("crearCapacitacion",model);
    }
	
	@RequestMapping(value ="/CrearCapacitacion", method = RequestMethod.POST)
    public ModelAndView crearCapacitacion(@RequestParam("nombre") String nombre, 
    		@RequestParam("detalle") String detalle, 
    		@RequestParam("rutCliente") int rutCliente,
    		@RequestParam("dia") String dia,
    		@RequestParam("hora") String hora,
    		@RequestParam("duracion") String duracion,
    		@RequestParam("lugar") String lugar,
    		@RequestParam("cantidadAsistentes") int cantidadAsistentes) {
		
		Capacitacion capacitacion = new Capacitacion(nombre,detalle,rutCliente,dia,hora,lugar,duracion,cantidadAsistentes);
		System.out.println(capacitacion);
		cap.crearCapacitacion(capacitacion);
		System.out.println(capacitacion);
		
		//Usuando servicio Rest de capacitaciones para desplegar la lista de las capacitaciones
		ArrayList<Capacitacion> listaCapacitacion = restCap.getCapacitaciones();
		
		return new ModelAndView ("listar-capacitaciones","listaCapacitacion",listaCapacitacion);
	}
}
