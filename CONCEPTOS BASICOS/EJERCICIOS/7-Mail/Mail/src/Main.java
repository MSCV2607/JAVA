import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        boolean arrona = false;

        String mail = JOptionPane.showInputDialog("Introduce tu email");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arrona = true;
            }
        }
        if (arrona == true) {
            System.out.println("Mail correcto");
        }
        else {
            System.out.println("Mail incorrecto");
        }
    }
}