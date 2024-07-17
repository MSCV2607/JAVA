import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List + <TIPO DE DATO> + lista + inicializacion ArrayList con su tipo de dato
        //Posicion dinamica en memoria que guarda objetos personas
        List<Persona> liesta = new ArrayList<Persona>();

        //Lista .add (agrega persona)
        liesta.add(new Persona("Sebastian",24));
        liesta.add(new Persona("Messi",25));
        liesta.add(new Persona("Ibramovic",26));
        liesta.add(new Persona("Roberto",27));

        //Recorrer por indice
        //.size para recorrer la lista
        for (int i = 0; i < liesta.size(); i++) {
            System.out.println(liesta.get(i).getNombre() );
        }

        System.out.println("\nFOREACH\n");

        //Para recorrer con foreach creamos una variable [persona], por cada persona que este dentro de la lista hacer esto
        //Persona perso:lista
        for(Persona persona : liesta) {
            System.out.println(persona.getNombre());
        }

    }
}