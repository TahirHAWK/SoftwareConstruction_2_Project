package sheep;

import java.awt.*;

public class Sheep implements LocatedRectangle {
    // Properties
    private Head head;
    private Body body;
    private int x, y;
    private int width, height, size;
    

    // Constructor
    public Sheep(int x , int y, Color bodyColor, int size) {
    	this.x = x;
    	this.y = y;
    	this.size = size;
		 if(size == 0 || size == 3) {
			 height = 600;
			 width = (int)(height * 0.6603773);
			 
		 } else  {
			 height = 200;
			 width = (int)(height * 0.6603773);
			 
		 }
    	
        head = new Head(height, width, size);
        body = new Body(height, width, bodyColor, size);
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
    public Head getHead() {
    	return this.head;
    }
    
    
    public void setSize(int size) {
    	this.size = size;
    	getBody().setSize(size);
    	getHead().setSize(size);   	
    }
}
