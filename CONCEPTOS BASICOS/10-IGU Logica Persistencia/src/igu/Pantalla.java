package igu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla {
    private JTextField textField1;
    private JTextField textField2;
    private JButton copiar;

    public Pantalla() {
        copiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField1.getText();
                textField2.setText(texto);
            }
        });
    }
}
