import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the maximum number for the program: " );
        max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

    }
}