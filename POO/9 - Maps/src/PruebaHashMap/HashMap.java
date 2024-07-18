package PruebaHashMap;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        //Declaracion tipo de dato de clave y el tipo de dato del valor
        //Primero Clave y despues valor

        Map<Integer,String> mapaEmpleados = new java.util.HashMap<>();

        //Agregar = clave + nombre
        mapaEmpleados.put(1523,"Miguel");
        mapaEmpleados.put(1524,"Bambi");
        mapaEmpleados.put(1525,"Robt");


        //Para saber si esta el valor
        //Tambien esta Key para ver si la llave esta
        boolean esta = mapaEmpleados.containsValue("Robt");

        if(esta == true) {
            System.out.println("El valor buscado esta");
        } else {
            System.out.println("El valor no esta");
        }

        //Devuelve todos los valores o Keys si se pone keys
        System.out.println(mapaEmpleados.values());

        //Puedo guardar un valor asociado a la Key
        String nombre = mapaEmpleados.get(1524);

        System.out.println(nombre);

        //Para eliminar un valor agrego la Key
        mapaEmpleados.remove(1525);
    }
}
