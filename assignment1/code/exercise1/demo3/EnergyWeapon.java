
package exercise1.demo3;

public abstract class EnergyWeapon {

	protected EnergyWeaponImpl imp;

	public EnergyWeapon(EnergyWeaponImpl imp) {
		this.imp = imp;
	}

	public abstract void wield();

	public abstract void turnOn();
	
	public abstract void swing();
	
	public abstract void turnOff();

	public abstract void unwield();

	public EnergyWeaponImpl getImp() {
		return imp;
	}
}
