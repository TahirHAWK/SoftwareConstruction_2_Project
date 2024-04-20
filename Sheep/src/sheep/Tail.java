package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Tail {
public void drawAt(int x, int y, Graphics pen){
		pen.setColor(Color.darkGray);
		pen.fillOval(x+380, y+50, 40, 20);
		
	}
}
