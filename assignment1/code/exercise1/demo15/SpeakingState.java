
package exercise1.demo15;

public class SpeakingState implements State {

  private C3PODroid droid;

  public SpeakingState(C3PODroid droid) {
    this.droid = droid;
  }

  @Override
  public void observe() {
    System.out.printf("%s is speaking a lot, R2-D2 is crazy!\n", droid);
  }

  @Override
  public void onEnterState() {
    System.out.printf("%s starts speaking.\n", droid);
  }

}
