import javax.swing.JFrame;

public class MovingDrawing extends Drawing {
    public MovingDrawing(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        MovingPolygon mp = new MovingPolygon(480, 270);
        mp.setPosition(0, 0).setDirection(10, 10);
    
        // create drawing, add polygons
        MovingDrawing drawing = new MovingDrawing(480, 270);
        drawing.add(mp);

        // set up the window frame
        JFrame frame = new JFrame("MovingDrawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);

        while (true) {
            drawing.step();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // do nothing
            }
        }
    }
}
