
package exercise1.demo9;

import java.util.List;


public class MobileDevicesItemIterator implements ItemIterator {

  private MobileDevices devices;
  private int idx;
  private ItemType type;

  /**
   * Constructor
   */
  public MobileDevicesItemIterator(MobileDevices chest, ItemType type) {
    this.devices = chest;
    this.type = type;
    this.idx = -1;
  }

  @Override
  public boolean hasNext() {
    return findNextIdx() != -1;
  }

  @Override
  public Item next() {
    idx = findNextIdx();
    if (idx != -1) {
      return devices.getItems().get(idx);
    }
    return null;
  }

  private int findNextIdx() {

    List<Item> items = devices.getItems();
    boolean found = false;
    int tempIdx = idx;
    while (!found) {
      tempIdx++;
      if (tempIdx >= items.size()) {
        tempIdx = -1;
        break;
      }
      if (items.get(tempIdx).getType().equals(type)) {
        break;
      }
    }
    return tempIdx;
  }
}
