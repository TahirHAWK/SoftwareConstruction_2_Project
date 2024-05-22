package sheep;
import java.awt.*;

public class Head extends Organ{

	private Mouth mouth;
	private Ear ear1, ear2;
	private Eye eye1, eye2;
	private Nose nose;

	public Head(int height, int width) {
		super(height, width);
		
		mouth = new Mouth(155, 30);
		ear1 = new Ear(100, 40);
		ear2 = new Ear(100, 40);
		eye1 = new Eye(-16, 70);
		eye2 = new Eye(-16, 70);
		nose = new Nose(147, 20);
	}
	
	

public void drawAt(int left, int bottom, Graphics pen){
	
		
		ear1.drawAt(left, bottom, pen);
		ear2.drawAt(left-165, bottom, pen);

		pen.setColor(Color.LIGHT_GRAY);
		pen.fillOval(left-40, bottom+25, super.getWidth(), super.getHeight());
		
		eye1.drawAt(left, bottom, pen);
		eye2.drawAt(left+50, bottom, pen);
		mouth.drawAt(left, bottom, pen);
		nose.drawAt(left, bottom, pen);

	}
}