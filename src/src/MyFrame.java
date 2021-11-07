package src;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        super("Nazwa okienka");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocation(500, 500);
        setResizable(true);
        setLayout(new FlowLayout());

        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));

        JPanel buttonPanel = new Przycisk();
        add(buttonPanel);
        pack();
        setVisible(true);
    }
}
