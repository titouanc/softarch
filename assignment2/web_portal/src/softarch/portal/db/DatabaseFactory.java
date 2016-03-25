package softarch.portal.db;

import java.lang.reflect.Constructor;
import java.net.URI;
import java.net.URISyntaxException;

import softarch.portal.db.json.JSONDatabase;
import softarch.portal.db.json.RawJSONDatabase;
import softarch.portal.db.json.RegularJSONDatabase;
import softarch.portal.db.json.UserJSONDatabase;
import softarch.portal.db.sql.RawSQLDatabase;
import softarch.portal.db.sql.RegularSQLDatabase;
import softarch.portal.db.sql.SQLDatabase;
import softarch.portal.db.sql.UserSQLDatabase;

public class DatabaseFactory {
	private JSONDatabase createJSONDatabase(URI url, Class<? extends JSONDatabase> cls) throws DatabaseException {
		String path = url.getPath();
		if (path == null){
			throw new DatabaseException("Missing path to JSON database");
		}
		try {
			Constructor<? extends JSONDatabase> constr = cls.getConstructor(String.class);
			return constr.newInstance(path);
		} catch (Exception err) {
			throw new DatabaseException("Error when instanciating JSON database");
		}
	}
		
	private SQLDatabase createSQLDatabase(URI url, Class<? extends SQLDatabase> cls) throws DatabaseException {
		String path = url.getPath();
		if (path == null){
			throw new DatabaseException("Missing path to database");
		}
		
		String userInfo = url.getUserInfo();
		if (userInfo == null){
			throw new DatabaseException("Missing user information for database");
		}
		String userSplitted[] = userInfo.split(":");
		String username, password;
		if (userSplitted.length == 2){
			username = userSplitted[0];
			password = userSplitted[1];
		} else {
			username = userSplitted[0];
			password = "";
		}
		
		try {
			Constructor<? extends SQLDatabase> constr = cls.getConstructor(String.class, String.class, String.class);
			return constr.newInstance(username, password, path);
		} catch (Exception err) {
			throw new DatabaseException("Error when instanciating SQL database");
		}
	}
	
	public Database createUserDatabase(String dsn) throws DatabaseException {
		try {
			URI url = new URI(dsn);
			String scheme = url.getScheme();
			if (scheme.equals("json"))
				return createJSONDatabase(url, UserJSONDatabase.class);
			if (scheme.equals("hsql"))
				return createSQLDatabase(url, UserSQLDatabase.class);
			throw new UnsupportedDatabaseProtocol(scheme);
		} catch (URISyntaxException e) {
			throw new DatabaseException("Invalid DSN");
		}
	}
	
	public Database createRawDatabase(String dsn) throws DatabaseException {
		try {
			URI url = new URI(dsn);
			String scheme = url.getScheme();
			if (scheme.equals("json"))
				return createJSONDatabase(url, RawJSONDatabase.class);
			if (scheme.equals("hsql"))
				return createSQLDatabase(url, RawSQLDatabase.class);
			throw new UnsupportedDatabaseProtocol(scheme);
		} catch (URISyntaxException e) {
			throw new DatabaseException("Invalid DSN");
		}
	}
	
	public Database createRegularDatabase(String dsn) throws DatabaseException {
		try {
			URI url = new URI(dsn);
			String scheme = url.getScheme();
			if (scheme.equals("json"))
				return createJSONDatabase(url, RegularJSONDatabase.class);
			if (scheme.equals("hsql"))
				return createSQLDatabase(url, RegularSQLDatabase.class);
			throw new UnsupportedDatabaseProtocol(scheme);
		} catch (URISyntaxException e) {
			throw new DatabaseException("Invalid DSN");
		}
	}
}
