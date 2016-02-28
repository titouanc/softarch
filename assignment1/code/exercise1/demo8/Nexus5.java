
package exercise1.demo8;

public class Nexus5 implements GoogleNexus {

  private ManufacturerName manufacturer;

  public Nexus5(ManufacturerName manufacturer) {
    this.manufacturer = manufacturer;
  }
  
  @Override
  public ManufacturerName getManufacturer() {
    return manufacturer;
  }

  @Override
  public String toString() {
    return "Nexus 5 " + manufacturer;
  }

  
}
