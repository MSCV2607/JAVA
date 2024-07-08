import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numE;
        int horas;

        double sueldo=0;
        double bono;
        double jubilacion=0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese las horas trabajadas");
        horas = scanner.nextInt();
        System.out.println("1-Repositores\n2-Cajeros\n3-Supervisores");
        System.out.println("Por favor ingrese que categoria es el empleado");
        numE = scanner.nextInt();


        switch (numE) {
            case 1:
                sueldo = horas * 15890;
                break;
                case 2:
                    sueldo = horas * 25360.89;
                    bono = sueldo * 0.1;
                    sueldo += bono;
                    break;
                    case 3:
                        sueldo = horas * 35560.20;
                        jubilacion = sueldo * 0.11;
                        sueldo -= jubilacion;
                        break;
            default:
                System.out.println("Numero invalido");
                break;
        }

        System.out.println("El suledo del empleado sera de: "+sueldo);
    }
}