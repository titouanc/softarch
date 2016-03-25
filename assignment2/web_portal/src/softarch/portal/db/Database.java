package softarch.portal.db;

import java.util.List;

import softarch.portal.data.Data;

public interface Database {
	public abstract void create(Data data);
	
	public abstract List<Data> retrieve(String query);
	
	public abstract void update(Data data);
	
	public abstract void delete(Data data);
}
