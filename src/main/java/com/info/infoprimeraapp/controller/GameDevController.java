package com.info.infoprimeraapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.info.infoprimeraapp.dominio.Juego;
import com.info.infoprimeraapp.service.juego.JuegoService;

@RestController
public class GameDevController {

    JuegoService juegoService;

    @Autowired
    public GameDevController(JuegoService juegoService) {
        this.juegoService = juegoService;
    }


    @GetMapping("/api/v1/juego")
        public List<Juego> getAllJuegos(){
            return juegoService.getAllJuegos();
        }

    @PostMapping("/api/v1/juego")
        public Juego createJuego(@RequestBody Juego juego){
            return juegoService.createJuego(juego);
        }
}
