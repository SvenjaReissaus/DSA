package me.dsa.lab1.exercise1;

import me.dsa.shared.AbstractView;

import javax.swing.*;
import java.util.ArrayList;

public final class ExerciseView extends AbstractView {
    private final ArrayList<Student> students = new ArrayList<>();
    private JPanel content;
    private JButton back;
    private JLabel empty;
    private JButton add;

    public ExerciseView() {
        super();
        setTitle("@AED - Laboratorio #1 - Ejercicio #1");
        setContentPane(content);
        pack();

        back.addActionListener(e -> {
            dispose();
            new me.dsa.lab1.MainView().setVisible(true);
        });

        add.addActionListener(e -> {
            final AddView addView = new AddView();
            addView.setVisible(true);
            addView.onSubmit(students::add);
        });
    }
}
