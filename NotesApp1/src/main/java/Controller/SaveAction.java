package Controller;

import View.Frame;
import View.Panell;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;


public class SaveAction extends AbstractAction {

   /* private JTextArea t = new JTextArea();
    private JFrame f = new JFrame();*/
    private Panell panell;
    public SaveAction(Panell panell) {
        super("Save");
        this.panell = panell;
    }


    public void actionPerformed(ActionEvent e) {
        panell.saveAction();
    }
}


