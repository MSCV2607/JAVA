public class Main {
    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Caramelo");
        String contenido = cajaString.obtenerAlgo();
        System.out.println(contenido);

        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(23);
        Integer numero = cajaEnteros.obtenerAlgo();
        System.out.println(numero);
    }
}
