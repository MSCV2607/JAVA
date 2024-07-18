public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Pikachu ataca con Placaje");
    }

    @Override
    protected void ataqueAranazo() {
        System.out.println("Pikachu ataca con Aranazo");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Pikachu ataca con Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ataca con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu ataca con Punio Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu ataca con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu ataca con Rayo Cargado");
    }
}
