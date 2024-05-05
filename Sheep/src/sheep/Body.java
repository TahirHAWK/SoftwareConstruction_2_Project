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
	
public void drawAt(int left, int bottom, Graphics pen){
	
	leg1.drawAt(left+150, bottom+230, pen);
	leg2.drawAt(left+100, bottom+220, pen);
	leg3.drawAt(left+300, bottom+230, pen);
	leg4.drawAt(left+250, bottom+220, pen);
	tail.drawAt(left, bottom, pen);
		
		pen.setColor(Color.darkGray);
		pen.fillOval(left+10, bottom, 400, 250);
		
	
		
	}
}