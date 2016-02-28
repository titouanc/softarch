
package exercise1.demo3;

public class RedLightsaber extends LightsaberImpl {

	@Override
	public void wieldImp() {
		System.out.println("wielding a red lightsaber ...");
	}

	@Override
	public void turnOnImp() {
		System.out.println("turning-on the lightsaber ...");
	}

	@Override
	public void swingImp() {
		System.out.println("swinging a red lightsaber ...");
	}

	@Override
	public void unwieldImp() {
		System.out.println("unwielding a red lightsaber ...");
	}

	@Override
	public void blindImp() {
		System.out.println("blinding the enemy ...");
	}

	@Override
	public void turnOffImp() {
		System.out.println("turning-off the lightsaber ...");
	}
}
