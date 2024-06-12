package sheep;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Scene {
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
		 drawSomeSheeps();
	 }
	 
	 private void drawSomeSheeps() {
		 for(int i = 0; i< 2; i++) {
			 int y = generateRandom(0, 650);
			 int x = generateRandom(100, 1500);
			 int height = 600;
			 int width = (int)(height * 0.6603773);
				int colorR = RandomNumber.between(0, 255);
				int colorG = RandomNumber.between(0, 255);
				int colorB = RandomNumber.between(0, 255);
				int colorA = 255;
			 Sheep aSheep = new Sheep( x, y, height, width, new Color(colorR, colorG, colorB, colorA));
				
					Sheeps.add(aSheep);
				
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
		
		public void setGreen() {
			for(Sheep aSheep: Sheeps) {
				aSheep.draw();
			}
		}
}