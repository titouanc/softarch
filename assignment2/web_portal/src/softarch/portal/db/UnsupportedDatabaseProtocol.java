package softarch.portal.db;

public class UnsupportedDatabaseProtocol extends DatabaseException {

	public UnsupportedDatabaseProtocol(String message) {
		super("Unsupported database protocol: " + message);
	}
	
}
