public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double result = Math.PI * radio * radio;
        return result;
    }
}
