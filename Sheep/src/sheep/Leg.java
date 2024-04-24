package sheep;

import java.awt.*;

public class Leg {
	private Hoof hoof;
	
public void drawAt(int x, int y, Graphics pen){
	 	
		pen.setColor(Color.GRAY);
		pen.fillRect(x, y, 20, 100);
		
		
		hoof = new Hoof();
		hoof.drawAt(x, y, pen);
	}
}