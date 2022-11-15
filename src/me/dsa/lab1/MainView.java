package me.dsa.lab1;

import me.dsa.AbstractMainView;

import javax.swing.*;

public final class MainView extends AbstractMainView {
    private JPanel content;

    public MainView() {
        super();
        setContentPane(content);
        pack();
    }
}
