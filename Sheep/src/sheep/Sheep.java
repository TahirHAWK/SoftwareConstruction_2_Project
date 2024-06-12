package sheep;

import java.awt.*;

public class Sheep implements LocatedRectangle {
    // Properties
    private Head head;
    private Body body;
    private int x, y;
    private int width, height, size;
    

    // Constructor
    public Sheep(int x , int y, int height, int width, Color bodyColor) {
//    	int x, int y, int height, int width
//    	150,120
    	this.x = x;
    	this.y = y;
    	this.width= width;
    	this.height= height; 
    	
        head = new Head(height, width);
        body = new Body(height, width, bodyColor);
    }

    // Methods
    public void drawAt(int left, int bottom) {
        body.drawAt(left, bottom);
        head.drawAt(left, bottom);
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
    	drawAt(x, y);
    }
    
    public Body getBody() {
    	return this.body;
    }
    public void setSize(int size) {
    	this.size = size;
    }
}
