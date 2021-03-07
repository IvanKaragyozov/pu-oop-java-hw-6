package gameMechanics;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gameplay implements MouseListener {

    private SnakeModel player;
    private Food food;
    private Graphics graphics;
    private JFrame frame;

    public static final int WIDTH  = 30;
    public static final int HEIGHT = 30;
    public static final int DIMENSION = 20;

    public Gameplay(){

        frame = new JFrame();
        frame.setTitle("Snake Game");
        frame.setSize(WIDTH * DIMENSION, HEIGHT * DIMENSION);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
