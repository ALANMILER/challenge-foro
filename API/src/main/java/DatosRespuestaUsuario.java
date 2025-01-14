package com.alura.api.usuario;

import com.alura.api.modelo.Usuario;


public record DatosRespuestaUsuario(String nombre, String email, String tipo) {


    public DatosRespuestaUsuario(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getTipo().toString());
    }
}
