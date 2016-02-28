
package exercise1.demo3;

public class Demo3 {

	public static void main(String[] args) {
		Lightsaber jodaLightsaber = new Lightsaber(new GreenLightsaber());
		jodaLightsaber.wield();
		jodaLightsaber.turnOn();
		jodaLightsaber.blind();
		jodaLightsaber.swing();
		jodaLightsaber.turnOff();
		jodaLightsaber.unwield();

		Lightsaber darthVaderLightsaber = new Lightsaber(new RedLightsaber());
		darthVaderLightsaber.wield();
		darthVaderLightsaber.turnOn();
		darthVaderLightsaber.blind();
		darthVaderLightsaber.swing();
		darthVaderLightsaber.turnOff();
		darthVaderLightsaber.unwield();

		Lightsaber obiWanLightsaber = new Lightsaber(new BlueLightsaber());
		obiWanLightsaber.wield();
		obiWanLightsaber.turnOn();
		obiWanLightsaber.blind();
		obiWanLightsaber.swing();
		obiWanLightsaber.turnOff();
		obiWanLightsaber.unwield();

	}
}
