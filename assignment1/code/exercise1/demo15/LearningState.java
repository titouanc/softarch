
package exercise1.demo15;

public class LearningState implements State {

  private C3PODroid droid;

  public LearningState(C3PODroid droid) {
    this.droid = droid;
  }

  @Override
  public void observe() {
    System.out.printf("%s likes learning about human behaviour!\n", droid);
  }

  @Override
  public void onEnterState() {
    System.out.printf("%s starts learning.\n", droid);
  }

}
