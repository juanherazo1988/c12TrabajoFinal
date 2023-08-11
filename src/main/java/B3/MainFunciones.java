package B3;

import javax.swing.*;

public class MainFunciones {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese dos números
        String input1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:", "Calculadora", JOptionPane.QUESTION_MESSAGE);
        String input2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:", "Calculadora", JOptionPane.QUESTION_MESSAGE);

        // Convertir los inputs a números enteros
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Realizar operaciones matemáticas básicas
        int suma = sumar(num1,num2);
        int resta = resta(num1,num2);

        MainFunciones mainFunciones= new MainFunciones();
        int multiplicacion=mainFunciones.multiplicacion(num1,num2);


        double division = (double) sumar(num1,num2);

        // Mostrar resultados en cuadros de diálogo
        JOptionPane.showMessageDialog(null, "Resultado de la suma: " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Resultado de la resta: " + resta, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + multiplicacion, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Resultado de la división: " + division, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static int sumar(int a, int b){
        return a+b;
    }
    private static int resta(int a, int b){
        return a-b;
    }
    private static int multiplicacion(int a, int b){
        return a*b;
    }
    private static double divicion(int a, int b){
        return a/b;
    }
}
