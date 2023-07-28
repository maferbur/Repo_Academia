package pokemon.singleton;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pokemon registry = Pokemon.getInstance();

        do {
            System.out.print("Ingresa el nombre de un Pokémon: ");
            String pokemonName = scanner.nextLine();
            registry.addPokemon(pokemonName);


            System.out.print("¿Deseas ingresar otro Pokémon? Responder si ó no: ");
            String answer = scanner.nextLine().toLowerCase();
            if (!answer.equals("si")) {
                break;
            }
        } while (true); //fin do/inicia while

        System.out.println("Número total de Pokémones creados: " + registry.getPokemonCount());
        System.out.println("Ojetos creados durante el programa:  " + Pokemon.contador);
    }//main Method
}//Class Main


