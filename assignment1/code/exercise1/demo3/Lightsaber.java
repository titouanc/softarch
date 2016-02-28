
package exercise1.demo3;

public class Lightsaber extends EnergyWeapon {

	public Lightsaber(LightsaberImpl imp) {
		super(imp);
	}

	@Override
	public LightsaberImpl getImp() {
		return (LightsaberImpl) imp;
	}

	@Override
	public void wield() {
		getImp().wieldImp();
	}

	@Override
	public void swing() {
		getImp().swingImp();
	}

	@Override
	public void unwield() {
		getImp().unwieldImp();
	}

	public void blind() {
		getImp().blindImp();
	}

	@Override
	public void turnOn() {
		getImp().turnOnImp();
	}

	@Override
	public void turnOff() {
		getImp().turnOffImp();
	}
}
