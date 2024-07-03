package sheep.graphicState;


import sheep.Scene;

public class SheepState extends State {	
private static final SheepState INSTANCE = new SheepState();
	
	private SheepState() {
//		context = Scene.getInstance();
	}
	
	public static SheepState getInstance() {
		return INSTANCE;
	}

	@Override
	public State drawBody() {
		return BodyState.getInstance();
	}

	@Override
	public State drawHead() {
		return HeadState.getInstance();
	}

	@Override
	public State drawSheep() {
		return INSTANCE;
	}

}
