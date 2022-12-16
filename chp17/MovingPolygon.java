public class MovingPolygon extends RegularPolygon implements Actor {
    private int xpos, ypos;
    private int dx, dy;
    private int xLimit, yLimit;

    public MovingPolygon(int xLimit, int yLimit) {
        super(64, 8);
        this.xLimit = xLimit;
        this.yLimit = yLimit;
    }

    public MovingPolygon setPosition(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;

        return this;
    }

    public MovingPolygon setDirection(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;

        return this;
    }

    public void step() {
        translate(dx, dy);
        xpos += dx;
        ypos += dy;

        if (xpos < 0 || xpos > xLimit) {
            dx = -dx;
            System.out.println("change x direction");
        }

        if (ypos < 0 || ypos > yLimit) {
            dy = -dy;
            System.out.println("change y direction");
        }
    }
}
