package iny.dep;
public class Argentina implements Equipo{
    String posicion;

    public Argentina(String posición) {
        this.posicion = posición;
    }//constuctor

    @Override
    public String toString() {
        return "Argentina: Posición=" + posicion;
    }//toString

    @Override
    public String jugar() {
        return "el jugador argentino juega en la posición de "+posicion;
    }
}//Argentina
