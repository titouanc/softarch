package softarch.portal.db.json;

import java.util.List;

import softarch.portal.data.CheapSubscription;
import softarch.portal.data.ExpensiveSubscription;
import softarch.portal.data.ExpertAdministrator;
import softarch.portal.data.ExternalAdministrator;
import softarch.portal.data.FreeSubscription;
import softarch.portal.data.Operator;
import softarch.portal.data.RegularUser;
import softarch.portal.data.UserProfile;
import softarch.portal.db.UserDatabase;
import softarch.portal.db.sql.DatabaseException;

public class UserJSONDatabase extends JSONDatabase implements UserDatabase {
	private static Class userTypes[] = {
		CheapSubscription.class,
		ExpensiveSubscription.class,
		ExpertAdministrator.class,
		ExternalAdministrator.class,
		FreeSubscription.class,
		Operator.class,
		RegularUser.class
	};

	private void updateNextId(){
		int maxId = 0;
		for (Class cls : userTypes){
			Table<? extends UserProfile> table = readTable(cls);
			if (table.lastID > maxId)
				maxId = table.lastID;
		}
		for (Class cls : userTypes){
			Table<? extends UserProfile> table = readTable(cls);
			table.lastID = maxId;
			writeTable(table, cls);
		}
	}
	
	
	public UserJSONDatabase(String directory) {
		super(directory);
	}

	public void insert(UserProfile profile) throws DatabaseException {
		Table table = readTable(profile.getClass());
		profile.setId(table.lastID++);
		table.rows.add(profile);
		writeTable(table, profile.getClass());
		updateNextId();
	}

	public void update(UserProfile profile) throws DatabaseException {
		Table table = readTable(profile.getClass());
		table.rows.set(this.findId(table, profile.getId()), profile);
		writeTable(table, profile.getClass());
	}

	public UserProfile findUser(String username) throws DatabaseException {
		for (Class cls : userTypes){
			List<? extends UserProfile> rows = readTable(cls).rows;
			for (UserProfile user : rows){
				if (user.getUsername().equals(username)){
					return user;
				}
			}
		}
		throw new DatabaseException("Invalid username!");
	}

	public boolean userExists(String username) throws DatabaseException {
		for (Class cls : userTypes){
			List<? extends UserProfile> rows = readTable(cls).rows;
			for (UserProfile user : rows){
				if (user.getUsername().equals(username)){
					return true;
				}
			}
		}
		return false;
	}

}
