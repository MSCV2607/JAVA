import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPelea {
    public static void main(String[] args) {

        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();

        /*
        Map<Integer,Pokemon> pokemons = new HashMap<Integer,Pokemon>();
        pokemons.put(1,charmander);
        pokemons.put(2,bulbasur);
        pokemons.put(3,squirtle);
        pokemons.put(4,pikachu);

        System.out.println(pokemons.values());
*/
        List<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(charmander);
        pokemons.add(bulbasur);
        pokemons.add(squirtle);
        pokemons.add(pikachu);

        System.out.println("--------TODOS LOS POKEMOS SON--------");
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }

        System.out.println("\nPOKEMON ATAQUE");
        charmander.atacarLanzallamas();
        pikachu.ataqueMordisco();
        pikachu.ataqueMordisco();
        bulbasur.ataqueMordisco();
        squirtle.ataqueMordisco();
        squirtle.ataqueMordisco();
    }
}
