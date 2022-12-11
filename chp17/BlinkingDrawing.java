import java.awt.Color;
import javax.swing.JFrame;

public class BlinkingDrawing extends Drawing {
    public BlinkingDrawing(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {

        // create some regular polygons
        DrawablePolygon p1 = new BlinkingPolygon(3, 50, Color.GREEN);
        DrawablePolygon p2 = new BlinkingPolygon(6, 50, Color.ORANGE);
        DrawablePolygon p3 = new BlinkingPolygon(360, 50, Color.BLUE);
    
        // move them out of the corner
        p1.translate(100, 80);
        p2.translate(250, 120);
        p3.translate(400, 160);
    
        // create drawing, add polygons
        BlinkingDrawing drawing = new BlinkingDrawing(500, 250);
        drawing.add(p1);
        drawing.add(p2);
        drawing.add(p3);
        // set up the window frame
        JFrame frame = new JFrame("BlinkingDrawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);

        while (true) {
            drawing.step();
            try {
                Thread.sleep(1000 / 30);
            } catch (InterruptedException e) {
                // do nothing
            }
        }
    }
}
