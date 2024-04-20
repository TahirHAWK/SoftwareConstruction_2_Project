package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Ear {
public void drawAt(int x, int y, Graphics pen){
			
		pen.setColor(Color.GRAY);
		pen.fillOval(x+55, y+50, 100, 40 );
		
	}
}
