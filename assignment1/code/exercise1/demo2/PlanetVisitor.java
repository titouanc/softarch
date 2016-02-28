
package exercise1.demo2;


public class PlanetVisitor implements MatterVisitor {

  @Override
  public void exploreSatellite(Satellite satellite) {}

  @Override
  public void explorePlanet(Planet planet) {
	  System.out.println("Welcome to " + planet +". Enyoy your visit!");
  }

  @Override
  public void exploreGalaxy(Galaxy galaxy) {}
}
