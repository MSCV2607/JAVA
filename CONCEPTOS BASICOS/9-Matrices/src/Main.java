import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3]; //3 filas y 3 columnas

        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[2][2] = 24;

        Scanner scanner = new Scanner(System.in);

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor para la posicion "+f+" "+c);
                matriz[f][c] = scanner.nextInt();
            }
        }
    }
}