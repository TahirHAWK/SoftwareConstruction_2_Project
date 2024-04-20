package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Body {
	
	private Leg leg1, leg2, leg3, leg4;
	
public void drawAt(int x, int y, Graphics pen){
	
	leg1 = new Leg();
	leg2 = new Leg();
	leg3 = new Leg();
	leg4 = new Leg();
	
	leg1.drawAt(x+150, y+230, pen);
	leg2.drawAt(x+100, y+220, pen);
	leg3.drawAt(x+300, y+230, pen);
	leg4.drawAt(x+250, y+220, pen);
	
		pen.setColor(Color.darkGray);
		pen.fillOval(x+10, y, 400, 250);
		
	
		
	}
}
