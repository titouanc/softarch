
package exercise1.demo5;

public class NullBNode implements BNode {

  private static NullBNode instance = new NullBNode();

  private NullBNode() {}

  public static NullBNode getInstance() {
    return instance;
  }

  @Override
  public int getTreeSize() {
    return 0;
  }

  @Override
  public BNode getLeft() {
    return null;
  }

  @Override
  public BNode getRight() {
    return null;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public void walk() {}
}
