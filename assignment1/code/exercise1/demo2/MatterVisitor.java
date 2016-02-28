
package exercise1.demo2;

public interface MatterVisitor {
  void exploreGalaxy(Galaxy galaxy);
  void explorePlanet(Planet planet);
  void exploreSatellite(Satellite satellite);
}
