package B2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

     /*   Boolean esNumerico=true;
        int edad = 17;
        if (esNumerico == null){
            System.out.println("El boolean esta null");
        }else if (esNumerico) {
            System.out.println("Es numerico");
        }else{
            System.out.println("No es numerico");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(mensaje);
*/
        List<String> nombre = new ArrayList<>();
        nombre.add("Mauricio");
        nombre.add("Carlos");
        nombre.add("Camilo");

        int[] edades ={12,15,22,2,5,44};
        String[] miArreglo = {"Hola"};
/*
        for (int edad:edades) {
            System.out.println(edad);
        }
*/
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }


    }
}