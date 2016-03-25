package softarch.portal.db.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import softarch.portal.data.Administrator;
import softarch.portal.data.Data;
import softarch.portal.data.FreeSubscription;
import softarch.portal.db.Database;

public class JSONDatabase implements Database {
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
	
	public <T> String getFileName(Class<T> klass) {
		return this.directory + File.separator + klass.getName().toLowerCase() + "s.json";
	}
	
	private <T> Type getType(Class<T> klass) {
		if (klass == Administrator.class) {
			return new TypeToken<Table<Administrator>>() {}.getType();
		}
		else if (klass == FreeSubscription.class) {
			return new TypeToken<Table<FreeSubscription>>() {}.getType();
		}
		return null;
	}
	
	public <T> Table<T> readTable(Class<T> klass) {
		String fileName = this.getFileName(klass);
		System.out.println("readTable<" + klass.getName() + ">: JSON filename : " + fileName);
		Table<T> table;
		try {
			table = this.gson.fromJson(new JsonReader(new FileReader(fileName)), this.getType(klass));
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
			this.writeTable(table, klass);
		}
		return table;
	}
	
	public <T> void writeTable(Table<T> table, Class<T> type) {
		String fileName = this.getFileName(type);
		System.out.println("writeTable<" + table.getClass().getName() + ">: JSON filename : " + fileName);
		FileWriter writer;
		try {
			writer = new FileWriter(fileName);
			writer.write(this.gson.toJson(table, Table.class));
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
