package sheep;

import java.awt.*;

public class Hoof {
public void drawAt(int x, int y, Graphics pen){
		pen.setColor(Color.BLACK);
		pen.fillRect(x-10, y+75, 30, 35);
		
	}
}
