package softarch.portal.db.json;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import softarch.portal.data.Article;
import softarch.portal.data.Book;
import softarch.portal.data.Conference;
import softarch.portal.data.InterestingWebsite;
import softarch.portal.data.RegularData;
import softarch.portal.data.Report;
import softarch.portal.data.SoftwareRepository;
import softarch.portal.db.RegularDatabase;
import softarch.portal.db.sql.DatabaseException;

public class RegularJSONDatabase extends JSONDatabase implements RegularDatabase {
	private static Class regularTypes[] = {
		Article.class,
		Book.class,
		Conference.class,
		InterestingWebsite.class,
		Report.class,
		SoftwareRepository.class
	};
	
	public RegularJSONDatabase(String directory) {
		super(directory);
	}
	
	private Class<? extends RegularData> classForInformationType(String informationType) throws DatabaseException{
		switch (informationType.charAt(0)){
			case 'B': return Book.class;
			case 'A': return Article.class;
			case 'R': return Report.class;
			case 'C': return Conference.class;
			case 'S': return SoftwareRepository.class;
			case 'I': return InterestingWebsite.class;
		}
		throw new DatabaseException("Invalid information type!");
	}

	public List findRecords(String informationType, String queryString) throws DatabaseException {
		Class<? extends RegularData> cls = classForInformationType(informationType);
		return readTable(cls).rows
							 .stream()
							 .filter(x -> x.matchQuery(queryString))
							 .collect(Collectors.toList());
	}

	public List findRecordsFrom(String informationType, Date date) throws DatabaseException {
		Class<? extends RegularData> cls = classForInformationType(informationType);
		return readTable(cls).rows
							 .stream()
							 .filter(x -> x.isOlderThan(date))
							 .collect(Collectors.toList());
	}

	public void add(RegularData rd) throws DatabaseException {
		Table table = readTable(rd.getClass());
		table.rows.add(rd);
		writeTable(table, rd.getClass());
	}

	public int getNumberOfRegularRecords(String informationType) throws DatabaseException {
		Class<? extends RegularData> cls = classForInformationType(informationType);
		return readTable(cls).rows.size();
	}

}
