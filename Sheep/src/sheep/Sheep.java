package sheep;

import java.awt.*;

public class Sheep implements LocatedRectangle {
    // Properties
    private Head head;
    private Body body;

    // Constructor
    public Sheep() {
        head = new Head(150, 120);
        body = new Body();
    }

    // Methods
    public void drawAt(int left, int bottom, Graphics pen) {
        body.drawAt(left, bottom, pen);
        head.drawAt(left, bottom, pen);
    }

    public int width() {
        return 150;
    }

    public int height() {
        return 150;
    }

    public Point address() {
        return new Point(100, 100);
    }

    public void draw() {

    }
}
