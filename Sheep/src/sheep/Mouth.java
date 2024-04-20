package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Mouth {
public void drawAt(int x, int y, Graphics pen){
		pen.setColor(Color.GRAY);
//		pen.fillOval(x-120, y+50, 30, 15);
//		pen.drawLine(x, y+150, x+40, y+150);
		pen.drawArc(x, y+130, 50,20, -180, 180);
		
	}
}
