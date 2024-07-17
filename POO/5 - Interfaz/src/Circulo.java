//Palabra reservada implements para implementar una Interfaz [para implementar mas de una interfaz, separar las interfaces por coma como C#]
public class Circulo implements Figura , Dibujable, Rotable {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double result = Math.PI * radio * radio;
        return result;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un redondo");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    }
}
