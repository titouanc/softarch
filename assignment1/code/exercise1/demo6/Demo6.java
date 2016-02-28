
package exercise1.demo6;

public class Demo6 {

  public static void main(String[] args) {

    System.out.println("A super hero in action.");
    SuperHero bruce = new BruceBanner();
    bruce.attack();
    bruce.fleeBattle();
    System.out.printf("Banner's power %d.\n", bruce.getStrengthLevel());

    System.out.println("\nTransformation into Hulk.");
    SuperHero hulk = new Hulk(bruce);
    hulk.attack();
    hulk.fleeBattle();
    System.out.printf("Banner-Hulk's power %d.\n", hulk.getStrengthLevel());
  }
}
