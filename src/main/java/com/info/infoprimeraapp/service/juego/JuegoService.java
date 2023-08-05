package com.info.infoprimeraapp.service.juego;

import java.util.List;
import com.info.infoprimeraapp.dominio.Juego;

public interface JuegoService {
    List <Juego> getAllJuegos();
    Juego createJuego(Juego juego);
}
