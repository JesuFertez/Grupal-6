package cl.grupo2.GrupalJpa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.grupo2.GrupalJpa.model.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario,Integer>{

}
