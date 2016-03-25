package softarch.portal.db;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import softarch.portal.db.json.JSONDatabase;
import softarch.portal.db.sql.SQLDatabase;

public class DatabaseFactory {
	private String extractJSONParam(URI url) throws DatabaseException {
		String path = url.getPath();
		if (path == null){
			throw new DatabaseException("Missing path to JSON database");
		}
		return path;
	}
	
	private String[] extractSQLParams(URI url) throws DatabaseException {
		String path = url.getPath();
		if (path == null){
			throw new DatabaseException("Missing path to database");
		}
		
		String userInfo = url.getUserInfo();
		if (userInfo == null){
			throw new DatabaseException("Missing user information for database");
		}
		String userSplitted[] = userInfo.split(":");
		
		String res[] = new String[3];
		res[0] = userSplitted[0];
		res[1] = userSplitted[1];
		res[2] = path;
		return res;
	}
	
	private JSONDatabase createJSONDatabase(URI url, Constructor<? extends JSONDatabase> constr) throws DatabaseException {
		try {
			return constr.newInstance(extractJSONParam(url));
		} catch (Exception err) {
			throw new DatabaseException("Error when instanciating JSON database");
		}
	}
		
	private SQLDatabase createSQLDatabase(URI url, Constructor<? extends SQLDatabase> constr) throws DatabaseException {
		try {
			String args[] = extractSQLParams(url);
			return constr.newInstance(args[0], args[1], args[2]);
		} catch (Exception err) {
			throw new DatabaseException("Error when instanciating SQL database");
		}
	}
	
	public Database createUserDatabase(String dsn){
		URI url = new URI(dsn);
		String scheme = url.getScheme();
		if (scheme == "json")
			return createJSONDatabase(url, UserJSONDatabase.class.getConstructor(String.class));
		if (scheme == "hsql")
			return createSQLDatabase(url, UserSQLDatabase.class.getConstructor(String.class, String.class, String.class));
		throw new UnsupportedDatabaseProtocol(scheme);
	}
	
	public Database createRawDatabase(String dsn){
		URI url = new URI(dsn);
		String scheme = url.getScheme();
		if (scheme == "json")
			return createJSONDatabase(url, RawJSONDatabase.class.getConstructor(String.class));
		if (scheme == "hsql")
			return createSQLDatabase(url, RawSQLDatabase.class.getConstructor(String.class, String.class, String.class));
		throw new UnsupportedDatabaseProtocol(scheme);
	}
	
	public Database createRegularDatabase(String dsn){
		URI url = new URI(dsn);
		String scheme = url.getScheme();
		if (scheme == "json")
			return createJSONDatabase(url, RegularJSONDatabase.class.getConstructor(String.class));
		if (scheme == "hsql")
			return createSQLDatabase(url, RegularSQLDatabase.class.getConstructor(String.class, String.class, String.class));
		throw new UnsupportedDatabaseProtocol(scheme);
	}
}
