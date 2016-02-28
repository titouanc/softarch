
package exercise1.demo9;

public class Demo9 {

	
  public static void main(String[] args) {
    MobileDevices chest = new MobileDevices();

    ItemIterator phoneIterator = chest.iterator(ItemType.SMART_PHONE);
    while (phoneIterator.hasNext()) {
      System.out.println(phoneIterator.next());
    }

    System.out.println("===============================");

    ItemIterator tabletIterator = chest.iterator(ItemType.TABLET);
    while (tabletIterator.hasNext()) {
      System.out.println(tabletIterator.next());
    }
  }
}
