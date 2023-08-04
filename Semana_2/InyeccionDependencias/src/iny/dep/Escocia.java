package iny.dep;
public class Escocia implements Equipo{
    String posicion;

    public Escocia(String posicion) {
        this.posicion = posicion;
    }//constructor

    @Override
    public String toString() {
        return "Escocia: Posición=" + posicion;

    }//toString

    @Override
    public String jugar() {
        return "el jugador escoses juega en la posición de "+posicion;
    }
}//Escocia
