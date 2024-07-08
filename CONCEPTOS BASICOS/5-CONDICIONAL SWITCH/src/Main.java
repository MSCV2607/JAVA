public class Main {
    public static void main(String[] args) {
        int dia = 5;
        String nombreDia;
//ctrl + alt + l
        switch (dia) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miercoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sabado";
                break;
            default:
                nombreDia = "No existe el dia";
                break;
        }
        System.out.println("El dia es: " + nombreDia);

    }
}