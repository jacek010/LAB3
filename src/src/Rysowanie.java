package src;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Rysowanie extends JPanel implements MouseInputListener {

    private int inX, inY, outX, outY;
    private char key='n';
    private JPanel workspace;
    public Rysowanie(){
        setFocusable(true);
        workspace = new JPanel();
        workspace.setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                key=e.getKeyChar();
                if(key=='r') {
                    System.out.println("Rysujesz prostokąt");
                }
                else if(key=='o'){
                    System.out.println("Rysujesz owal");
                }
                else if(key=='l'){
                    System.out.println("Rysujesz owal z 'zaimplementowaną' 'kwadraturą koła'");
                }
                e.consume();
            }
        });
        this.add(workspace,BorderLayout.CENTER);
        setVisible(true);

    }
    public void paint(Graphics g){
        super.paint(g);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
//        Graphics g = this.getGraphics();
//        g.drawRect(300,300,50,70);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        inX=e.getX();
        inY=e.getY();
        //System.out.println("InX"+inX);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        outX=e.getX();
        outY=e.getY();
        //System.out.println("OutX"+outX);
        if(key=='o') {
            Graphics g = this.getGraphics();
            g.fillOval(inX, inY, outX - inX, outY - inY);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int size = 50;
        outX=e.getX();
        outY=e.getY();
        //System.out.println("OutX"+outX);
        Graphics g = this.getGraphics();
        if(key=='r') {
            g.fillRect(inX,inY,outX-inX, outY-inY);
        }
        else if(key=='l'){
            g.fillOval(inX-20,inY-20,outX-inX, outY-inY);
            //g.fillOval(e.getX()-30, e.getY()-(size/2), size, size);
        }
        e.consume();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
