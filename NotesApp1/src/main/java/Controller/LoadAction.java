package Controller;

import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoadAction extends AbstractAction {

    private Panell panell;

    public LoadAction(Panell panell) {
        super("Load");
        this.panell = panell;
    }

    public void actionPerformed(ActionEvent e) {
        panell.loadAction();
    }
}
