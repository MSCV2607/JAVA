public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Squirtle ataca con Placaje");
    }

    @Override
    protected void ataqueAranazo() {
        System.out.println("Squirtle ataca con Aranazo");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Squirtle ataca con Mordisco");
    }

    @Override
    public void tacarHidrobomba() {
        System.out.println("Squirtle ataca con Hidro Bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con Burbujas");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle ataca con Hidro Pulso");
    }
}
