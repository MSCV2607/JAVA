import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palabra = " ";

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Para salir del programa usted debera ingrsar la palabra salir");
            palabra = scanner.nextLine();
        } while (!palabra.equals("salir")); {
            System.out.println("PROGRAMA FINALIZADO CON EXITO!!!!!");
        }

    }
}