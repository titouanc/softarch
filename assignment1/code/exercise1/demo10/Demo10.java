
package exercise1.demo10;

public class Demo10 {

  public static void main(String[] args) {

    Wolverine wolverine = new Wolverine();
    Hulk hulk = new Hulk();
    IronMan ironMan = new IronMan();
    SpiderMan spiderMan = new SpiderMan();
    CapitanAmerica capAmerica = new CapitanAmerica();

  
    MarvelParty party = new MarvelPartyImpl();
    party.addMember(wolverine);
    party.addMember(hulk);
    party.addMember(ironMan);
    party.addMember(spiderMan);
    party.addMember(capAmerica);

    wolverine.act(Action.JOKE);
    hulk.act(Action.DRINK);
    ironMan.act(Action.DANCE);
    spiderMan.act(Action.JOKE);
    capAmerica.act(Action.DRINK);
  }
}
