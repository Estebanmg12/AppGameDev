package com.info.infoprimeraapp.dominio;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class desarrollador {
    private UUID uuid;
    private String nombre;
    private String correoElectronico;
    private String RolEquipoDesarrollo;
}
