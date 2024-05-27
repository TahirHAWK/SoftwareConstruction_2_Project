package sheep;
import java.awt.*;

public class Head extends Organ{

	private Mouth mouth;
	private Ear ear1, ear2;
	private Eye eye1, eye2;
	private Nose nose;

	public Head(int height, int width) {
		super((int)(height* 0.25),(int)( width* 0.32));
//		mouth = 155,30
		mouth = new Mouth((int)(height* 0.26),(int)( width* 0.09));
//		Ear(100, 40)
		ear1 = new Ear((int)(height* 0.167),(int)( width* 0.09));
		ear2 = new Ear((int)(height* 0.167),(int)( width* 0.09));
//		Eye(-16, 70)
		eye1 = new Eye((int)(-(height* 0.025)),(int)( width* 0.15),height, width);
		eye2 = new Eye((int)(-(height* 0.025)),(int)( width* 0.15), height, width);
//		Nose(147, 20)
		nose = new Nose((int)(height * 0.245), (int)(width * 0.055));
	}
	
	

public void drawAt(int left, int bottom){
//	plan for tomorrow: readjust the co ordinates of head and ear. make sure the ear measures the starting co ordinates from the head.
		
		ear1.drawAt(left, bottom);
		ear2.drawAt((int)(left*0.5875), bottom);
System.out.println(left + ", " + bottom);
		Drawing.pen().setColor(Color.LIGHT_GRAY);
		Drawing.pen().fillOval((int)(left * 0.9), (int)(bottom * 1.084), super.getWidth(), super.getHeight());
		
		eye1.drawAt(left, bottom);
		eye2.drawAt(left+50, bottom);
		mouth.drawAt(left, bottom);
		nose.drawAt(left, bottom);

	}
}