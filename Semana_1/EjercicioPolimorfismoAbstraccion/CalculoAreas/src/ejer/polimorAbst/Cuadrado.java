package ejer.polimorAbst;
public class Cuadrado extends Area{
    public Cuadrado(int base, int altura) {
        super(base, altura);
    }//constructor

    @Override
    public String toString() {
        return "Cuadrado " +
                "base=" + base +
                ", altura=" + altura +".";
    }

    @Override
    int calculoArea() {
        if (base == altura) {
            return base * altura;
        } else {
            System.out.println("Esto no es un cuadrado, " +
                    "pero igual te doy su area que es: ");
            return base * altura; //
        }
    }//calculoArea
}//Cuadrado
