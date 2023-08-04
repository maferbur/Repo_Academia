package exc.triwtresorces;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Este programita calcula la división de dos números, procura darme enteros mayores de 0");
            System.out.print("¿Cual es tu nombre? ");
            String nombre = scanner.nextLine();
            System.out.println("Hola, " + nombre);

            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            double resultado = divide(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return (double) num1 / num2;
    }

}
