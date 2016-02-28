
package exercise1.demo11;

public enum WeatherType {

  SUNNY, RAINY, WINDY, COLD;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
