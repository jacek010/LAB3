package src;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

    public MyFrame(){
        super("Nazwa okienka");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(true);
        setVisible(true);
    }
}
