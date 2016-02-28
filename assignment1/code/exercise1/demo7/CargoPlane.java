
package exercise1.demo7;

public class CargoPlane extends Plane {

	public CargoPlane(String id, String manufacturer, String model) {
		super(id, manufacturer, model);
	}

	@Override
	public void fly() {
		System.out.println(this + " flies with goods aboard.");
	}

	@Override
	public String toString() {
		return manufacturer + "-" + model + " " + id + " ";
	}

}
