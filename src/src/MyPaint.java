package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MyPaint extends JFrame{

    public MyPaint() {
        super("My Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocation(500, 200);
        setResizable(false);


        JPanel panel = new JPanel();
        JPanel rysowanie = new Rysowanie();
        panel.setBounds(0,0,660,443);
        setContentPane(rysowanie);
        panel.setLayout(null);
        setVisible(true);
    }
}
