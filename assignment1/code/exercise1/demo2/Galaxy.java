
package exercise1.demo2;

public class Galaxy extends Matter {

	public Galaxy(String name, Matter... children) {
		super(name, children);
	}

	@Override
	public void explore(MatterVisitor visitor) {
		visitor.exploreGalaxy(this);
		super.explore(visitor);
	}

	@Override
	public String toString() {
		return name +" galaxy";
	}
}
