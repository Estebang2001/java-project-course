package modelos;

import javax.swing.*;
import java.awt.*;

public class FrameDinero {


    public void mostrarFrameDinero(String s) {
        // Creación de frame
        JFrame frame = new JFrame("Dolar XChangeRate");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1240, 1240);
        frame.setLayout(new GridLayout(5,1));
        // Creación de text title
        JLabel text = new JLabel("Por favor digite la cantidad a cambiar");
        text.setSize(400, 100);
        text.getHorizontalAlignment();
        // Creación de text área
        TextArea textArea = new TextArea();
        textArea.setSize(100,100);
        // Botón de enviar
        Button button = new Button("Enviar");

        // Botón de salir

        Button salir = new Button("Salir");

        // Botón de volver

        Button volver = new Button("Volver");

        // Verificar que la entrada sea un integer
        VerificarInteger verificarInteger = new VerificarInteger();
        button.addActionListener(e -> {
            if (!verificarInteger.verificarInteger(textArea.getText())) {
                JOptionPane.showMessageDialog(null, "Por favor digite un número entero");
            } else {
                SolicitudHTTP solicitudHTTP = new SolicitudHTTP();
                solicitudHTTP.realizarSolicitud(s);
                String dinero = s;

                switch (dinero) {
                    case "AED":
                        dinero = "Pesos Argentinos";
                        break;
                    case "MXN":
                        dinero = "Pesos Mexicanos";
                        break;
                    case "EUR":
                        dinero = "Euros";
                        break;
                    case "BRL":
                        dinero = "Reales";
                        break;
                    case "JPY":
                        dinero = "Yenes";
                        break;
                }
                JOptionPane.showMessageDialog(null, "La cantidad de " + textArea.getText() +
                        " dolares en " + dinero + " es: " + solicitudHTTP.realizarSolicitud(s) *
                        Integer.parseInt(textArea.getText()));

            }
        });

        // Salir del programa

        salir.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });

        // Volver al menu pricipal

        volver.addActionListener(e -> {
            FrameMenu frameMenu = new FrameMenu();
            frameMenu.mostrarFrameMenu();
            frame.setVisible(false);
        });

        // Agregar
        frame.add(text);
        frame.add(textArea);
        frame.add(button);
        frame.add(salir);
        frame.add(volver);
        frame.setVisible(true);

    }



}
