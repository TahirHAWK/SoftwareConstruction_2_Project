package sheep;
import java.awt.Color;
import java.awt.Graphics;

public class Body extends Organ{
	private Leg leg1, leg2, leg3, leg4;
	private Tail tail;
	private Color bodyColor;
	private int size;
	
	Body(int height,int width, Color bodyColor, int size){
		super(height, width);
		this.bodyColor = bodyColor;
		this.size = size;
//		leg 110, 20
		leg1 = new Leg((int)(height * 0.184), (int)(width * 0.0506), size);
		leg2 = new Leg((int)(height *  0.184), (int)(width * 0.0506), size);
		leg3 = new Leg((int)(height *  0.184), (int)(width * 0.0506), size);
		leg4 = new Leg((int)(height *  0.184), (int)(width * 0.0506), size);
//		 Tail(40, 20);
		tail = new Tail((int)(height *  0.0667), (int)(width * 0.0506));
		System.out.println(bodyColor);
	}
	
public void drawAt(int left, int bottom){
	if(size == 0 || size == 3) {
//		for large size
		leg1.drawAt(left+150, bottom+230);
		leg2.drawAt(left+100, bottom+220);
		leg3.drawAt(left+300, bottom+230);
		leg4.drawAt(left+250, bottom+220);
		tail.drawAt(left, bottom);
			Drawing.pen().setColor(this.bodyColor);
////			400, 250
			Drawing.pen().fillOval(left+10, bottom, (int)(super.getWidth()*1.012), (int)(super.getHeight()*0.41666667));
	} else {
//		for size small
		leg1.drawAt(left+60, bottom+75);
		leg2.drawAt(left+35, bottom+70);
		leg3.drawAt(left+90, bottom+70);
		leg4.drawAt(left+110, bottom+75);
		tail.drawAt(left-245, bottom-25);
			
			Drawing.pen().setColor(this.bodyColor);
//			400, 250
			Drawing.pen().fillOval(left+10, bottom, (int)(super.getWidth()*1.012), (int)(super.getHeight()*0.41666667));
	}
	
	
		
	}

	public void setColor(Color bodyColor) {
	this.bodyColor = bodyColor;
	}
	
	
	public void setSize(int size) {
		leg1.setSize(size);
		leg2.setSize(size);
		leg3.setSize(size);
		leg4.setSize(size);
		tail.setSize(size);
	this.size = size;
	if(size == 1) {
		this.setHeight(200);
		this.setWidth((int)(200 * 0.6603773));
		} else {
		this.setHeight(600);
		this.setWidth((int)(600 * 0.6603773));		
		}
	}

}