
package exercise1.demo11;

public class Demo11 {

  public static void main(String[] args) {

    Weather weather = new Weather();
    weather.addObserver(new Country("Cuba"));
    weather.addObserver(new Country("Kenya"));

    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
  }
}
