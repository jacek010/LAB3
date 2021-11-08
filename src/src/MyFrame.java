package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{

    public MyFrame() {
        super("Login screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocation(500, 500);
        setResizable(false);


        JPanel panel = new Panel();
        add(panel);

        setVisible(true);
    }
}
