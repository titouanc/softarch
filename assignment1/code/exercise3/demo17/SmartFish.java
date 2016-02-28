
package exercise3.demo17;

public class SmartFish extends Fish {

	private static final long serialVersionUID = 2L;

	boolean reading;
	boolean speaking;
	boolean listening;

	public SmartFish(String name, int age, int length, int weight) {
		super(name, age, length, weight);
	}

	public SmartFish(String name, int age, int length, int weight, boolean reading, boolean speaking, boolean listening) {
		super(name, age, length, weight);
		this.reading = reading;
		this.speaking = speaking;
		this.listening = listening;
	}
}
