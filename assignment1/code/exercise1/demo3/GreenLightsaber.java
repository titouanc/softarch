
package exercise1.demo3;

public class GreenLightsaber extends LightsaberImpl {

	@Override
	public void wieldImp() {
		System.out.println("wielding a green lightsaber ...");
	}

	@Override
	public void swingImp() {
		System.out.println("swinging a green lightsaber ...");
	}

	@Override
	public void unwieldImp() {
		System.out.println("unwielding a green lightsaber ...");
	}

	@Override
	public void blindImp() {
		System.out.println("blinding the enemy ...");
	}

	@Override
	public void turnOnImp() {
		System.out.println("turning-on the lightsaber ...");
	}

	@Override
	public void turnOffImp() {
		System.out.println("turning-off the lightsaber ...");
	}
}
