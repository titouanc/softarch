package softarch.portal.data;

import java.util.Date;

/**
 * This is an abstract superclass for all regular data (all data that
 * is inserted into or retrieved from the regular database).
 * @author Niels Joncheere
 */
public abstract class RegularData extends Data {
	protected Date dateAdded;
	
	/**
	 * Return true if one of the interesting field of a regular data
	 * match a given query text
	 * @param query The text to find into attributes
	 * @return true if match, false otherwise
	 */
	public abstract boolean matchQuery(String query);
	
	public boolean isOlderThan(Date date){
		return dateAdded.after(date);
	}

	/**
	 * Returns an SQL INSERT string that allows the system to add the
	 * regular data object to a relational database.
	 */
	public abstract String asSql();

	/**
	 * Returns an SQL INSERT string that allows the system to add a
	 * <code>RawData</code> object with a <code>RegularData</code>
	 * structure to a relational database.
	 * @see softarch.portal.data.RawData
	 */
	public abstract String asSql(RawData rd);

	/**
	 * Returns an SQL DELETE string that allows the system to delete a
	 * <code>RawData</code> object with a <code>RegularData</code>
	 * structure from a relational database.
	 * @see softarch.portal.data.RawData
	 */
	public abstract String asSqlDelete(RawData rd);
}
