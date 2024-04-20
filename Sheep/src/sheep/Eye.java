package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Eye {
	
	private int whitePartPosition, blackPartPosition, whitePartPositionY, blackPartPositionY;
	
		public void setEyePosition(int valueBig,int valueSmall) {
			
			whitePartPosition = valueBig;
			blackPartPosition = whitePartPosition + 5 ;
			whitePartPositionY = valueSmall;
			blackPartPositionY = whitePartPositionY + 5;
			
		}
		
public void drawAt(int x, int y, Graphics pen){
	
		setEyePosition(-16, 70);
		pen.setColor(Color.white);
		pen.fillOval(x+whitePartPosition, y+whitePartPositionY, 30, 30);
		pen.setColor(Color.black);
		pen.fillOval(x+blackPartPosition, y+blackPartPositionY, 16, 16);
		
	}
}
