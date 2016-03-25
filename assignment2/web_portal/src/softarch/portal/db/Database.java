package softarch.portal.db;

import softarch.portal.data.Data;

public interface Database {
	public abstract void create(Data data);
	
	public abstract Data retrieve(int id);
	
	public abstract void update(Data data);
	
	public abstract void delete(Data data);
}
