package sheep;

import java.awt.*;

public class Hoof extends Organ{

	 
	public Hoof(int height, int width){
		super(height, width);
	}

public void drawAt(int left, int bottom, Graphics pen){
		pen.setColor(Color.BLACK);
		pen.fillRect(left-10, bottom+75, super.getWidth(), super.getHeight());
		
	}
}