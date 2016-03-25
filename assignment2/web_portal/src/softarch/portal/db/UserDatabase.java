package softarch.portal.db;

import softarch.portal.data.UserProfile;
import softarch.portal.db.sql.DatabaseException;

public interface UserDatabase {
	public void insert(UserProfile profile) throws DatabaseException;
	
	public void update(UserProfile profile) throws DatabaseException;
	
	public UserProfile findUser(String username) throws DatabaseException;
	
	public boolean userExists(String username) throws DatabaseException;
}
