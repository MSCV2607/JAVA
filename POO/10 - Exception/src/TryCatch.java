public class TryCatch {
    public static void main(String[] args) {

        /*
        try {
            int resultado = 3/0;
        } catch (Exception e) {
            System.out.println("No se puede dividir por 0");
        }*/
        int edades[] = {15,20,24,28};

        try {
            System.out.println("La edad de al posicion es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("Indice inexistente");
        }
    }
}
