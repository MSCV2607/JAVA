public class Conversiones {

    public static void main(String[] args) {
        double num = 1.84;

        //No redondea, en la coma del double se corta
        //Casteo a entero
        int numInt = (int)num;

        //Casteo a long
        long numLong = (long)num;

        //Conversion de tipos de clase a tipo de dato primitivo
        String cantidad = "15";
        String precio = "150.27";

        //Integer = int
        int canEntero = Integer.parseInt(cantidad);
        //Double = double
        double precioDouble = Double.parseDouble(precio);

        System.out.println("El precio total es de: " + canEntero * precioDouble);

        int edad = 23;
        double estatura = 1.84;

        //Pasar datos primitivos a String
        String edadString = String.valueOf(edad);
        String doubleString = String.valueOf(estatura);

    }

}
