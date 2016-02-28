
package exercise1.demo10;

public enum Action {

  JOKE("made a joke"), DRINK("drinks a Leffe"), DANCE("is dancing");

  private String description;

  Action(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public String toString() {
    return description;
  }
}
