/**
 * Provides a panel which can be used for drawing.
 * 
 * @author Md. Tahir Anam Tamin, Tonmoy Majumder
 * @version 1.0
 */

package sheep;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;
	
	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		Scene scene = new Scene();
		scene.drawAt(pen, 4);
	}
}