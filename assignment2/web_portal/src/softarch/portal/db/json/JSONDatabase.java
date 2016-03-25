package softarch.portal.db.json;

import softarch.portal.data.Data;
import softarch.portal.db.Database;

public abstract class JSONDatabase implements Database {
	protected String directory;
	
	public JSONDatabase(String directory) {
		this.directory = directory;
	}
}
