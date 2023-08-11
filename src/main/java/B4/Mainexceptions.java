package B4;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Mainexceptions {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            while (continuar) {
                try {
                    System.out.print("Ingrese el primer número: ");
                    double numero1 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    double numero2 = scanner.nextDouble();

                    double resultado = numero1 / numero2;

                    if (Double.isNaN(resultado) || Double.isInfinite(resultado)) {
                        System.out.println("La división tiene una indeterminación.");
                    } else {
                        System.out.println("Resultado de la división: " + resultado);
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                } catch (ArithmeticException e) {
                    System.out.println("Error: No se puede dividir por cero.");
                } finally {
                    System.out.print("¿Desea realizar otra división? (s/n): ");
                    String respuesta = scanner.next().toLowerCase();
                    if (respuesta.equals("n")) {
                        continuar = false;
                    }
                }
            }

            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }


