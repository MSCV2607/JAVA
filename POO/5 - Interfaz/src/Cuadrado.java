//Palabra reservada implements para implementar una Interfaz [para implementar mas de una interfaz, separar las interfaces por coma como C#]
public class Cuadrado implements Figura , Dibujable {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un cuadrado");
    }
}
