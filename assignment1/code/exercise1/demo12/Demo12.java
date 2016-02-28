
package exercise1.demo12;


public class Demo12 {

	public static void main(String[] args) {

		TaxiCabPool pool = new TaxiCabPool();
		System.out.println(pool);
		TaxiCab cab1 = pool.checkOut();
		System.out.println("Checked out " + cab1);
		System.out.println(pool);
		TaxiCab cab2 = pool.checkOut();
		System.out.println("Checked out " + cab2);
		TaxiCab cab3 = pool.checkOut();
		System.out.println("Checked out " + cab3);
		System.out.println(pool);
		System.out.println("Checking in " + cab1);
		pool.checkIn(cab1);
		System.out.println("Checking in " + cab2);
		pool.checkIn(cab2);
		System.out.println(pool);
		
	}
}
