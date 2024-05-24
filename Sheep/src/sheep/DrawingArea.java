/**
 * Provides a panel which can be used for drawing.
 * 
 * @author Md. Tahir Anam Tamin, Tonmoy Majumder
 * @version 1.0
 */

package sheep;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;
	private Scene scene;
	
	public DrawingArea() {
		super();
		Dimension screenSize = getToolkit().getScreenSize();
		scene = new Scene(screenSize.width, screenSize.height);
		
	}
	
	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		Drawing.set(pen);
		scene.draw();
	}
}