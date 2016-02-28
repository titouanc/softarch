
package exercise1.demo2;

public class Planet extends Matter {

	public Planet(String name, Matter... children) {
		super(name, children);
	}

	@Override
	public void explore(MatterVisitor visitor) {
		visitor.explorePlanet(this);
		super.explore(visitor);
	}

	@Override
	public String toString() {
		return name + " planet";
	}
}
