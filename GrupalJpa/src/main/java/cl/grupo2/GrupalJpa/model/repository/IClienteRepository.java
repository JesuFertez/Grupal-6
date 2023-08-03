package cl.grupo2.GrupalJpa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.grupo2.GrupalJpa.model.entity.Cliente;


public interface IClienteRepository extends JpaRepository<Cliente,Integer>{

}
