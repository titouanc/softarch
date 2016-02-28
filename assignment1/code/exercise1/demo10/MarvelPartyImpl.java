
package exercise1.demo10;

import java.util.ArrayList;
import java.util.List;

public class MarvelPartyImpl implements MarvelParty {

  private final List<MarvelHero> heros;

  public MarvelPartyImpl() {
    heros = new ArrayList<>();
  }

  @Override
	public void act(MarvelHero mh, Action action) {
    for (MarvelHero hero : heros) {
      if (!hero.equals(mh)) {
        hero.partyAction(action);
      }
    }
  }

  @Override
  public void addMember(MarvelHero hero) {
    heros.add(hero);
    hero.joinedParty(this);
  }
}
