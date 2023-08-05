package com.info.infoprimeraapp.service.juego.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Service;

import com.info.infoprimeraapp.dominio.Juego;
import com.info.infoprimeraapp.service.juego.JuegoService;

@Service
public class JuegoServiceImpl implements JuegoService {

    Map<UUID, Juego> juegoMap;

    public JuegoServiceImpl(){
        juegoMap = new HashMap<>();

        Juego juego = new Juego();
        juego.setUuid(UUID.randomUUID());
        juego.setDesarrolladores("asd");
        juego.setDescripcion("adf");
        juego.setTareas("qwe");
        juego.setTitulo("svs");

        Juego juego2 = new Juego();
        juego2.setUuid(UUID.randomUUID());
        juego2.setDesarrolladores("aaa");
        juego2.setDescripcion("wqwqq");
        juego2.setTareas("bbb");
        juego2.setTitulo("nnn");

        Juego juego3 = new Juego();
        juego3.setUuid(UUID.randomUUID());
        juego3.setDesarrolladores("111");
        juego3.setDescripcion("222");
        juego3.setTareas("333");
        juego3.setTitulo("4444");

        juegoMap.put(juego.getUuid(), juego);
        juegoMap.put(juego2.getUuid(), juego2);
        juegoMap.put(juego3.getUuid(), juego3);

    }

    @Override
    public List<Juego> getAllJuegos() {
        return new ArrayList<>(juegoMap.values());
    }

    @Override
    public Juego createJuego(Juego juego) {
        juego.setUuid(UUID.randomUUID());
        juegoMap.put(juego.getUuid(), juego);
        return juego;
    }
    
}
