package View;

import Controller.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {

        JMenuBar menubar = new JMenuBar();
        Panell panel = new Panell();

        /**
        * Creating Items on menu bar
        */

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");


        /**
         * Creating subItems for menu bar Options
         */

        JMenuItem aNew = new JMenuItem(new NewAction());
        JMenuItem save = new JMenuItem(new SaveAction(panel));
        JMenuItem load = new JMenuItem(new LoadAction(panel));
        JMenuItem clear = new JMenuItem(new ClearAction(panel));
        JMenuItem exit = new JMenuItem(new ExitAction());

        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem redo = new JMenuItem("Redo");

        JMenu color = new JMenu("Color");

        //Creating a subMenu for Background Colors
        JMenu background = new JMenu("Background");

        JMenuItem white = new JMenuItem(new WhiteAction(panel));
        JMenuItem lightBlue = new JMenuItem(new BlueAction(panel));
        JMenuItem grey = new JMenuItem(new GreyAction(panel));

        JMenuItem Blue = new JMenuItem(new ColorBlue(panel));
        JMenuItem Black = new JMenuItem(new ColorBlack(panel));

        /**
         * Adding menu bar Options to menu bar and subItems
         */

        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);

        file.add(aNew);
        file.add(save);
        file.add(load);
        file.add(clear);
        file.add(exit);

        edit.add(undo);
        edit.add(redo);

        view.add(color);
        view.add(background);

        background.add(white);
        background.add(lightBlue);
        background.add(grey);

        color.add(Blue);
        color.add(Black);

        /**
         * Creating Text Area for Notes
         */
        getContentPane().add(panel.getTextArea());
        panel.getTextArea().setSize(new Dimension(800, 500));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setJMenuBar(menubar);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Notes App");
        this.setVisible(true);
    }
}