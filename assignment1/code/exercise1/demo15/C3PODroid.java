
package exercise1.demo15;

//C-3PO is a droid programmed for etiquette and protocol, built 
//by the heroic Jedi Anakin Skywalker, and a constant companion 
//to astromech R2-D2.

public class C3PODroid {

  private State state;

  public C3PODroid() {
    state = new LearningState(this);
  }

  public void timePasses() {
    if (state.getClass().equals(LearningState.class)) {
      changeStateTo(new SpeakingState(this));
    } else {
      changeStateTo(new LearningState(this));
    }
  }

  private void changeStateTo(State newState) {
    this.state = newState;
    this.state.onEnterState();
  }

  @Override
  public String toString() {
    return "C-3PO";
  }

  public void observe() {
    this.state.observe();
  }
}
