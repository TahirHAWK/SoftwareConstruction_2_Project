package sheep;
import java.awt.*;

public class Head {
public void drawAt(int x, int y, Graphics pen){

		pen.setColor(Color.LIGHT_GRAY);
		pen.fillOval(x-40, y+25, 120, 150);

	}
}
