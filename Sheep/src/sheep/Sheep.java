package sheep;

import java.awt.*;

public class Sheep implements LocatedRectangle {
    // Properties
    private Head head;
    private Body body;
    private int x, y;

    // Constructor
    public Sheep(int x , int y) {
//    	int x, int y, int height, int width
//    	150,120
    	this.x = x;
    	this.y = y;
    	
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

    @Override
    public Point address() {
        return new Point(x, y);
    }

    public void draw() {

    }
}
