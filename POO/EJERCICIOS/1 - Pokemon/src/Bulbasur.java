public class Bulbasur extends Pokemon implements IPlanta {
    public Bulbasur() {
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Bulbasur ataca con Placaje");
    }

    @Override
    protected void ataqueAranazo() {
        System.out.println("Bulbasur ataca con Aranazo");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Bulbasur ataca con Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasur ataca con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasur ataca con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasur ataca con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasur ataca con Latigo Cepa");
    }
}
