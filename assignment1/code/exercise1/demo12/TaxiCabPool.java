
package exercise1.demo12;

public class TaxiCabPool extends ObjectPool<TaxiCab> {

  @Override
  protected TaxiCab create() {
    return new TaxiCab();
  }
}
