
package exercise3.demo17;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

public class DemoUtils {

	private DemoUtils() {
	}

	// This method saves a fish object to a file
	public static void writeFish(Fish fish, String filename) throws IOException {

	}

	// This method reads a fish object from a file
	public static Fish readFish(String filename) throws IOException {
		// Reading a fish form a file
		Fish f = new Fish();
		// set attributes of the fish
		return f;
	}

	// This method gets weather info for a city
	public static String getWeatherInfo(String city) {
		// search for city's weather info
		String info = "Weather ......"; // real info about the reader
		return info;
	}

	// This method sets a database connection
	public static Connection connectToDB(String ip, String port, String user, String pass) {
		Connection conn = null; // new connection
		// set the DB connection and initialize the Connection object
		return conn;
	}

	// This method executes a user's query 
	public static ResultSet executeQuery(Connection conn, String query) {
		// run a SQL query
		ResultSet res = null; // list of results
		return res;
	}

	// This method removes an object from the DB 
	public static boolean deleteObject(Connection conn, String query) {
		// run a SQL query
		boolean res = true; // true if the object was eliminated, false in other
							// case
		return res;
	}

	// This method adds a Fish to the Fishboowl list 
	public static boolean addFish(Fishbowl fishbowl, Fish f) {
		return fishbowl.fishList.add(f);
	}

	// This method removes a Fish to the Fishboowl list
	public static boolean removeFish(Fishbowl fishbowl, Fish f) {
		return fishbowl.fishList.remove(f);
	}

	// This method removes a Fish to the Fishboowl list
	public static Fish removeFish(Fishbowl fishbowl, int index) {
		return fishbowl.fishList.remove(index);
	}

}
