package com.example.msdp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class SourceActivity {
	Mydata1 dbhelp;
	SQLiteDatabase database;
	String[] columns = { Mydata1.COLUMN_ID, Mydata1.COLUMN_DATE,
			Mydata1.COLUMN_ONE, Mydata1.COLUMN_TWO, Mydata1.COLUMN_THREE,
			Mydata1.COLUMN_FOUR, Mydata1.COLUMN_FIVE, Mydata1.COLUMN_SIX,
			Mydata1.COLUMN_SEVEN, Mydata1.COLUMN_EIGHT, Mydata1.COLUMN_NINE,
			Mydata1.COLUMN_TEN, Mydata1.COLUMN_DATE1, Mydata1.COLUMN_ELEVEN };

	public SourceActivity(Context context) {
		dbhelp = new Mydata1(context);
	}

	public void open() throws SQLException {
		database = dbhelp.getWritableDatabase();
	}

	public void close() {
		dbhelp.close();

	}

	public void insertValues(String date, String one, String two, String three,
			String four, String five, String six, String seven, String eight,
			String nine, String ten, String date1, String eleven) {
		ContentValues values = new ContentValues();
		values.put(Mydata1.COLUMN_DATE, date);
		values.put(Mydata1.COLUMN_ONE, one);
		values.put(Mydata1.COLUMN_TWO, two);
		values.put(Mydata1.COLUMN_THREE, three);
		values.put(Mydata1.COLUMN_FOUR, four);
		values.put(Mydata1.COLUMN_FIVE, five);
		values.put(Mydata1.COLUMN_SIX, six);
		values.put(Mydata1.COLUMN_SEVEN, seven);
		values.put(Mydata1.COLUMN_EIGHT, eight);
		values.put(Mydata1.COLUMN_NINE, nine);
		values.put(Mydata1.COLUMN_TEN, ten);
		values.put(Mydata1.COLUMN_DATE1, date1);
		values.put(Mydata1.COLUMN_ELEVEN, eleven);
		database.insert(Mydata1.TABLE_NAME, null, values);

	}

	public Cursor getAllValues() {

		Log.i("Mysource>>>>", "Getting Values>>>>>>>>>>>>>");

		Cursor cursor = database.query(Mydata1.TABLE_NAME, new String[] {
				Mydata1.COLUMN_DATE, Mydata1.COLUMN_ONE, Mydata1.COLUMN_TWO,
				Mydata1.COLUMN_THREE, Mydata1.COLUMN_FOUR, Mydata1.COLUMN_FIVE,
				Mydata1.COLUMN_SIX, Mydata1.COLUMN_SEVEN, Mydata1.COLUMN_EIGHT,
				Mydata1.COLUMN_NINE, Mydata1.COLUMN_TEN, Mydata1.COLUMN_DATE1,
				Mydata1.COLUMN_ELEVEN }, null, null, null, null, null);

		return cursor;

	}

	public Cursor getValuesById(String date) {

		Log.i("Mysource>>>>", "Date is>>>>>>>>>>>>>" + date);

		String q = "SELECT * FROM " + Mydata1.TABLE_NAME + " WHERE "
				+ Mydata1.COLUMN_DATE + "='" + date + "'";

		Cursor cursor = database.rawQuery(q, null);
		Log.i("Mysource>>>>",
				"Cursor Count is>>>>>>>>>>>>>" + cursor.getCount());
		return cursor;

	}

	public int deleteRecordByNo(String id) {

		int value = database.delete(Mydata1.TABLE_NAME, Mydata1.COLUMN_ID
				+ "='" + id + "'", null);
		return value;
	}

}
