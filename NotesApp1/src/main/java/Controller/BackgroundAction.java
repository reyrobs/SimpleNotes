package Controller;

import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BackgroundAction extends AbstractAction {

    private Panell panell;

    public BackgroundAction(Panell panell) {
        super("Backgound");
        this.panell = panell;
    }

    public void actionPerformed(ActionEvent e) {
        panell.loadAction();
    }

}
