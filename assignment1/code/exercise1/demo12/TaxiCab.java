
package exercise1.demo12;

public class TaxiCab {

  private static int counter = 1;
  private final int number;

  public TaxiCab() {
    number = counter++;
    try {
      Thread.sleep(2000); // Taxicabs are expensive to create
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public int getId() {
    return number;
  }

  @Override
  public String toString() {
    return String.format("TaxiCab %d", number);
  }
}
