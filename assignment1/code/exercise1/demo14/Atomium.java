
package exercise1.demo14;


public final class Atomium {

  private static final Atomium INSTANCE = new Atomium();

  private Atomium() {}


  public static Atomium getInstance() {
    return INSTANCE;
  }
}
