package softarch.portal.db.json;

import java.util.Date;
import java.util.List;

import softarch.portal.data.RegularData;
import softarch.portal.db.RegularDatabase;
import softarch.portal.db.sql.DatabaseException;

public class RegularJSONDatabase extends JSONDatabase implements RegularDatabase {

	public RegularJSONDatabase(String directory) {
		super(directory);
	}

	public List findRecords(String informationType, String queryString) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	public List findRecordsFrom(String informationType, Date date) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(RegularData rd) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}

	public int getNumberOfRegularRecords(String informationType) throws DatabaseException {
		// TODO Auto-generated method stub
		return 0;
	}

}
