package me.dsa.lab2;

import me.dsa.AbstractMainView;
import javax.swing.*;

public class MainView extends AbstractMainView {
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
