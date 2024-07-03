package sheep.graphicState;

import sheep.Scene;

public class BodyState extends State{
private static final BodyState INSTANCE = new BodyState();
	
	private BodyState() {
		
	}
	
	public static BodyState getInstance() {
		return INSTANCE;
	}

	@Override
	public State drawBody() {
		return INSTANCE;
	}
	

	@Override
	public State drawHead() {
		return HeadState.getInstance();
	}

	@Override
	public State drawSheep() {
		return SheepState.getInstance();
	}
	
}
