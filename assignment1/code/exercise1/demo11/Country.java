
package exercise1.demo11;

public class Country implements WeatherObserver {

	private String name;

	public Country(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(WeatherType currentWeather) {
		switch (currentWeather) {
		case COLD:
			System.out.println(" "+ name + " has cold weather now.");
			break;
		case RAINY:
			System.out.println(" In " +name + " is raining now.");
			break;
		case SUNNY:
			System.out.println(" "+name + " has a nice sunny day today!");
			break;
		case WINDY:
			System.out.println(" "+name + " has a windy weather today.");
			break;
		default:
			break;
		}
	}
}
