package com.restapi.empresa.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.empresa.security.entities.Usuario;


@Transactional(readOnly =true )
public interface UsuarioRepository extends JpaRepository  <Usuario, Long> {
		
	Usuario findByEmail(String email);
	
}
