package modelos;

import javax.swing.*;
import java.awt.*;

public class FrameMenu {

    public void mostrarFrameMenu() {
        JFrame frame = new JFrame("Dolar XChangeRate");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1240, 1240);
        frame.setLayout(new GridLayout(6,1));
        // Botones
        Button button1 = new Button("1) Dolar a Peso Argentino"); // ARG
        Button button2 = new Button("2) Dolar a Peso Mexicano"); // MXN
        Button button3 = new Button("3) Dolar a Euro"); // EUR
        Button button4 = new Button("4) Dolar a Real"); // BRL
        Button button5 = new Button("5) Dolar a Yen"); // JPY
        Button button6 = new Button("Salir");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);


        button1.addActionListener(e -> {
            FrameDinero frameDinero = new FrameDinero();
            frameDinero.mostrarFrameDinero("AED");
            frame.setVisible(false);
        });
        button2.addActionListener(e -> {
            FrameDinero frameDinero = new FrameDinero();
            frameDinero.mostrarFrameDinero("MXN");
            frame.setVisible(false);
        });
        button3.addActionListener(e -> {
            FrameDinero frameDinero = new FrameDinero();
            frameDinero.mostrarFrameDinero("EUR");
            frame.setVisible(false);
        });
        button4.addActionListener(e -> {
            FrameDinero frameDinero = new FrameDinero();
            frameDinero.mostrarFrameDinero("BRL");
            frame.setVisible(false);
        });
        button5.addActionListener(e -> {
            FrameDinero frameDinero = new FrameDinero();
            frameDinero.mostrarFrameDinero("JPY");
            frame.setVisible(false);
        });
        button6.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });

        frame.setVisible(true);
    }
}
