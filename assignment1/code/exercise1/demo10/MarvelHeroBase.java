
package exercise1.demo10;

public abstract class MarvelHeroBase implements MarvelHero {

  protected MarvelParty party;

  @Override
  public void joinedParty(MarvelParty party) {
    System.out.println(this + " joins the party ...");
    this.party = party;
  }

  @Override
  public void partyAction(Action action) {
    System.out.println(this + " " + action.getDescription());
  }

  @Override
  public void act(Action action) {
    if (party != null) {
      System.out.println(this + " " + action.toString());
      party.act(this, action);
    }
  }

  @Override
  public abstract String toString();

}
