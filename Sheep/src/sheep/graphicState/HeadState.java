package sheep.graphicState;

import sheep.Scene;

public class HeadState extends State{
private static final HeadState INSTANCE = new HeadState();
	
	private HeadState() {}
	
	public static HeadState getInstance() {
		return INSTANCE;
	}

	@Override
	public State drawBody() {
		return BodyState.getInstance();
	}

	@Override
	public State drawHead() {
		return INSTANCE;
	}

	@Override
	public State drawSheep() {
		return SheepState.getInstance();
	}
}
