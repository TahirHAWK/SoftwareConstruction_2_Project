package sheep;
import java.awt.Color;
import java.awt.Graphics;

public class Body{
	private Leg leg1, leg2, leg3, leg4;
	private Tail tail;
	
	Body(){
		leg1 = new Leg(110, 20);
		leg2 = new Leg(110, 20);
		leg3 = new Leg(110, 20);
		leg4 = new Leg(110, 20);
		tail = new Tail(40, 20);
	}
	
public void drawAt(int left, int bottom){
	
	leg1.drawAt(left+150, bottom+230);
	leg2.drawAt(left+100, bottom+220);
	leg3.drawAt(left+300, bottom+230);
	leg4.drawAt(left+250, bottom+220);
	tail.drawAt(left, bottom);
		
		Drawing.pen().setColor(Color.darkGray);
		Drawing.pen().fillOval(left+10, bottom, 400, 250);
		
	
		
	}
}