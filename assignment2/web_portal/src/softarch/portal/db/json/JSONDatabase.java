package softarch.portal.db.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

import softarch.portal.db.Database;

public abstract class JSONDatabase implements Database {
	private String directory;
	private Gson gson;
	
	public class Table<T> {
		public Table(int lastID, List<T> rows) {
			this.lastID = lastID;
			this.rows = rows;
		}
		public int lastID;
		public List<T> rows;
	}
	
	public JSONDatabase(String directory) {
		this.directory = directory;
		this.gson = new Gson();
	}
	
	private <T> String getFileName(Class<T> klass) {
		return this.directory + File.separator + klass.getName().toLowerCase() + "s.json";
	}
	
	protected <T> Table<T> readTable(Class<T> klass) {
		String fileName = this.getFileName(klass);
		System.out.println("getTable<" + klass.getName() + ">: JSON filename : " + fileName);
		Table<T> table;
		try {
			table = this.gson.fromJson(new JsonReader(new FileReader(fileName)), Table.class);
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			table = null;
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			table = null;
		} catch (FileNotFoundException e) {
			table = new Table<T>(0, new ArrayList<T>());
			this.writeTable(table);
		}
		return table;
	}
	
	protected <T> void writeTable(Table<T> table) {
		String fileName = this.getFileName(table.getClass());
		try {
			new FileWriter(fileName).write(this.gson.toJson(table, Table.class));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
