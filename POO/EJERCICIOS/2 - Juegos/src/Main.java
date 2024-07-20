import Logica.Videojuegos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Videojuegos> listaJuegos = new ArrayList<Videojuegos>();

        Videojuegos juego1 = new Videojuegos(1,"GTA","PS5",1,"Adultos");
        Videojuegos juego2 = new Videojuegos(2,"HALO","XBOX",1,"Adolescentes");
        Videojuegos juego3 = new Videojuegos(3,"SuperMario","Nintendo64",2,"Jovenes");
        Videojuegos juego4 = new Videojuegos(4,"Mario Party","Nintendo64",4,"Todos");
        Videojuegos juego5 = new Videojuegos(5,"Stardew Valley","Nintendo",1,"Todos");

        listaJuegos.add(juego1);
        listaJuegos.add(juego2);
        listaJuegos.add(juego3);
        listaJuegos.add(juego4);
        listaJuegos.add(juego5);

        //Titulo consola cantJugadores
        System.out.println("LISTA DE JUEGOS\n");
        for(Videojuegos juego : listaJuegos) {
            System.out.println("TITULO: " + juego.getTitulo());
            System.out.println("Consola: " + juego.getConsola());
            System.out.println("Cantidad de jugadores: " + juego.getCantidadJugadores());
            System.out.println("----------------------------------------------------------");
        }

        //Cambio de nombre y cantidad de jugadores juego 2 y 4
        juego2.setTitulo("Rocky");
        juego2.setCantidadJugadores(1);

        juego4.setTitulo("Zelda");
        juego4.setCantidadJugadores(1);

        System.out.println("\nJUEGOS CAMBIADOS");
        System.out.println("----------------------------------------------------------");
        System.out.println("TITULO: " + juego2.getTitulo());
        System.out.println("Consola: " + juego2.getConsola());
        System.out.println("Cantidad de jugadores: " + juego2.getCantidadJugadores());
        System.out.println("----------------------------------------------------------");
        System.out.println("TITULO: " + juego4.getTitulo());
        System.out.println("Consola: " + juego4.getConsola());
        System.out.println("Cantidad de jugadores: " + juego4.getCantidadJugadores());
        System.out.println("----------------------------------------------------------");

        for(Videojuegos juego:listaJuegos) {
            if(juego.getConsola().equals("Nintendo64") ) {
                System.out.println(juego);
            }
        }
    }
}
