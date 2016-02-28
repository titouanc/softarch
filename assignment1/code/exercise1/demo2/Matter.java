
package exercise1.demo2;

public class Matter {

  protected String name;	
  protected Matter[] children;

  public Matter(String name, Matter[] children) {
	super();
	this.name = name;
	this.children = children;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Matter[] getChildren() {
	return children;
}

public void setChildren(Matter[] children) {
	this.children = children;
}

public void explore(MatterVisitor visitor) {
    for (Matter child : children) {
      child.explore(visitor);
    }
  }
}
