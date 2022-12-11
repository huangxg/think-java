import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Drawing extends Canvas {
    protected ArrayList<Actor> list;

    public Drawing(int width, int height) {
        setSize(width, height);
        setBackground(Color.WHITE);
        list = new ArrayList<Actor>();
    }

    public void add(Actor actor) {
        list.add(actor);
    }

    public void paint(Graphics g) {
        for (Actor actor : list) {
            actor.draw(g);
        }
    }

    public void step() {
        for (Actor actor : list) {
            actor.step();
        }
        repaint();
    }

    public static void main(String[] args) {

        // create some regular polygons
        RegularPolygon p1 = new RegularPolygon(3, 50, Color.GREEN);
        RegularPolygon p2 = new RegularPolygon(6, 50, Color.ORANGE);
        RegularPolygon p3 = new RegularPolygon(360, 50, Color.BLUE);
    
        // move them out of the corner
        p1.translate(100, 80);
        p2.translate(250, 120);
        p3.translate(400, 160);
    
        // create drawing, add polygons
        Drawing drawing = new Drawing(500, 250);
        drawing.add(p1);
        drawing.add(p2);
        drawing.add(p3);
        // set up the window frame
        JFrame frame = new JFrame("Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    }
}
