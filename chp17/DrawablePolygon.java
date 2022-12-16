import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Arrays;

public class DrawablePolygon extends Polygon implements Actor {
    protected Color color;

    public DrawablePolygon() {
        super();
        color = Color.GRAY;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(this);
    }

    public void step() {
        // do nothing
    }

    public String toString() {
        String str = String.format("DrawablePolygon of %s color and %d points\n", 
                                   color, npoints);

        for (int i = 0; i < npoints; i++) {
            str += String.format("(%d, %d)\n", xpoints[i], ypoints[i]);
        }

        return str;
    }

    public static void main(String[] args) {
        DrawablePolygon dp = new DrawablePolygon();
        dp.addPoint(0, 0);
        dp.addPoint(10, 10);
        dp.addPoint(10, 0);

        System.out.println(dp);
    }
}
