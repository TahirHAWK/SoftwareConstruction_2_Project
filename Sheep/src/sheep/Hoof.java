package sheep;

import java.awt.*;

public class Hoof extends Organ{

	 
	public Hoof(int height, int width){
		super(height, width);
	}

public void drawAt(int left, int bottom){
	Drawing.pen().setColor(Color.BLACK);
	Drawing.pen().fillRect(left-10, bottom+75, super.getWidth(), super.getHeight());
		
	}
}