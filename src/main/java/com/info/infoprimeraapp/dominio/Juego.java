package com.info.infoprimeraapp.dominio;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Juego {
    private UUID uuid;
    private String titulo;
    private String descripcion;
    private String desarrolladores;
    private String tareas;

}
