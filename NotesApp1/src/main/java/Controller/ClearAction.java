package Controller;

import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClearAction extends AbstractAction {

    private Panell panell;

    public ClearAction(Panell panell) {
        super("Clear");
        this.panell = panell;
    }

    public void actionPerformed(ActionEvent e) {
        panell.Clear();
    }


}
