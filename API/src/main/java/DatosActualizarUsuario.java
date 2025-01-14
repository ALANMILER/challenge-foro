package com.alura.usuario;

import com.alura.api.modelo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, com.alura.foro.api.modelo.Tipo tipo) {
}
