package gameMechanics;

import javax.swing.*;
import java.awt.*;

public class Gameplay extends JFrame {

    public Gameplay(){

    }

    public void paint(Graphics g){

        // draws title image border
        g.setColor(Color.WHITE);
        g.drawRect(24,10,851,55);

        // draws border for the gameplay
        g.setColor(Color.WHITE);
        g.drawRect(24,74,851,577);



        // draws background
        g.setColor(Color.BLACK);
        g.fillRect(25,75,850,575);

    }

}
