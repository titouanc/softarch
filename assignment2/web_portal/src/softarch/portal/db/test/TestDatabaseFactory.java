package softarch.portal.db.test;

import softarch.portal.db.Database;
import softarch.portal.db.DatabaseException;
import softarch.portal.db.DatabaseFactory;

public class TestDatabaseFactory {
	public static void main(String[] args) {
		DatabaseFactory factory = new DatabaseFactory();
		try {
			System.out.println(factory.createRegularDatabase("json:///tmp/hello"));
			System.out.println(factory.createRegularDatabase("hsql://SA:@db/jdbc:hsqldb:file:web_portal;shutdown=true"));
		} catch (DatabaseException e) {
			e.printStackTrace();
		}
	}

}
