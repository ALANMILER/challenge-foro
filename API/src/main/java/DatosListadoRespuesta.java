package com.alura.api.respuesta;

import com.alura.api.modelo.Respuesta;


public record DatosListadoRespuesta(Long id, String mensaje, String topico, String autor) {

    public DatosListadoRespuesta(@org.jetbrains.annotations.NotNull Respuesta respuesta) {
        this(respuesta.getId(), respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
    }
}
