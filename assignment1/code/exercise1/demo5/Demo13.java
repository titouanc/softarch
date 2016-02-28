
package exercise1.demo5;

public class Demo13 {

	public static void main(String[] args) {

		BNode root = new BNodeImpl("Lord of The Rings",
				new BNodeImpl("Hobbits", new BNodeImpl("Frodo", NullBNode.getInstance(), NullBNode.getInstance()),
						NullBNode.getInstance()),
				new BNodeImpl("Orcs", NullBNode.getInstance(),
						new BNodeImpl("Uruks", NullBNode.getInstance(), NullBNode.getInstance()))
				);

		root.walk();
	}
}
