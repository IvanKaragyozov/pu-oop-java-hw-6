import gameMechanics.Gameplay;

import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args){

        JFrame frame = new JFrame();

        Gameplay gameplay = new Gameplay();

        frame.setBounds(10,10,905,700);
        frame.setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(gameplay);


    }
}
