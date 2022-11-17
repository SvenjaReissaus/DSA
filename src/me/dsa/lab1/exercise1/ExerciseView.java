package me.dsa.lab1.exercise1;

import me.dsa.shared.AbstractView;
import me.dsa.shared.Collector;

import javax.swing.*;
import java.awt.*;

public final class ExerciseView extends AbstractView {
    private final Collector<Student> students = new Collector<>(new Student[10]);
    private JPanel content;
    private JButton back;
    private JLabel empty;
    private JButton add;
    private JPanel grid;

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
            addView.onSubmit(this::addToGrid);
        });
    }

    private void addToGrid(final Student student) {
        final int index = students.size();
        students.add(student);
        final JPanel panel = new JPanel(new GridLayout(1, 4));
        panel.add(new JLabel(student.getName()));
        panel.add(new JLabel(String.valueOf(student.getSemester())));
        panel.add(new JLabel(String.valueOf(student.getAverage())));
        final JPanel menu = new JPanel(new GridLayout(1, 2));
        final JButton edit = new JButton(editIcon);
        edit.setBorderPainted(false);
        final JButton delete = new JButton(deleteIcon);
        delete.addActionListener(e -> {
            students.remove(index);
            grid.remove(panel);
            grid.revalidate();
            grid.repaint();
            if (students.size() == 0) empty.setVisible(true);
        });
        delete.setBorderPainted(false);
        menu.add(edit);
        menu.add(delete);
        panel.add(menu);
        grid.setLayout(new GridLayout(students.size(), 1));
        grid.add(panel);
        if (students.size() != 0) empty.setVisible(false);
        pack();
    }

    private void deleteFromGrid(final int index) {

    }
}
