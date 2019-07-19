package com.restapi.empresa.security.services;

import java.util.Optional;

import com.restapi.empresa.security.entities.Usuario;

public interface UsuarioService {
    
    Optional<Usuario> buscarPorEmail(String email);
}