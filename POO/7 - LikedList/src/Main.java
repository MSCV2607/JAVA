import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();

        //FIFO --> primero en entrar primero en salir

        lista.add(new Persona("Mauro",24));
        lista.add(new Persona("Messi",25));
        lista.add(new Persona("Leonel",26));
        lista.add(new Persona("Palas",27));

        //Agregar al principio -- Agregar 0
        lista.add(0, new Persona("Sebastian",24));

        //SOLO SE RECORRE CON UN FOREACH
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }

    }
}