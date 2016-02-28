
package exercise1.demo2;

public class Satellite extends Matter {


  public Satellite(String name, Matter... children) {
		super(name, children);
	}

@Override
  public void explore(MatterVisitor visitor) {
    visitor.exploreSatellite(this);
    super.explore(visitor);
  }

  @Override
  public String toString() {
    return name + " satellite";
  }
}
