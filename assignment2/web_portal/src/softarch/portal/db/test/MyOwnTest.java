package softarch.portal.db.test;

import java.util.Date;

import softarch.portal.data.FreeSubscription;
import softarch.portal.db.json.JSONDatabase;
import softarch.portal.db.json.JSONDatabase.Table;

public class MyOwnTest {
	public static void main(String[] args) {
		JSONDatabase db = new JSONDatabase(".");
		FreeSubscription user = new FreeSubscription("toon", "toon", "toon", "toon", "toon", new Date());
		Table<FreeSubscription> table = (Table<FreeSubscription>) db.readTable(user.getClass());
		table.rows.add(user);
		db.writeTable(table, FreeSubscription.class);
		System.out.println(table.rows.get(0).getClass());
	}
}
