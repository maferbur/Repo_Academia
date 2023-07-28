package ejer.polimorAbst;

public class Rectangulo extends Area {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }//Constructor

    @Override
    public String toString() {
        return "Rectangulo: " +
                "base=" + base +
                ", altura=" + altura +
                ".";
    }//toString

    @Override
    int calculoArea() {
        if (base == altura) {
            System.out.println("Esto no es un rectangulo, " +
                    "pero igual te doy su area que es: ");
            return base * altura; //
        } else {
            return base * altura;
        }
    }//calculoArea

}//Rectangulo
