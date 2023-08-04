package lam.uno;
import java.util.Optional;
import java.util.function.*;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        //Valuruar una lamda predicate donde pasamos un valor entero
        //la lambda va a evaluar si es un numero par o impar
        Predicate<Integer> pre= i -> (i%2==0) ? true : false;
        boolean r = pre.test(8);//Aqui cambiamos el número que queremos evaluar
        if (r)  {
            {
                System.out.println("Es un número par");
                System.out.println("------------------------------------");
            }
        }else{
            System.out.println("Es un numero impar");
        }//else Predicate
//////////////////////////////////////////////////////////////////////////////////////////7

        //Lambda Suplier valuara si el numero que se le esta pasando es par o impar
        Supplier<String> par = () -> {
            int numero = 180;//Aqui cambiamos el número que queremos evaluar
            if (numero % 2 == 0) {
                return "par";
            } else {
                return "impar";
            }
        };//Suplier

        String resultado = par.get();
        System.out.println("El número es " + resultado);
        System.out.println("------------------------------------");
///////////////////////////////////////////////////////////////////////////////////////////
      //  Lambda Consumer valuara si el numero que se le esta pasando es par o impar
        Consumer<Integer> impar = (numero) -> {
            if (numero % 2 == 0) {
                System.out.println(numero + " es par.");
                System.out.println("------------------------------------");
            } else {
                System.out.println(numero + " es impar.");
                System.out.println("------------------------------------");
            }
        };

        int numero = 8; //Aqui cambiamos el número que queremos evaluar
        impar.accept(numero);
/////////////////////////////////////////////////////////////////////////////////////////

        //  Lambda Function valuara si el numero que se le esta pasando es par o impar
        Function<Integer, String> verificarParImpar = (num) -> {
            if (num % 2 == 0) {
                return "El número "+ num + " es par.";
            } else {
                return "El número "+ num + " es impar.";
            }
        };

        int num = 2; // Cambiar el número a verificar aquí
        String anwser = verificarParImpar.apply(num);
        System.out.println(anwser);
        System.out.println("------------------------------------");

/////////////////////////////////////////////////////////////////////////////////

        //  Lambda UnaryOperator valuara si el numero que se le esta pasando es par o impar
        //aqui debemos utilizar un ParseInt debido a que lo que evaluara sera un String
        UnaryOperator<String> verificar = (entrada) -> {
            int valor = Integer.parseInt(entrada);
            if (valor % 2 == 0) {
                return valor + " El valor evaluado es par.";
            } else {
                return valor + " El valor evaluado es impar.";
            }
        };

        String entrada = "98"; // Número para evaluar
        String out = verificar.apply(entrada);
        System.out.println(out);
        System.out.println("------------------------------------");

/////////////////////////////////////////////////////////////////////////////////

        Runnable check = () -> {
            int dato = 7; // Número para evaluar
            if (dato % 2 == 0) {
                System.out.println(dato + " es par.");
                System.out.println("------------------------------------");

            } else {
                System.out.println(dato + " es impar.");
                System.out.println("------------------------------------");

            }
        };

        Thread hilo = new Thread(check);
        hilo.start();

//////////////////////////////////////////////////////////////////////////////////////////////
//la lambda Optional nos verifica si un String viene vacio
        Optional<String> mensaje = obtenerMensaje();

        if (mensaje.isPresent()) {
            System.out.println("Mensaje obtenido: " + mensaje.get());
        } else {
            System.out.println("No se pudo obtener el mensaje.");
        }
    }

    public static Optional<String> obtenerMensaje() {
        // Simulamos la obtención de un mensaje (puede ser nulo)
        String mensaje = "¡Hola, mundo!";


        return Optional.ofNullable(mensaje);



    }//main

}//Main
