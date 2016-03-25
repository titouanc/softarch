package softarch.portal.db.json;

import java.util.List;

import softarch.portal.data.UserProfile;
import softarch.portal.db.UserDatabase;
import softarch.portal.db.sql.DatabaseException;

public class UserJSONDatabase extends JSONDatabase implements UserDatabase {

	public UserJSONDatabase(String directory) {
		super(directory);
	}

	public void insert(UserProfile profile) throws DatabaseException {
		Table<UserProfile> table = readTable(UserProfile.class);
		profile.setId(table.lastID++);
		table.rows.add(profile);
		writeTable(table, UserProfile.class);
	}

	public void update(UserProfile profile) throws DatabaseException {
		Table<UserProfile> table = readTable(UserProfile.class);
		table.rows.set(this.findId(table, profile.getId()), profile);
		writeTable(table, UserProfile.class);
	}

	public UserProfile findUser(String username) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean userExists(String username) throws DatabaseException {
		// TODO Auto-generated method stub
		return false;
	}

}
