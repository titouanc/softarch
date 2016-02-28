
package exercise1.demo8;

/**
 * 
 * Concrete subclass for creating new objects.
 * 
 */
public class Nexus6Manufacturer implements Manufacturer {

  public GoogleNexus manufactureNexus(ManufacturerName weaponType) {
    return new Nexus6(weaponType);
  }

}
