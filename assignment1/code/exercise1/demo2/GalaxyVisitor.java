
package exercise1.demo2;

public class GalaxyVisitor implements MatterVisitor {

  @Override
  public void exploreSatellite(Satellite satellite) {}

  @Override
  public void explorePlanet(Planet planet) {}

  @Override
  public void exploreGalaxy(Galaxy galaxy) {
    System.out.println("Welcome to " + galaxy +". Enyoy your visit!");
  }
}
