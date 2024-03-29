package com.restapi.empresa.security.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.empresa.security.entities.Usuario;
import com.restapi.empresa.security.repositories.UsuarioRepository;
import com.restapi.empresa.security.services.UsuarioService;


@Service 
public class UsuarioServiceImpl implements UsuarioService     {

    @Autowired
    private UsuarioRepository usuarioRepository;
    public Optional<Usuario> buscarPorEmail(String email) {
        return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
    }    
	

}
