import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Persona> people = getPeople();

        //PROGRAMACION IMPERATIVA-->Defines cada uno de los pasos que necesitas realizar, YA NO ES RECOMENDADO HACER ESTO
       /* List<Persona> female = new ArrayList<>();
        for (Persona persona : people){
            if (persona.getGenero().equals(Gender.FEMALE)){
                female.add(persona);}
                }
      female.forEach(System.out::println);*/

    //PROGRAMACION DECLARATIVA (STREAMS)

    //filter
    //con este stream no estamos creando una lista, ni iterandola para saber si cumple con los requisitos para agregarla.


        List<Persona> female = people.stream()
            .filter(persona -> persona.getGenero().equals(Gender.FEMALE))
            .collect(Collectors.toList());

        /*
        * Partes del stream:
        * people.stream(): Convierte la colección people en un flujo (stream) de elementos, lo que te permite operar en cada elemento de la colección de manera secuencial o paralela.
        * .filter(persona -> persona.getGenero().equals(Gender.FEMALE)): Este es un operador de filtrado. Se aplica a cada elemento del flujo y mantiene solo aquellos elementos que cumplan con la condición proporcionada.
        * collect(Collectors.toList()): Recolecta los elementos filtrados en una nueva lista.
        */
    //female.forEach(System.out::println);

    //Sort
        List<Persona> sorted = people.stream()
        .sorted(Comparator.comparing(Persona::getEdad))
        .collect(Collectors.toList());

    sorted.forEach(System.out::println);






    }//main

    private static List<Persona> getPeople(){
        return List.of(
                new Persona("Juan Perez", 45, Gender.MALE),
                new Persona("Ana Guevara", 78, Gender.FEMALE),
                new Persona("Luisa Toxqui", 5, Gender.FEMALE),
                new Persona("Ricardo Jaramillo", 35, Gender.MALE),
                new Persona("Charli MacNamara", 27, Gender.MALE)
        );
    }
}