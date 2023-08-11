package B4;

public class Main {

    public static void main(String[] args) {

        String nombre=null;
        String apellido="";
        String cedula="";

        try {
            if(nombre==null){
                throw new Exception("El campo Nombre no debe ir vacio");
            }
            if(apellido==null){
                throw new Exception("El campo Apellido no debe ir vacio");
            }
            if(cedula==null){
                throw new Exception("El campo Cedula no debe ir vacio");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Entro al finally");
        }


    }





}