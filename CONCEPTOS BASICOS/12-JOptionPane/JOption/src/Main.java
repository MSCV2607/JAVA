import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        String Nombre_Usuario = JOptionPane.showInputDialog("Ingrese su nombre del usuario");

        String edad = JOptionPane.showInputDialog("Ingrese su edad del usuario");

        int edad_usuario = Integer.parseInt(edad);
        edad_usuario++;

        System.out.println("Nombre Usuario: " + Nombre_Usuario + "\nEl ano que viene tendras: " + edad_usuario);

    }
}