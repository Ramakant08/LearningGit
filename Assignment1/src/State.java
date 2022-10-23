import java.util.Comparator;

public class State implements Comparator<State> {
	int stateCode;

	public State(int stateCode) {
		super();
		this.stateCode = stateCode;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public int compare(State s1, State s2) {
		if(s1.getStateCode() < s2.getStateCode())
		  return -1;
		return 1;
	};
	

}
