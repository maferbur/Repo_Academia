package ejer.polimorAbst;

public abstract class Area {
    int base;
    int altura;

    public Area(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }//constructor
    //En esta clase abstracta el constructor podra determinar el comportamiento de sus clases hijas
    abstract int calculoArea(); //metodo abtracto donde no se define el comportamiento
    //es decir que las clases hijas son las que deben definir el comportamiento de la clase Area

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Calculando Area...";
    }
}//Area

