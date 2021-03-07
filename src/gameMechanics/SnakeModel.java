package gameMechanics;

import java.awt.*;
import java.util.ArrayList;

public class SnakeModel {
    private ArrayList<Rectangle> body;
    private int w = Gameplay.WIDTH;
    private int h = Gameplay.HEIGHT;
    private int d = Gameplay.DIMENSION;

    public SnakeModel(){
        body = new ArrayList<>();

        Rectangle temp = new Rectangle(Gameplay.DIMENSION, Gameplay.DIMENSION);
        temp.setLocation(Gameplay.WIDTH / 2 * Gameplay.DIMENSION, Gameplay.HEIGHT / 2 * Gameplay.DIMENSION);
        body.add(temp);

        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 1) * d, (h / 2 - 1) * d);
        body.add(temp);

        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 2) * d, (h / 2 - 2) * d);
        body.add(temp);

        public ArrayList<Rectangle> getBody() {
            return body;
        }

        public void setBody(ArrayList<Rectangle> body) {
            this.body = body;
        }


    }
