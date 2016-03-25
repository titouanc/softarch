package softarch.portal.db.json;

import java.util.List;

import softarch.portal.data.RawData;
import softarch.portal.data.RegularData;
import softarch.portal.db.RawDatabase;
import softarch.portal.db.sql.DatabaseException;

public class RawJSONDatabase extends JSONDatabase implements RawDatabase {
	public RawJSONDatabase(String directory) {
		super(directory);
	}
	
	private int findId(Table<RawData> table, int id) throws DatabaseException{
		int i = 0;
		for (RawData elmt : table.rows){
			if (elmt.getId() == id){
				return i;
			}
			i++;
		}
		throw new DatabaseException("ID not found");
	}

	public List getRawData() throws DatabaseException {
		return readTable(RawData.class).rows;
	}

	public RawData getRawData(int id) throws DatabaseException {
		Table<RawData> table = readTable(RawData.class);
		return table.rows.get(findId(table, id));
	}

	public void addRawData(RegularData regularData) throws DatabaseException {
		Table<RawData> table = readTable(RawData.class);
		table.lastID++;
		RawData rawData = new RawData(table.lastID, regularData);
		table.rows.add(rawData);
		writeTable(table, RawData.class);
	}

	public void deleteRawData(RawData rd) throws DatabaseException {
		Table<RawData> table = readTable(RawData.class);
		table.rows.remove(findId(table, rd.getId()));
		writeTable(table, RawData.class);
	}

	public void updateRawData(RawData rd) throws DatabaseException {
		Table<RawData> table = readTable(RawData.class);
		int idx = findId(table, rd.getId());
		table.rows.set(idx, rd);
		writeTable(table, RawData.class);
	}

	public int getNumberOfRawRecords() throws DatabaseException {
		return readTable(RawData.class).rows.size();
	}
}
