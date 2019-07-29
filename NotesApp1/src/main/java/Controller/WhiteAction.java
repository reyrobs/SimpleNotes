package Controller;

import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class WhiteAction extends AbstractAction {

    private Panell panell;

    public WhiteAction(Panell panell) {
        super("White");
        this.panell = panell;
    }

    public void actionPerformed(ActionEvent e) {
        panell.White();
    }

}
