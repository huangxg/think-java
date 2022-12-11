import java.awt.Color;

public class RegularPolygon extends DrawablePolygon {
    public RegularPolygon(int nsides, int radius, Color color) {
        // validate the arguments
        if (nsides < 3) {
            throw new IllegalArgumentException("invalid nsides");
        }
        if (radius <= 0) {
            throw new IllegalArgumentException("invalid radius");
        }
        if (color == null) {
            throw new NullPointerException("invalid color");
        }

        // initialize DrawablePolygon attributes
        this.npoints = nsides;
        this.xpoints = new int[nsides];
        this.ypoints = new int[nsides];
        this.color = color;
    
        // the amount to rotate for each vertex (in radians)
        double theta = 2.0 * Math.PI / nsides;
    
        // compute x and y coordinates, centered at the origin
        for (int i = 0; i < nsides; i++) {
            double x = radius * Math.cos(i * theta);
            double y = radius * Math.sin(i * theta);
            xpoints[i] = (int) Math.round(x);
            ypoints[i] = (int) Math.round(y);
        }
    }

    public RegularPolygon(int nsides, int radius) {
        this(nsides, radius, Color.GRAY);
    }

    public RegularPolygon(int nsides) {
        this(nsides, 50);
    }
}
