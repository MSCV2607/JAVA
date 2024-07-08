public class Main {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 20;
        int numAux;

        numAux = num1;
        num1 = num2;
        num2 = numAux;

        System.out.println("El primer numero es" + num1 + " y el segundo numero es" + num2);

    }

}