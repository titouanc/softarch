
package exercise1.demo13;

public class Dusty implements RacerPlane {

  private CropDusterPlane cropDuster;

  public Dusty() {
    cropDuster = new CropDusterPlane();
  }

  @Override
  public void flipAndMore() {
    System.out.println("doing aerobatic maneuvers!");
  }

  @Override
  public void fly() {
    cropDuster.fly();
  }
}
