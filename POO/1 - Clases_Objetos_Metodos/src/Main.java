import Logica.Alumno;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(1,"Sebastian","Opp");
        Alumno alumno2 = new Alumno();

        System.out.println("La ID del alumno uno es: " + alumno1.getId());
        System.out.println("El nombre del alumno uno es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno uno es: " + alumno1.getApellido());

        alumno2.setNombre("Luis");
        alumno2.setApellido("Ram");
        alumno2.setId(2);

        System.out.println("\nALUMNO 2");
        System.out.println("La ID del alumno dos es: " + alumno2.getId());
        System.out.println("El nombre del alumno dos es: " + alumno2.getNombre());
        System.out.println("El apellido del alumno dos es: " + alumno2.getApellido());

        System.out.println("\nALUMNO 1 MODIFICADO");
        //Cambio valor del ID del alumno 1
        alumno1.setId(8);
        System.out.println("La ID del alumno uno es: " + alumno1.getId());
        System.out.println("El nombre del alumno uno es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno uno es: " + alumno1.getApellido());

    }
}