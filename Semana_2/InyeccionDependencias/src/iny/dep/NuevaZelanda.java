package iny.dep;
public class NuevaZelanda implements Equipo{
    String posicion;

    public NuevaZelanda(String posicion) {
        this.posicion = posicion;
    }//constructor
    @Override
    public String toString() {
        return "New Zeland: Posición=" + posicion;
    }//toString

    @Override
    public String jugar() {
        return "el jugador neozelandes juega en la posición de "+posicion;
    }
}//NuevaZelanda
