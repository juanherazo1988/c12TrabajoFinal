package B1;

public  class Main {

    public static void main(String[] args) {
        int  edad=25;
        double fraccion=18.4;
        String palabras="Hola";
        boolean esBoolean=true;
        char caracter='A';

        Integer edadW=25;
        Double fraccionW=18.4;
        String palabrasW="Hola";
        Boolean esBooleanW=true;
        Character caracterW='A';


        if (palabrasW.equalsIgnoreCase("HOLA")){

            System.out.println("Son Iguales");
        }else{
            System.out.println("Son Diferentes");
        }
    }
}