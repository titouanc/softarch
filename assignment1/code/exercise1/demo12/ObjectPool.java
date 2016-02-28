
package exercise1.demo12;

import java.util.HashSet;

public abstract class ObjectPool<T> {

  private HashSet<T> available = new HashSet<>();
  private HashSet<T> inUse = new HashSet<>();

  protected abstract T create();

  public synchronized T checkOut() {
    if (available.size() <= 0) {
      available.add(create());
    }
    T instance = available.iterator().next();
    available.remove(instance);
    inUse.add(instance);
    return instance;
  }

  public synchronized void checkIn(T instance) {
    inUse.remove(instance);
    available.add(instance);
  }

  @Override
  public String toString() {
    return String.format("Status: available= %d in use=%d", available.size(), inUse.size());
  }
}
