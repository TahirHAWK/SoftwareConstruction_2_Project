package sheep;
import java.awt.*;

public class Head {
	
	private int height, width;
	
	void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
public void drawAt(int x, int y, Graphics pen){
	
		setHeightWidth(150, 120);

		pen.setColor(Color.LIGHT_GRAY);
		pen.fillOval(x-40, y+25, width, height);

	}
}