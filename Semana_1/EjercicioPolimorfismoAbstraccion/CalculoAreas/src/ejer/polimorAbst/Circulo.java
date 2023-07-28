package ejer.polimorAbst;

public class Circulo extends Area{
    public Circulo(int base, int altura) {
        super(base, altura);
    }//constructor

    @Override
    public String toString() {
        return "Circulo: " +
                "base=" + base +
                ", altura=" + altura +
                ". Debido a que no tengo radio, este se saco con la base y la altura, entonce el area es : ";
    }

    @Override
    int calculoArea() {
        return (int) (Math.PI*(Math.pow((base/2+altura/2),2)));//aqui saque el radio de la base y la altura para utilizar ambos
        //y se hace un casting ya que esa expresión nos regresa un double.
    }//calculoArea
}//Circulo
