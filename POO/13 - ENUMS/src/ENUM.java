public class ENUM {

    enum Color { ROJO, AZUL, AMARILLO, VERDE, ANARANJADO, NEGRO, BLANCO}

    public static void main(String[] args) {

        /*
        Color color = Color.ROJO;
        System.out.println("El color es: " + color); */

        for (Color c : Color.values()) {
            System.out.println(c);
        }

    }
}
