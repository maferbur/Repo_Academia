package iny.dep;
public class Jugador {
    String nombre;
    Equipo eq;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }//constructor

    void contratarEq(){
        System.out.println(nombre + ", " +eq.jugar());
    }

}//Jugador
