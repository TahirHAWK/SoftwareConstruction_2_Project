
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

 class Scene {
	 private Sheep sheep1 = new Sheep();
	 private Sheep sheep2 = new Sheep();
	 private Sheep sheep3 = new Sheep();
	 private Sheep sheep4 = new Sheep();
	 private ArrayList<Sheep> Sheeps;
	 
		public int generateRandom(int min, int max) {
			return  RandomNumber.between(min, max);
			}
		
	 
	 public Scene() {
		 Sheeps = new ArrayList<Sheep>();
		 
		 Sheeps.add(sheep1);
		 Sheeps.add(sheep2);
		 Sheeps.add(sheep3);
		 Sheeps.add(sheep4);
	 }
	 
	 public void drawAt(Graphics pen) {
		 for(int i = 0; i< Sheeps.size(); i++) {
			 int height = 700 + i *200;
			 int width = 200;
			 Sheeps.get(i).drawAt(height, width, pen);
		 }
		 
	 }
	 

	 
	 public void drawAt(Graphics pen, int numberOfSheeps) {
		 
		 for(int i = 0; i< numberOfSheeps; i++) {
			 int height = generateRandom(400, 700) + i *200;
			 int width = generateRandom(200, 500);
			 Sheeps.get(i).drawAt(height, width, pen);
		 }
//		 for(int i = 0; i< numberOfSheeps; i++) {
//			 int RandomValue = RandomNumber.between(700, 900);
//			 int height = RandomValue + i *200;
//			 int width = 200;
//			 System.out.println(RandomValue);
//			 Sheeps.get(i).drawAt(height, width, pen);
//		 }
		 
	 }
	
}