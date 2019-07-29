package View;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Panell extends JPanel {

    private JTextArea textArea = new JTextArea();

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void saveAction() {
        JFileChooser j = new JFileChooser();

        int r = j.showSaveDialog(null);

        if (r == JFileChooser.APPROVE_OPTION) {

            File fi = new File(j.getSelectedFile().getAbsolutePath());

            try {
                FileWriter wr = new FileWriter(fi, false);

                BufferedWriter w = new BufferedWriter(wr);

                w.write(textArea.getText());

                w.flush();
                w.close();
            }
            catch (Exception evt) {
                System.out.println("OHNO");
            }
        }
    }

    public void loadAction() {
            JFileChooser j = new JFileChooser();

            int r = j.showOpenDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                File fi = new File(j.getSelectedFile().getAbsolutePath());

                try {
                    String s1 = "", sl = "";

                    FileReader fr = new FileReader(fi);

                    BufferedReader br = new BufferedReader(fr);

                    sl = br.readLine();

                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }

                    textArea.setText(sl);
                }
                catch (Exception evt) {
                    System.out.println("YESS");
                }
            }
            else
                System.out.println("User cancelled");
            }

    public void Grey() {
        textArea.setBackground(Color.GRAY);
    }

    public void White() {
        textArea.setBackground(Color.WHITE);
    }

    public void Blue() {
        textArea.setBackground(Color.BLUE);
    }

    public void Clear() {
        textArea.setText(null);
        textArea.repaint();
    }

    public void BlueColor() {
        textArea.setForeground(Color.BLUE);
    }

    public void BlackColor() {
        textArea.setForeground(Color.BLACK);
    }

}