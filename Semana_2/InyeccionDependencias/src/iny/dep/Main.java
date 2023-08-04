package iny.dep;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jugador jug1 = new Jugador("Nico Sanchez");
        AgenteEx.inyectar(jug1, "ape");
        jug1.contratarEq();

        Jugador jug2 = new Jugador("TJ Perenara");
        AgenteEx.inyectar(jug2, "ms");
        jug2.contratarEq();

        Jugador jug3 = new Jugador("Finn Russell");
        AgenteEx.inyectar(jug3, "cen");
        jug3.contratarEq();

        Jugador jug4 = new Jugador("Henry Hutchison");
        AgenteEx.inyectar(jug4, "win");
        jug4.contratarEq();



    }//main
}//Main