import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setId(1);
        auto.setMarca("Renault");
        auto.setModelo("Duster");

        List<Propietario> listaPropietarios = new ArrayList<Propietario>();

        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(27L);
        prop1.setNombre("Mauro");
        prop1.setApellido("Locaust");

        prop2.setId(28L);
        prop2.setNombre("Sebastian");
        prop2.setApellido("Manchut");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        auto.setListaPropietario(listaPropietarios);

        System.out.println(auto.getListaPropietario().toString());
    }
}
