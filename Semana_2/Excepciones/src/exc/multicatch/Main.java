package exc.multicatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Este programita calcula la división de dos números, procura darme enteros mayores de 0");
            System.out.print("¿Cual es tu nombre? ");
            String nombre = entrada.nextLine();
            System.out.println("Hola, " + nombre);
            System.out.print("Ingrese un número por favor: ");
            int num1 = entrada.nextInt();

            System.out.print("Ingrese el otro número: ");
            int num2 = entrada.nextInt();

            double resultado = dividiendo(num1, num2);

            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }//finally
    }//main

    public static double dividiendo(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("es una división entre cero, y no se puede hacer eso matematicamente");
        }
        return (double) num1 / num2;
    }//dividiendo
}//Main
