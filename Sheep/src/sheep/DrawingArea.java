
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
		scene.drawAt(pen);
	}
}

 class Scene {
	 private Sheep sheep1 = new Sheep();
	 private Sheep sheep2 = new Sheep();
	 private Sheep sheep3 = new Sheep();
	 private Sheep sheep4 = new Sheep();
	 private ArrayList<Sheep> Sheeps;
	 
	 public Scene() {
		 Sheeps = new ArrayList<Sheep>();
		 
		 Sheeps.add(sheep1);
	 }
	 
	 public void drawAt(Graphics pen) {
		 for(int i = 0; i< Sheeps.size(); i++) {
			 int height = 700 + i *200;
			 int width = 200;
			 Sheeps.get(i).drawAt(height, width, pen);
		 }
		 
	 }
	
}