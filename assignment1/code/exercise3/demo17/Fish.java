
package exercise3.demo17;

import java.io.Serializable;

public class Fish implements Serializable {

	private static final long serialVersionUID = 1L;

	String name;
	int age;
	int length;
	int weight;

	public Fish() {
		super();
	}



	public Fish(String name, int age, int length, int weight) {
		this.name = name;
		this.age = age;
		this.length = length;
		this.weight = weight;
	}

}
