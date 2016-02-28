
package exercise1.demo7;

public class PassengerPlane extends Plane {


	public PassengerPlane(String id, String manufacturer, String model) {
		super(id, manufacturer, model);
	}

	@Override
	public void fly() {
		System.out.println(this + " flies with passengers aboard.");
	}

	@Override
	public String toString() {
		return manufacturer + "-" + model + " " + id + " ";
	}

}
