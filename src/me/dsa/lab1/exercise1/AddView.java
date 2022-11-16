package me.dsa.lab1.exercise1;

import me.dsa.shared.AbstractView;
import me.dsa.shared.IFormResult;
import me.dsa.shared.annotations.*;
import me.dsa.shared.annotations.Number;

import javax.swing.*;

public final class AddView extends AbstractView {
    private JButton create;
    @Required
    @StringLength(min = 1, max = 100)
    public JTextField name;
    @Required
    @Number(min = 0)
    public JTextField semesters;
    @Required
    @Number(min = 0)
    public JTextField average;
    private JButton cancel;
    private JPanel content;
    @ValidationFor(name = "name")
    public JLabel nameValidation;
    @ValidationFor(name = "semesters")
    public JLabel semestersValidation;
    @ValidationFor(name = "average")
    public JLabel averageValidation;

    private IFormResult<Student> result;

    public AddView() {
        super("@AED - Laboratorio #1 - Ejercicio #1 - Agregar", WindowConstants.DO_NOTHING_ON_CLOSE);
        cancel.addActionListener(e -> dispose());
        setContentPane(content);
        pack();

        create.addActionListener(e -> {
            boolean isValid = valid(AddView.class);
            pack();
            if (!isValid) return;
            result.action(new Student(name.getText(), Integer.parseInt(semesters.getText()), Double.parseDouble(average.getText())));
            dispose();
        });
    }

    public void onSubmit(IFormResult<Student> result) {
        this.result = result;
    }
}
