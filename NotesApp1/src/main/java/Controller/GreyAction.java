package Controller;

import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GreyAction extends AbstractAction {

    private Panell panell;

    public GreyAction(Panell panell) {
        super("Grey");
        this.panell = panell;
    }

    public void actionPerformed(ActionEvent e) {
        panell.Grey();
    }

}
