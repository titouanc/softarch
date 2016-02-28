
package exercise1.demo6;

public class BruceBanner implements SuperHero {

  public void attack() {
    System.out.println(">> Taste my fist!");
  }

  @Override
  public int getStrengthLevel() {
    return 10;
  }

  public void fleeBattle() {
    System.out.println(">> ... going for help!");
  }
}
