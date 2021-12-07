package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import static java.lang.Thread.sleep;

public class MyFrame extends JFrame{

    public MyFrame() {
        super("Running button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocation(500, 200);
        setResizable(false);


        JPanel panel = new JPanel();
        JPanel rysowanie = new Rysowanie();
        panel.setBounds(0,0,660,443);
        setContentPane(panel);
        panel.setLayout(null);





        JButton runButton = new JButton("Run out");
        runButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(e.getX()<5)System.out.println("11");
                else {
                    Random generator = new Random();
                    runButton.setLocation(generator.nextInt(500) + 100, generator.nextInt(500) + 100);
                }
            }
        });
        runButton.addActionListener(e1 -> {
            panel.setBackground(Color.yellow);
        });
        runButton.setBounds(0,350,100,40);
        panel.add(runButton);




        setVisible(true);
    }
}
