package iny.dep;

public class Australia implements Equipo{
    String posicion;

    public Australia(String posición) {
        this.posicion = posición;
    }//constuctor

    @Override
    public String toString() {
        return "Australia: Posición=" + posicion;
    }//toString

    @Override
    public String jugar() {
        return "el jugador australiano juega en la posición de "+posicion;
    }
}//Argentina
