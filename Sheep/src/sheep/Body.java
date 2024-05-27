package sheep;
import java.awt.Color;
import java.awt.Graphics;

public class Body extends Organ{
	private Leg leg1, leg2, leg3, leg4;
	private Tail tail;
	
	Body(int height,int width){
		super(height, width);
//		leg 110, 20
		leg1 = new Leg((int)(height * 0.184), (int)(width * 0.0506));
		leg2 = new Leg((int)(height *  0.184), (int)(width * 0.0506));
		leg3 = new Leg((int)(height *  0.184), (int)(width * 0.0506));
		leg4 = new Leg((int)(height *  0.184), (int)(width * 0.0506));
//		 Tail(40, 20);
		tail = new Tail((int)(height *  0.0667), (int)(width * 0.0506));
	}
	
public void drawAt(int left, int bottom){
	
	leg1.drawAt(left+150, bottom+230);
	leg2.drawAt(left+100, bottom+220);
	leg3.drawAt(left+300, bottom+230);
	leg4.drawAt(left+250, bottom+220);
	tail.drawAt(left, bottom);
		
		Drawing.pen().setColor(Color.darkGray);
//		400, 250
		Drawing.pen().fillOval(left+10, bottom, (int)(super.getWidth()*1.012), (int)(super.getHeight()*0.41666667));
		
	
		
	}
}