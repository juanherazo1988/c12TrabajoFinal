package B1;

import java.time.LocalDate;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu año de nacimiento: ");
            int yearOfBirth = scanner.nextInt();

            if (yearOfBirth <= 0) {
                System.out.println("Por favor, ingresa un año de nacimiento válido.");
            } else {
                int age = calcularEdad(yearOfBirth);
                System.out.println("Tienes " + age + " años.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para el año de nacimiento.");
        }
    }


    public static int calcularEdad(int yearOfBirth) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - yearOfBirth;
    }
}
