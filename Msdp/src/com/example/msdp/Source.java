package com.example.msdp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class Source {
	Mydata dbhelp;
	SQLiteDatabase database;
	String[] columns = { Mydata.COLUMN_ID, Mydata.COLUMN_DATE,
			Mydata.COLUMN_DAY, Mydata.COLUMN_ONE, Mydata.COLUMN_TWO,
			Mydata.COLUMN_THREE, Mydata.COLUMN_FOUR, Mydata.COLUMN_FIVE,
			Mydata.COLUMN_SIX, Mydata.COLUMN_SEVEN, Mydata.COLUMN_EIGHT,
			Mydata.COLUMN_NINE, Mydata.COLUMN_TEN, Mydata.COLUMN_ELEVEN,
			Mydata.COLUMN_TWELVE, Mydata.COLUMN_THIRTEEN,
			Mydata.COLUMN_FOURTEEN, Mydata.COLUMN_FIFTEEN,
			Mydata.COLUMN_SEVENTEEN, Mydata.COLUMN_SEVENTEEN };

	
	public Source(Context context) {
		dbhelp = new Mydata(context);
	}

	public void open() throws SQLException {
		database = dbhelp.getWritableDatabase();
	}

	public void close() {
		dbhelp.close();

	}

	public void insertValues(String date, String day, String one, String two,
			String three, String four, String five, String six, String seven,
			String eight, String nine, String ten, String eleven,
			String twelve, String thirteen, String fourteen, String fifteen,
			String sixteen, String seventeen) {
		ContentValues values = new ContentValues();
		values.put(Mydata.COLUMN_DATE, date);
		values.put(Mydata.COLUMN_DAY, day);
		values.put(Mydata.COLUMN_ONE, one);
		values.put(Mydata.COLUMN_TWO, two);
		values.put(Mydata.COLUMN_THREE, three);
		values.put(Mydata.COLUMN_FOUR, four);
		values.put(Mydata.COLUMN_FIVE, five);
		values.put(Mydata.COLUMN_SIX, six);
		values.put(Mydata.COLUMN_SEVEN, seven);
		values.put(Mydata.COLUMN_EIGHT, eight);
		values.put(Mydata.COLUMN_NINE, nine);
		values.put(Mydata.COLUMN_TEN, ten);
		values.put(Mydata.COLUMN_ELEVEN, eleven);
		values.put(Mydata.COLUMN_TWELVE, twelve);
		values.put(Mydata.COLUMN_THIRTEEN, thirteen);
		values.put(Mydata.COLUMN_FOURTEEN, fourteen);
		values.put(Mydata.COLUMN_FIFTEEN, fifteen);
		values.put(Mydata.COLUMN_SIXTEEN, sixteen);
		values.put(Mydata.COLUMN_SEVENTEEN, seventeen);
		database.insert(Mydata.TABLE_NAME, null, values);

	}

	public Cursor getAllValues() {

		Log.i("Mysource>>>>", "Getting Values>>>>>>>>>>>>>");

		Cursor cursor = database.query(Mydata.TABLE_NAME, new String[] {
				Mydata.COLUMN_DATE, Mydata.COLUMN_ONE, Mydata.COLUMN_TWO,
				Mydata.COLUMN_THREE, Mydata.COLUMN_FOUR, Mydata.COLUMN_FIVE,
				Mydata.COLUMN_SIX, Mydata.COLUMN_SEVEN, Mydata.COLUMN_EIGHT,
				Mydata.COLUMN_NINE, Mydata.COLUMN_TEN, Mydata.COLUMN_ELEVEN,
				Mydata.COLUMN_TWELVE, Mydata.COLUMN_THIRTEEN,
				Mydata.COLUMN_FOURTEEN, Mydata.COLUMN_FIFTEEN,
				Mydata.COLUMN_SEVENTEEN, Mydata.COLUMN_SEVENTEEN,
				Mydata.COLUMN_DAY }, null, null, null, null, null);

		return cursor;

	}

	public Cursor getValuesById(String date) {

		Log.i("Mysource>>>>", "Date is>>>>>>>>>>>>>" + date);

		String q = "SELECT * FROM " + Mydata.TABLE_NAME + " WHERE "
				+ Mydata.COLUMN_DATE + "='" + date + "'";

		Cursor cursor = database.rawQuery(q, null);
		Log.i("Mysource>>>>",
				"Cursor Count is>>>>>>>>>>>>>" + cursor.getCount());
		return cursor;

	}

	public int deleteRecordByNo(String id) {

		int value = database.delete(Mydata.TABLE_NAME, Mydata.COLUMN_ID + "='"
				+ id + "'", null);
		return value;
	}

}
