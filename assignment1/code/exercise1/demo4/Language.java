
package exercise1.demo4;

public enum Language {

	HOBBITISH, WESTRON;

	@Override
	  public String toString() {
	    return name().toLowerCase();
	  }
}
