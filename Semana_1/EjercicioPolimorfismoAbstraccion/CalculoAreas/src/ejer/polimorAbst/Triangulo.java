package ejer.polimorAbst;

public class Triangulo extends Area{
    public Triangulo(int base, int altura) {
        super(base, altura);
    }//constructor

    @Override
    public String toString() {
        return "Triangulo: " +
                "base=" + base +
                ", altura=" + altura +
                ". El area es : ";
    }

    @Override
    int calculoArea() {
        return (base*altura)/2;

    }//calculoArea
}//Triangulo
