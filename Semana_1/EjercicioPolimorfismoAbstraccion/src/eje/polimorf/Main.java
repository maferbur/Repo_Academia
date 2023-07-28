package eje.polimorf;
/*El polimorfismo viene de la mano de poder sobreescribir los metodos, ya que un mismo
metodo, los objetos pueden comportarse de manera diferente de su clase padre*/
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Atleta> atletas = new ArrayList<>();

        atletas.add(new Nadador(60,170));
        atletas.add(new Futbolista(59,170));
        atletas.add(new Rugbier(110,210));
        atletas.add(new Beisbolista(110,210));

        for (Atleta at:atletas) {
            System.out.println(at);
            int indices = at.caracCorporal();
            System.out.println(indices);
        }

    }//main Method
}//Class Main
