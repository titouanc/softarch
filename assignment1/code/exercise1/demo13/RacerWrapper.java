
package exercise1.demo13;

public class RacerWrapper implements RacerPlane {

  private RacerPlane racerPlane;

  public RacerWrapper(RacerPlane racerPlane) {
    this.racerPlane = racerPlane;
  }

  public void setRacerPlane(RacerPlane racerPlane) {
    this.racerPlane = racerPlane;
  }
  
  @Override
  public void fly() {
    racerPlane.fly();
  }

  @Override
  public void flipAndMore() {
    racerPlane.flipAndMore();
  }


}
