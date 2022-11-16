package me.dsa;

import me.dsa.shared.AbstractView;

import javax.swing.*;

public final class MainView extends AbstractView {
    private JPanel content;
    private JButton lab1Button;

    public MainView() {
        super("@AED");
        setContentPane(content);
        pack();

        lab1Button.addActionListener(e -> {
            dispose();
            new me.dsa.lab1.MainView().setVisible(true);
        });
    }
}
