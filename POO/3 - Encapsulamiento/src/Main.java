public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(8,"Sebastian","Bals");

        System.out.println(alumno2.getId());
        System.out.println(alumno2.getNombre());
        System.out.println(alumno2.getApellido());
    }
}