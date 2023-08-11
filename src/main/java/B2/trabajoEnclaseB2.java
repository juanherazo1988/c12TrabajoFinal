package B2;

import javax.swing.JOptionPane;

public class trabajoEnclaseB2 {
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Ingrese un número específico:");
            int numeroEspecifico = Integer.parseInt(input);

            if (numeroEspecifico <= 0) {
                throw new IllegalArgumentException("El número debe ser mayor que cero.");
            }

            StringBuilder pares = new StringBuilder();
            StringBuilder impares = new StringBuilder();

            for (int i = 2; i <= numeroEspecifico; i += 2) {
                pares.append(i).append(", ");
            }

            for (int i = 1; i <= numeroEspecifico; i += 2) {
                impares.append(i).append(", ");
            }

            String mensajePares = "Números pares: " + pares;
            String mensajeImpares = "Números impares: " + impares;
            JOptionPane.showMessageDialog(null, mensajePares + "\n" + mensajeImpares);

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
        } catch (IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(null, "Error: " + iae.getMessage());
        }
    }
}
