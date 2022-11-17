package me.dsa.lab2;

import me.dsa.shared.AbstractView;
import javax.swing.*;

public class MainView extends AbstractView {
    private JPanel content;
    private JButton ordenarButton;
    private JButton buscarButton;
    private JButton atrasButton;

    public MainView() {
        super();
        setContentPane(content);
        pack();
    }
}
