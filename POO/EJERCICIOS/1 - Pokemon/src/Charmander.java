public class Charmander extends Pokemon implements IFuego {
    public Charmander() {
    }


    @Override
    protected void ataquePlacaje() {
        System.out.println("Charmander ataca con Placaje");
    }

    @Override
    protected void ataqueAranazo() {
        System.out.println("Charmander ataca con Aranazp");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Charmander ataca con Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataca con Punio de Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataca con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataca con Lanza Lllamas");
    }
}
