import Logica.Arbol;
import Logica.Arbusto;
import Logica.Flor;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Flor flor = new Flor();
        Arbusto arbusto = new Arbusto();

        arbol.queSoy();
        flor.queSoy();
        arbusto.queSoy();
    }
}
