
package exercise1.demo14;

public class Demo14 {

  public static void main(String[] args) {

    Atomium atomium1 = Atomium.getInstance();
    Atomium atomium2 = Atomium.getInstance();
    System.out.println("Atomium1=" + atomium1);
    System.out.println("Atomium2=" + atomium2);

    EnumAtomium enumAtomium1 = EnumAtomium.INSTANCE;
    EnumAtomium enumAtomium2 = EnumAtomium.INSTANCE;
    System.out.println("enumAtomium1=" + enumAtomium1);
    System.out.println("enumAtomium2=" + enumAtomium2);

   
  }
}
