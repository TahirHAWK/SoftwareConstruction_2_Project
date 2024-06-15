package sheep.graphicState;


import sheep.Scene;

public abstract class State {
	
	protected Scene context ;
	
	protected static SheepState sheep;
	protected static HeadState head ;
	protected static BodyState body ;
	
	public abstract State drawHuman();
	public abstract State drawHead(); 
	public abstract State drawghost();

}
