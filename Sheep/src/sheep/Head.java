package sheep;
import java.awt.*;

public class Head {
	
	private int height, width;
	private Mouth mouth;
	private Ear ear1, ear2;
	private Eye eye1, eye2;
	
	public void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public Head(int height, int width) {
		setHeightWidth(height, width);
		mouth = new Mouth(50, 20);
		ear1 = new Ear(100, 40);
		ear2 = new Ear(100, 40);
		eye1 = new Eye(-16, 70);
		eye2 = new Eye(-16, 70);
	}
	
public void drawAt(int x, int y, Graphics pen){
	
		
		ear1.drawAt(x, y, pen);
		ear2.drawAt(x-165, y, pen);

		pen.setColor(Color.LIGHT_GRAY);
		pen.fillOval(x-40, y+25, width, height);
		
		eye1.drawAt(x, y, pen);
		eye2.drawAt(x+50, y, pen);
		mouth.drawAt(x, y, pen);

	}
}