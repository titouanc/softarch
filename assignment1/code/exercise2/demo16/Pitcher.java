
package exercise2.demo16;

public class Pitcher {

	private PitchType pitch;

	public Pitcher(PitchType type) {
		this.pitch = type;
	}

	public void changePitchType(PitchType type) {
		this.pitch = type;
	}

	public void throwBall() {
		pitch.pitch();
	}
}
