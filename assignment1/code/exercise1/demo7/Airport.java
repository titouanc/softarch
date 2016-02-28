
package exercise1.demo7;

import java.util.ArrayList;
import java.util.List;

public class Airport {

	private final List<Plane> planes;

	public Airport() {
		planes = new ArrayList<>();
		planes.add(new CargoPlane("L323FD", "Boing", "700"));
		planes.add(new PassengerPlane("H873AW", "Airbus", "380"));
	}

	public void startNewDay() {
		makeActions(Plane.Action.REFUELING, Plane.Action.TAKE_OFF, Plane.Action.FLY, Plane.Action.LAND);
	}

	public void endDay() {
		makeActions(Plane.Action.GO_TO_HANGAR);
	}

	private void makeActions(Plane.Action... actions) {
		for (Plane plane : planes) {
			plane.action(actions);
		}
	}
}
