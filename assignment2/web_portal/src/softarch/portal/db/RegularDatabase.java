package softarch.portal.db;

import java.util.Date;
import java.util.List;

import softarch.portal.data.RegularData;
import softarch.portal.db.sql.DatabaseException;

public interface RegularDatabase {
	public List findRecords(String informationType, String queryString) throws DatabaseException;
	
	public List findRecordsFrom(String informationType, Date date) throws DatabaseException;
	
	public void add(RegularData rd) throws DatabaseException;
	
	public int getNumberOfRegularRecords(String informationType) throws DatabaseException;
}
