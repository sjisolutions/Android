package com.example.msdp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Mydata extends SQLiteOpenHelper 
{

	public static final String DATABASE_NAME = "dates.db";
	public static final int DATABASE_VERSION = 1;
	public static final String TABLE_NAME = "listanswers";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_DATE = "date";
	public static final String COLUMN_DAY = "day";
	public static final String COLUMN_ONE = "one";
	public static final String COLUMN_TWO = "two";
	public static final String COLUMN_THREE = "three";
	public static final String COLUMN_FOUR = "four";
	public static final String COLUMN_FIVE = "five";
	public static final String COLUMN_SIX = "six";
	public static final String COLUMN_SEVEN = "seven";
	public static final String COLUMN_EIGHT = "eight";
	public static final String COLUMN_NINE = "nine";
	public static final String COLUMN_TEN = "ten";
	public static final String COLUMN_ELEVEN = "eleven";
	public static final String COLUMN_TWELVE = "twelve";
	public static final String COLUMN_THIRTEEN = "thirteen";
	public static final String COLUMN_FOURTEEN = "fourteen";
	public static final String COLUMN_FIFTEEN = "fifteen";
	public static final String COLUMN_SIXTEEN = "sixteen";
	public static final String COLUMN_SEVENTEEN = "seventeen";
	

	public static final String DATABASE_CREATE_TABLE = "create table "
			+ TABLE_NAME + "(" + COLUMN_ID
			+ " integer primary key autoincrement," + COLUMN_DATE
			+ " text not null," + COLUMN_DAY
			+ " text not null," + COLUMN_ONE
			+ " text not null," + COLUMN_TWO
			+ " text not null," + COLUMN_THREE
			+ " text not null," + COLUMN_FOUR
			+ " text not null," + COLUMN_FIVE
			+ " text not null," + COLUMN_SIX
			+ " text not null," + COLUMN_SEVEN
			+ " text not null," + COLUMN_EIGHT
			+ " text not null," + COLUMN_NINE
			+ " text not null," + COLUMN_TEN
			+ " text not null," + COLUMN_ELEVEN
			+ " text not null," + COLUMN_TWELVE
			+ " text not null," + COLUMN_THIRTEEN
			+ " text not null," + COLUMN_FOURTEEN
			+ " text not null," + COLUMN_FIFTEEN
			+ " text not null," + COLUMN_SIXTEEN
			+ " text not null," + COLUMN_SEVENTEEN
			+ " text not null);";
	public Mydata(Context con) {
		super(con, DATABASE_NAME, null, DATABASE_VERSION);
	}

	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
