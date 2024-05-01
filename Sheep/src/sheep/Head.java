package sheep;
import java.awt.*;

public class Head {
	
	private int height, width;
	
	public void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public Head(int height, int width) {
		setHeightWidth(height, width);
	}
	
public void drawAt(int x, int y, Graphics pen){
	
		

		pen.setColor(Color.LIGHT_GRAY);
		pen.fillOval(x-40, y+25, width, height);

	}
}