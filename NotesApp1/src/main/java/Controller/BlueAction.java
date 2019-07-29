package Controller;

import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BlueAction extends AbstractAction {

    private Panell panell;

    public BlueAction(Panell panell) {
        super("Blue");
        this.panell = panell;
    }

    public void actionPerformed(ActionEvent e) {
        panell.Blue();
    }
}
