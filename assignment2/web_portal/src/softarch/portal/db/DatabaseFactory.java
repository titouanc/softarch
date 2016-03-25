package softarch.portal.db;

import java.net.URL;

public class DatabaseFactory {
	public Database createDatabase(String dsn){
		URL url = new URL(dsn);
		switch (url.getProtocol()){
		case "json":
			return createJSONDatabase(url);
		case "hsql":
			return createSQLDatabase(url);
		default: throw new UnsupportedDatabaseProtocol();
		}
	}
	
	private JSONDatabase createJSONDatabase(URL url){
		
	}
}
