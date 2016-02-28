
package exercise3.demo17;

import java.io.IOException;

public class Demo17 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Fishbowl fishbowl = new Fishbowl();
		
		Fish nemo = new Fish("Nemo", 10, 11, 12);
		System.out.printf("fish name=%s age=%d length=%d weight=%d\n", nemo.name, nemo.age, nemo.length, nemo.weight);
		
		DemoUtils.addFish(fishbowl, nemo);
		DemoUtils.writeFish(nemo, "nemo.out");

		Fish deserializedNemo = DemoUtils.readFish("nemo.out");
		System.out.printf("deserializedNemo1 name=%s age=%d length=%d weight=%d \n", deserializedNemo.name,
				deserializedNemo.age, deserializedNemo.length, deserializedNemo.weight);

		SmartFish oscar = new SmartFish("Oscar", 5, 12, 15, true, true, true);
		DemoUtils.addFish(fishbowl, oscar);
		System.out.printf("SmartFish name=%s age=%d length=%d weight=%d reading=%b speaking=%b listening=%b", oscar.name,
				oscar.age, oscar.length, oscar.weight, oscar.reading, oscar.speaking, oscar.listening);
		DemoUtils.writeFish(oscar, "oscar.out");
		
		DemoUtils.removeFish(fishbowl, oscar);
		
		System.out.println("Weather in Brussels: "+ DemoUtils.getWeatherInfo("brussels"));

	}
}
