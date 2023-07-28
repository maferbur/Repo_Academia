package pokemon.singleton;

public class Pokemon {
    private static Pokemon instance;
    private int pokemonCount;
    static int contador;


    private Pokemon() {
        pokemonCount = 0;
        contador++;
    }//constructor

    public static Pokemon getInstance() {
        if (instance == null) {
            instance = new Pokemon();
        }
        return instance;
    }//getInstance

    public void addPokemon(String pokemonName) {

        System.out.println("Nombre del Pokémon: " + pokemonName);
        System.out.println("Se ha creado el Pokemon " + pokemonName);
        pokemonCount++;
    }//addPokemon

    public int getPokemonCount() {
        return pokemonCount;
    }//getPokemonCount

   /* @Override
    public String toString() {
        return "Pokemon{" +
                "pokemonCount=" + pokemonCount +
                '}';
    }*/
}//class Pokemon


