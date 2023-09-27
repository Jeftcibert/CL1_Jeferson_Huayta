package org.cibecl1.repository;

import org.cibecl1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	//CRUD
	
	// busqueda segun corro  y clave -> Usuario 
	Usuario fingByCorreoAndClave(String correo, String clave);
		
}
