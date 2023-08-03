package cl.grupo2.GrupalJpa.model.entity;

public enum RolUsuario {
	Cliente,
	Administrativo,
	Profesional;
	
public static RolUsuario parse(String text) {
		
		if(Cliente.name().equalsIgnoreCase(text)) {
			return Cliente;
		}else if(Administrativo.name().equalsIgnoreCase(text)) {
			return Administrativo;
		}else {
			return Profesional;
		}
	}
}

