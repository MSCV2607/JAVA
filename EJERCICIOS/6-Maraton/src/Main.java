import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palabraCierre = " ";
        int numeroCierre = 0;

        int menoresAmin = 6;
        int menoresAmax = 10;

        int menoresBmin = 11;
        int menoresBmax = 17;

        int juvenilesMin = 18;
        int juvenilesMax = 30;

        int adultosMin = 31;
        int adultosMax = 50;

        int adultosMayoresMin = 50;
        int adultosMayoresMax = 100;

        String nombre = " ";
        int dni = 0;
        int edad = 0;
        String categoria = " ";

        do {
            nombre = " ";

            System.out.println("Por favor ingrese su nombre: ");
            nombre = scanner.nextLine();
            System.out.println("Por favor ingrese su dni: ");
            dni = scanner.nextInt();
            System.out.println("Por favor ingrese su edad: ");
            edad = scanner.nextInt();
            scanner.nextLine();

            if (edad >= menoresAmin && edad < menoresAmax) {
                categoria = "Menores A";
            } else if (edad >= menoresBmin && edad < menoresBmax) {
                categoria = "Menores B";
            } else if (edad >= juvenilesMin && edad < juvenilesMax) {
                categoria = "Juveniles";
            } else if (edad >= adultosMin && edad < adultosMax) {
                categoria = "Adultos";
            } else if (edad >= adultosMayoresMin && edad < adultosMayoresMax) {
                categoria = "Adultos Mayores";
            }

            System.out.println("A la persona " + nombre + " con DNI " + dni + " pertenece a la categoria " + categoria );

        }
        while (!nombre.equals("fin") && dni != 0); {
            System.out.println("PROGRAMA FINALIZADO");
        }



    }
}