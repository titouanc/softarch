
package exercise1.demo8;


public class Nexus6 implements GoogleNexus {

  private ManufacturerName manufacturer;

  public Nexus6(ManufacturerName manufacturer) {
    this.manufacturer = manufacturer;
  }

  @Override
  public String toString() {
    return  "Nexus 6 " + manufacturer;
  }

  @Override
  public ManufacturerName getManufacturer() {
    return manufacturer;
  }
}
