package sheep;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import drawingTool.Human;
import drawingTool.Scene;
import drawingTool.graphicState.HumanState;
import drawingTool.graphicState.State;
import sheep.graphicState.SheepState;

public class Scene {
	
	 private ArrayList<Sheep> Sheeps;
	 private int screenWidth, screenHeight, size=0;
//	 private static final Scene INSTANCE = new Scene( int screenWidth, int screenHeight);
//	 private static State graphicState = SheepState.getInstance();
	 
	 public int generateRandom(int min, int max) {
			return  RandomNumber.between(min, max); // 
			}
	 
		
	 public Scene(int screenWidth, int screenHeight) {
		 Sheeps = new ArrayList<Sheep>();
		 this.screenHeight = screenHeight;
		 this.screenWidth = screenWidth;
		 drawSomeSheeps();
	 }
	 
//	 public static Scene getInstance() {
//			return INSTANCE;
//		}
	 
	 private void drawSomeSheeps() {
		 for(int i = 0; i< 3; i++) {
//			 boolean intersectFound = false;
			 int y = generateRandom(0, 650);
			 int x = generateRandom(100, 1500);
			
				int colorR = RandomNumber.between(0, 255);
				int colorG = RandomNumber.between(0, 255);
				int colorB = RandomNumber.between(0, 255);
				int colorA = 255;
				
//				if (Sheeps.isEmpty()) {
//					Sheeps.add(new Sheep( x, y, new Color(colorR, colorG, colorB, colorA), size));
//				} else {
//					Sheep aSheep = new Sheep( x, y, new Color(colorR, colorG, colorB, colorA), size);
//
//					for (Sheep check : Sheeps) {
//						intersectFound = intersectFound || check.intersects(aSheep);
//					}
//
//					if (!intersectFound) {
//						Sheeps.add(aSheep);
//						
//					}
//				}
			 Sheep aSheep = new Sheep( x, y, new Color(colorR, colorG, colorB, colorA), size);
				
					Sheeps.add(aSheep);
				
		 }
	 }
	 
//		private boolean vacantProperty(Sheep aSheep) {
//			boolean intersects = false;
//			for(Sheep h : Sheeps) {
//				intersects = intersects || h.intersects(aSheep);
//			}
//			return !intersects;
//		}
		
		public void draw() {
			for(Sheep aSheep: Sheeps) {
				aSheep.draw();
			}
		}
		
		public void setColor(Color color) {
			for(Sheep aSheep: Sheeps) {
				aSheep.getBody().setColor(color);
			}
		}
		
		public void setSize(int size) {
			for(Sheep aSheep: Sheeps) {
				aSheep.setSize(size);
				
			}
	    }
}