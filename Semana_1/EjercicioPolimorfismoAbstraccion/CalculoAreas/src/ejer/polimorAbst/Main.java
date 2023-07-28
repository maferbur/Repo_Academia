package ejer.polimorAbst;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Area> areas = new ArrayList<>();

        areas.add(new Triangulo(12,29));
        areas.add(new Circulo(12,29));
        areas.add(new Cuadrado(12,21));
        areas.add(new Rectangulo(29,29));

        for (Area ar:areas) {
            System.out.println(ar);
            System.out.println(ar.calculoArea());
            System.out.println(" ");

        }//for

    }//main Method
}//Class ejer.polimorAbst.Main