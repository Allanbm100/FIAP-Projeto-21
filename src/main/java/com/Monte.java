package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.Carta;
import com.example.Naipe;

public class Monte {
    
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {

        for(int numero = 1; numero <= 13; numero++) {
            for (Naipe naipe : Naipe.values()) {
                cartas.add(new Carta(numero, naipe));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        return cartas.remove(0);
    }
}
