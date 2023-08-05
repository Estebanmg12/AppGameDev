package com.info.infoprimeraapp.dominio;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Tarea {
    private UUID uuid;
    private String descripcion;
    private String tareaJuego;
    private String desarrolladorResponsable;
    private String fechaLimite;
    private String estado;

}
