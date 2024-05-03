package sheep;
import java.awt.*;

public class Sheep implements LocatedRectangle{
	private Head head; 
	private Body body;
	
	public Sheep() {
		head = new Head(150, 120);
		body = new Body();		
		}
	
	public void drawAt(int x, int y, Graphics pen){	
		body.drawAt(x, y, pen);
		head.drawAt(x, y, pen);	
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