
package exercise1.demo6;

public class Hulk implements SuperHero {

  private SuperHero hero;

  public Hulk(SuperHero hero) {
    this.hero = hero;
  }

  @Override
  public void attack() {
    System.out.println(">> Huuuuuulk!");
    hero.attack();
  }

  @Override
  public int getStrengthLevel() {
    return hero.getStrengthLevel() + 20;
  }

  @Override
  public void fleeBattle() {
    hero.fleeBattle();
    System.out.println(">> AVENGERS, Where are you?");
  }
}
