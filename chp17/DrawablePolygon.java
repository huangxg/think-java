import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

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
}
