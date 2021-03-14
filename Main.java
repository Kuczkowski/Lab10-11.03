package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame Okieno = new JFrame("Konwersja");
        Okieno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Okieno.setSize(250, 250);
        Okieno.setLocationRelativeTo(null);
        Okieno.setLayout(null);

        JLabel num1 = new JLabel("°C");
        num1.setBounds(55, 20, 50, 30);
        Okieno.add(num1);

        JLabel wynik = new JLabel();
        wynik.setBounds(20, 70, 200, 30);
        Okieno.add(wynik);

        JTextField textNum1 = new JTextField();
        textNum1.setBounds(20, 20, 35, 30);
        Okieno.add(textNum1);


        JButton button = new JButton("Konwersja");
        button.setBounds(20, 50, 100, 30);
        Okieno.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String num1 = textNum1.getText();

                double sum = Integer.parseInt(num1);
                wynik.setText("Fahrenheity: "+((sum*1.8)+32));
                //Tutaj bym chciał napisać że podany wzór jest troszeczkę nieprawidłowy więc zmieniłem
            } }
            );
        Okieno.setVisible(true);
    } }