
package exercise1.demo2;

public class Demo2 {

	public static void main(String[] args) {
		
		Planet saturn = new Planet("Saturn", new Satellite("Titan"), new Satellite("Rhea"), new Satellite("Dione"));
		Planet jupiter = new Planet("Jupiter", new Satellite("Ganymede"), new Satellite("Europa"), new Satellite("Callisto"));
		Planet earth = new Planet("Earth", new Satellite("Moon"));
	

		Galaxy galaxy = new Galaxy("Milky Way", saturn, jupiter, earth);
		galaxy.explore(new GalaxyVisitor());
		galaxy.explore(new PlanetVisitor());
		galaxy.explore(new SatelliteVisitor());
		

	}
}
