package Controller;

import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ColorBlack extends AbstractAction {

    private Panell panell;

    public ColorBlack(Panell panell) {
        super("Black");
        this.panell = panell;
    }

    public void actionPerformed(ActionEvent e) {
        panell.BlackColor();
    }
}
