package Controller;

import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ColorBlue extends AbstractAction {

    private Panell panell;

    public ColorBlue(Panell panell) {
        super("Blue");
        this.panell = panell;
    }

    public void actionPerformed(ActionEvent e) {
        panell.BlueColor();
    }
}
