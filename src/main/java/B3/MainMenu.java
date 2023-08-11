package B3;

import java.util.Scanner;
public class MainMenu {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int intentosFallidos = 0;
            final int MAX_INTENTOS = 3;
            boolean usuarioBloqueado = false;

            do {
                System.out.println("Menú:");
                System.out.println("1. Login");
                System.out.println("2. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        if (intentosFallidos < MAX_INTENTOS) {
                            scanner.nextLine(); // Limpia el buffer
                            System.out.print("Ingrese su nombre de usuario: ");
                            String usuario = scanner.nextLine();

                            System.out.print("Ingrese su contraseña: ");
                            String contrasena = scanner.nextLine();

                            if (usuario.equals("UsuarioJuan") && contrasena.equals("12345678")) {
                                System.out.println("Login exitoso. ¡Bienvenido!");
                                intentosFallidos = 0; // Reinicia los intentos fallidos
                            } else {
                                intentosFallidos++;
                                System.out.println("Credenciales incorrectas. Intentos fallidos: " + intentosFallidos);

                                if (intentosFallidos >= MAX_INTENTOS) {
                                    usuarioBloqueado = true;
                                    System.out.println("Usuario bloqueado.");
                                }
                            }
                        } else {
                            usuarioBloqueado = true;
                            System.out.println("Usuario bloqueado.");
                        }
                        break;
                    case 2:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } while (usuarioBloqueado == false);

            scanner.close();
        }
    }



