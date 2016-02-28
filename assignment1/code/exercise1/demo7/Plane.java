
package exercise1.demo7;

public abstract class Plane {

	protected String id;
	protected String manufacturer;
	protected String model;

	public Plane(String id, String manufacturer, String model) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void goToHangar() {
		System.out.println(this + " goes to the hangar.");
	}

	public void takeOff() {
		System.out.println(this + " takes Off.");
	}

	public void land() {
		System.out.println(this + " lands.");
	}
	
	public void refueling() {
		System.out.println(this + " is refueling.");
	}


	private void action(Action action) {
		switch (action) {
		case GO_TO_HANGAR:
			goToHangar();
			break;
		case TAKE_OFF:
			takeOff();
			break;
		case LAND:
			land();
			break;
		case FLY:
			fly();
			break;
		case REFUELING:
			refueling();
			break;
		default:
			System.out.println("Undefined action");
			break;
		}
	}

	public void action(Action... actions) {
		for (Action action : actions) {
			action(action);
		}
	}

	public abstract void fly();

	static enum Action {
		GO_TO_HANGAR, TAKE_OFF, LAND, FLY, REFUELING
	}
}
