
package exercise1.demo8;

/**
 * 
 * Concrete subclass for creating new objects.
 * 
 */
public class Nexus5Manufacturer implements Manufacturer {

  public GoogleNexus manufactureNexus(ManufacturerName manufacturer) {
    return new Nexus5(manufacturer);
  }
}
