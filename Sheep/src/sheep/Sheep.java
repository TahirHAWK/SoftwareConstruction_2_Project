package sheep;

import java.awt.*;

public class Sheep {
	private Head head;
	private Eye eye1, eye2;
	private Mouth mouth;
	private Ear ear1, ear2;
	private Body body;
	private Tail tail;
	
	public Sheep() {
		head = new Head();
		eye1 = new Eye();
		eye2 = new Eye();
		body = new Body();
		tail = new Tail();
		mouth = new Mouth();
		ear1 = new Ear();
		ear2 = new Ear();
		}
	
	public void drawAt(int x, int y, Graphics pen){
		tail.drawAt(x, y, pen);
		body.drawAt(x, y, pen);
		ear1.drawAt(x, y, pen);
		ear2.drawAt(x-170, y, pen);
		head.drawAt(x, y, pen);
		eye1.drawAt(x, y, pen);
		eye2.drawAt(x+50, y, pen);
		mouth.drawAt(x, y, pen);
		
		
	}
}
