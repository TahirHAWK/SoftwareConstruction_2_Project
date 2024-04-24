package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Eye {
	
	private int whitePartWidth, blackPartWidth, whitePartHeight, blackPartHeight;
	
		public void setEyePosition(int valueBig,int valueSmall) {
			
			whitePartWidth = valueBig;
			blackPartWidth = whitePartWidth + 5 ;
			whitePartHeight = valueSmall;
			blackPartHeight = whitePartHeight + 5;
			
		}
		
public void drawAt(int x, int y, Graphics pen){
	
		setEyePosition(-16, 70);
		pen.setColor(Color.white);
		pen.fillOval(x+whitePartWidth, y+whitePartHeight, 30, 30);
		pen.setColor(Color.black);
		pen.fillOval(x+blackPartWidth, y+blackPartHeight, 16, 16);
		
	}
}