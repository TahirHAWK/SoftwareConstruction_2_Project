
/**
 * Provides a panel which can be used for drawing.
 * 
 * @author Md. Tahir Anam Tamin, Tonmoy Majumder
 * @version 1.0
 */

package sheep;
import java.awt.*;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		Sheep sheep = new Sheep();
		
		
		sheep.drawAt(500, 300, pen);

	}
}