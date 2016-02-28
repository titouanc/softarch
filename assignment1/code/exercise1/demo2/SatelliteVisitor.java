
package exercise1.demo2;

public class SatelliteVisitor implements MatterVisitor {

  @Override
  public void exploreSatellite(Satellite satellite) {
	  System.out.println("Welcome to " + satellite +". Enyoy your visit!");
  }

  @Override
  public void explorePlanet(Planet planet) {}

  @Override
  public void exploreGalaxy(Galaxy galaxy) {}
}
