
public class main {
    public static void main(String[] args) {

        Empleado trabajador1 = new Empleado("Mario");
        Empleado trabajador2 = new Empleado("Paco");
        Empleado trabajador3 = new Empleado("Ramos");
        Empleado trabajador4 = new Empleado("Maria");

        trabajador1.cambioSeccion("Jefe");

        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getSeccion());
        System.out.println(trabajador1.getID());

        System.out.println("------------------------------------------------");

        System.out.println(trabajador2.getNombre());
        System.out.println(trabajador2.getSeccion());
        System.out.println(trabajador2.getID());

        System.out.println("------------------------------------------------");

        System.out.println(trabajador3.getNombre());
        System.out.println(trabajador3.getSeccion());
        System.out.println(trabajador3.getID());

        System.out.println("-----------------------------------------------");

        System.out.println(trabajador4.getNombre());
        System.out.println(trabajador4.getSeccion());
        System.out.println(trabajador4.getID());
    }
}


