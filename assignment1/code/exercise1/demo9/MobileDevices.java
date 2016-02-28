
package exercise1.demo9;

import java.util.ArrayList;
import java.util.List;


public class MobileDevices {

  private List<Item> items;

  /**
   * Constructor
   */
  public MobileDevices() {
    items = new ArrayList<>();
    items.add(new Item("Samsung Galaxy S6", ItemType.SMART_PHONE));
    items.add(new Item("Nexus 7", ItemType.TABLET));
    items.add(new Item("iPhone 5", ItemType.SMART_PHONE));
    items.add(new Item("iPad 2", ItemType.TABLET));
  }

  ItemIterator iterator(ItemType itemType) {
    return new MobileDevicesItemIterator(this, itemType);
  }

  /**
   * Get all items
   */
  public List<Item> getItems() {
    ArrayList<Item> list = new ArrayList<>();
    list.addAll(items);
    return list;
  }

}
