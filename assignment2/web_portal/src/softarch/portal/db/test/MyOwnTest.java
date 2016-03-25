package softarch.portal.db.test;

import java.util.Date;

import softarch.portal.data.FreeSubscription;
import softarch.portal.db.json.JSONDatabase;
import softarch.portal.db.json.JSONDatabase.Table;

public class MyOwnTest {
	public static void main(String[] args) {
		JSONDatabase db = new JSONDatabase(".");
		FreeSubscription user = new FreeSubscription("toon", "toon", "toon", "toon", "toon", new Date());
		System.out.println(user);
		System.out.println(db.getFileName(FreeSubscription.class));
		Table<FreeSubscription> table = (Table<FreeSubscription>) db.readTable(user.getClass());
		table.rows.add(user);
	}
}
