
package exercise1.demo5;

public class BNodeImpl implements BNode {

  private final String name;
  private final BNode left;
  private final BNode right;

  public BNodeImpl(String name, BNode left, BNode right) {
    this.name = name;
    this.left = left;
    this.right = right;
  }

  @Override
  public int getTreeSize() {
    return 1 + left.getTreeSize() + right.getTreeSize();
  }

  @Override
  public BNode getLeft() {
    return left;
  }

  @Override
  public BNode getRight() {
    return right;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void walk() {
    System.out.println(name);
    if (left.getTreeSize() > 0) {
      left.walk();
    }
    if (right.getTreeSize() > 0) {
      right.walk();
    }
  }
}
