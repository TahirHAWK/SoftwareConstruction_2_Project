package sheep;
import java.awt.*;

public class Head extends Organ{

	private Mouth mouth;
	private Ear ear1, ear2;
	private Eye eye1, eye2;
	private Nose nose;
	private int size;
	
	public Head(int height, int width, int size) {
		super((int)(height* 0.25),(int)( width* 0.32));
		this.size = size;
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
	if(size == 0 || size == 3) {
//		for size large
			ear1.drawAt(left, bottom);
			ear2.drawAt((int)(left-165), bottom);
			Drawing.pen().setColor(Color.LIGHT_GRAY);
			Drawing.pen().fillOval((int)(left-40), (int)(bottom +25), super.getWidth(), super.getHeight());
			
			eye1.drawAt(left, bottom);
			eye2.drawAt(left+50, bottom);
			mouth.drawAt(left, bottom);
			nose.drawAt(left, bottom);
	} else {
//		for size small
		ear1.drawAt(left-35, bottom-30);
		ear2.drawAt(left-85, bottom-30);
		Drawing.pen().setColor(Color.LIGHT_GRAY);
		Drawing.pen().fillOval((left-10), (int)(bottom+10), super.getWidth(), super.getHeight());
		
		eye1.drawAt(left+5, bottom+5);
		eye2.drawAt(left+20, bottom+5);
		mouth.drawAt(left, bottom);
//		nose.drawAt(left, bottom);
	}

	}

	public void setSize(int size) {
	this.size = size;
}
}