
package exercise1.demo4;

public enum HairColor {

  WHITE, BLOND, BROWN, BLACK, GREY;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
