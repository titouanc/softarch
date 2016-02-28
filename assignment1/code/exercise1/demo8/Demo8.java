
package exercise1.demo8;

public class Demo8 {

  public static void main(String[] args) {
    Manufacturer manufacturer;
    GoogleNexus nexus;

    manufacturer = new Nexus5Manufacturer();
    nexus = manufacturer.manufactureNexus(ManufacturerName.LG);
    System.out.println(nexus);
    
    nexus = manufacturer.manufactureNexus(ManufacturerName.MOTOROLA);
    System.out.println(nexus);

    manufacturer = new Nexus6Manufacturer();
    nexus = manufacturer.manufactureNexus(ManufacturerName.HUAWEI);
    System.out.println(nexus);
    nexus = manufacturer.manufactureNexus(ManufacturerName.SAMSUNG);
    System.out.println(nexus);
  }
}
