package sheep;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Scene {
	 private Sheep sheep1 ;// aggregate
//	 private Sheep sheep2 = new Sheep(generateRandom(400, 700) + 200, generateRandom(400, 700));	// aggregate
//	 private Sheep sheep3 = new Sheep(generateRandom(400, 700) + 200, generateRandom(400, 700));	// aggregate
//	 private Sheep sheep4 = new Sheep(generateRandom(400, 700) + 200, generateRandom(400, 700));	// aggregate
	 private ArrayList<Sheep> Sheeps;
	 private int screenWidth;
	 private int screenHeight;
	 
	 public int generateRandom(int min, int max) {
			return  RandomNumber.between(min, max); // 
			}
		
	 public Scene(int screenWidth, int screenHeight) {
		 Sheeps = new ArrayList<Sheep>();
		 this.screenHeight = screenHeight;
		 this.screenWidth = screenWidth;
//		 drawSomeSheeps();
		 int height = 200;
		 int width = (int)(height * 0.6603773);
//		 sheep1 co ordinates 400, 300
		 sheep1 = new Sheep((int)(height * 0.6667), (int)(height * 0.5), height, width);	
		 Sheeps.add(sheep1);
//		 Sheeps.add(sheep2);
//		 Sheeps.add(sheep3);
//		 Sheeps.add(sheep4);
	 }
	 
//	Currently Not Active 
	 private void drawSomeSheeps() {
		 for(int i = 0; i< 500; i++) {
			 int y = generateRandom(400, 700) + i *200;
			 int x = generateRandom(200, 500);
			 int height = 100;
			 int width = 50;
			 Sheep aSheep = new Sheep( 400, 300, height, width);
				if ( vacantProperty(aSheep) ) {
					Sheeps.add(aSheep);
				}
		 }
	 }
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