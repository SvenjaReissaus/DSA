package me.dsa.lab1;

import me.dsa.shared.AbstractView;
import me.dsa.lab1.exercise1.ExerciseView;

import javax.swing.*;

public final class MainView extends AbstractView {
    private JPanel content;
    private JButton back;
    private JButton exercise1Button;
    private JButton exercise2Button;
    private JButton exercise3Button;
    private JButton exercise4Button;
    private JButton exercise5Button;
    private JButton exercise6Button;
    private JLabel tooltip;

    public MainView() {
        super("@AED - Laboratorio #1");
        setContentPane(content);
        pack();

        back.addActionListener(e -> {
            dispose();
            new me.dsa.MainView().setVisible(true);
        });

        exercise1Button.addActionListener(e -> {
            dispose();
            new ExerciseView().setVisible(true);
        });

        addTooltip(exercise1Button, tooltip, "En una escuela se tienen que almacenar en arreglos");
        addTooltip(exercise2Button, tooltip, "Una empresa registra para cada uno de sus clientes");
        addTooltip(exercise3Button, tooltip, "El departamento de personal de una empresa necesita almacenar");
        addTooltip(exercise4Button, tooltip, "Una compañía necesita almacenar en arreglos la siguiente información");
        addTooltip(exercise5Button, tooltip, "Una inmobiliaria necesita almacenar la siguiente información");
        addTooltip(exercise6Button, tooltip, "Una compañía quiere almacenar en arreglos ordenados");
    }
}
