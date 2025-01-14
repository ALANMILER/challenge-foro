package com.alura.api.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public record DatosAutenticacionUsuario(
        @NotBlank
        @Email
        String email,
        @NotBlank
        String contrasena) {
}