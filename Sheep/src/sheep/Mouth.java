package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Mouth {
	
public void drawAt(int x, int y, Graphics pen){
		pen.setColor(Color.GRAY);
//		pen.fillOval(x-120, y+50, 30, 15);
		pen.drawArc(x-5, y+130, 50,20, -180, 180);
//		pen.drawLine(x-5, y+135, x+40, y+150);

		
	}
}