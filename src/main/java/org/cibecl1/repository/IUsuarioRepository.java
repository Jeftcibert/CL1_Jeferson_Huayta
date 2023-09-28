package org.cibecl1.repository;

import org.cibecl1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	
	//CRUD
	
	/*// busqueda segun corro  y clave -> Usuario 
	Usuario fingByCorreoAndClave(String correo, String clave);
		*/
	public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	    Usuario findByCorreoAndClave(String correo, String clave);
	}
	

