package sheep;

import java.awt.Graphics;
import java.util.ArrayList;

public class Scene {
	 private Sheep sheep1 = new Sheep(generateRandom(400, 700) + 200, generateRandom(400, 700));	// aggregate
	 private Sheep sheep2 = new Sheep(generateRandom(400, 700) + 200, generateRandom(400, 700));	// aggregate
	 private Sheep sheep3 = new Sheep(generateRandom(400, 700) + 200, generateRandom(400, 700));	// aggregate
	 private Sheep sheep4 = new Sheep(generateRandom(400, 700) + 200, generateRandom(400, 700));	// aggregate
	 private ArrayList<Sheep> Sheeps;
	 
	 public int generateRandom(int min, int max) {
			return  RandomNumber.between(min, max); // 
			}
		
	 public Scene(int screenWidth, int screenHeight) {
		 Sheeps = new ArrayList<Sheep>();
		 Sheeps.add(sheep1);
		 Sheeps.add(sheep2);
		 Sheeps.add(sheep3);
		 Sheeps.add(sheep4);
	 }
	 
//	 public void drawAt(Graphics pen) {
//		 for(int i = 0; i< Sheeps.size(); i++) {
//			 int height = 700 + i *200;
//			 int width = 200;
//			 Sheeps.get(i).drawAt(height, width, pen);
//		 } 
//	 }
//	 
	 public void drawAt(Graphics pen, int numberOfSheeps) {	 
		 for(int i = 0; i< numberOfSheeps; i++) {
			 int height = generateRandom(400, 700) + i *200;
			 int width = generateRandom(200, 500);
			 
			 System.out.println(height + width);
			 if(!vacantProperty(Sheeps.get(i)) || i==0) {
				 Sheeps.get(i).drawAt(height, width);
			 }
		 }		 
	 }	
	 
		private boolean vacantProperty(Sheep aSheep) {
			boolean intersects = false;
			for(Sheep h : Sheeps) {
				intersects = intersects || h.intersects(aSheep);
			}
			return !intersects;
		}
		
		public void draw() {
			for(Sheep aSheep: Sheeps) {
				aSheep.draw();
			}
		}
}