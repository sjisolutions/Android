package com.example.msdp;

import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class FifthActivity1 extends Activity {
	@SuppressWarnings("rawtypes")
	ArrayList list;
	SourceActivity source;
	String itemDate;
	@SuppressWarnings("unused")
	private SimpleAdapter adapter;
	EditText tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12,
			tv13, tv14, tv15, tv16, tv17, tvdate, tvday;
	String one, two, three, four, five, six, seven, eight, nine, ten, eleven,
			twelve, thirteen, fourteen, fifteen, sixteen, seventeen, date1,
			day;
	TextView txtfour, txtmain, txtmain1, txtone, txttwo, txtthree, txtfive,
			txtsix, txtseven, txteight, txtnine, txtten, txteleven, txttwelve,
			txtthirteen, txtfourteen, txtfifteen, txtsixteen, txtseventeen,
			txtday, txtdate, txtdate1, txt1, txt2, txt3, txt4, txt5, txt6,
			txt7, txt8, txt9;
	Typeface tf;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.userguide_third_activity);
		TextView progresshistory = (TextView) findViewById(R.id.progresshistory);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		progresshistory.setTypeface(tf);
		progresshistory.setTextSize(20.0f);
		progresshistory.setTextColor(Color.BLACK);

		itemDate = getIntent().getExtras().getString("date");

		tv1 = (EditText) findViewById(R.id.edtone);
		tv2 = (EditText) findViewById(R.id.edttwo);
		tv3 = (EditText) findViewById(R.id.edtthree);
		tv4 = (EditText) findViewById(R.id.edtfour);
		tv5 = (EditText) findViewById(R.id.edtfive);
		tv6 = (EditText) findViewById(R.id.edtsix);
		tv7 = (EditText) findViewById(R.id.edtseven);
		tv8 = (EditText) findViewById(R.id.edteight);
		tv9 = (EditText) findViewById(R.id.edtnine);
		tv10 = (EditText) findViewById(R.id.edtten);
		tvdate = (EditText) findViewById(R.id.edtdate);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		txtdate = (TextView) findViewById(R.id.txtdate);
		txtfour = (TextView) findViewById(R.id.txtfour);

		txtone = (TextView) findViewById(R.id.txtone);
		txttwo = (TextView) findViewById(R.id.txttwo);
		txtthree = (TextView) findViewById(R.id.txtthree);
		txtfive = (TextView) findViewById(R.id.txtfive);
		txtsix = (TextView) findViewById(R.id.txtsix);
		txtseven = (TextView) findViewById(R.id.txtseven);
		txteight = (TextView) findViewById(R.id.txteight);
		txtnine = (TextView) findViewById(R.id.txtnine);
		txtten = (TextView) findViewById(R.id.txtten);
		txteleven = (TextView) findViewById(R.id.txteleven);
		txttwelve = (TextView) findViewById(R.id.txttwelve);
		txtdate1 = (TextView) findViewById(R.id.txtdate1);

		txt1 = (TextView) findViewById(R.id.txt1);
		txt2 = (TextView) findViewById(R.id.txt2);
		txt3 = (TextView) findViewById(R.id.txt3);
		txt4 = (TextView) findViewById(R.id.txt4);
		txt5 = (TextView) findViewById(R.id.txt5);
		txt6 = (TextView) findViewById(R.id.txt6);
		txt7 = (TextView) findViewById(R.id.txt7);
		txt8 = (TextView) findViewById(R.id.txt8);
		txt9 = (TextView) findViewById(R.id.txt9);

		txtone.setTypeface(tf);
		txttwo.setTypeface(tf);
		txtthree.setTypeface(tf);
		txtfour.setTypeface(tf);
		txtfive.setTypeface(tf);
		txtsix.setTypeface(tf);
		txtseven.setTypeface(tf);
		txteight.setTypeface(tf);
		txtnine.setTypeface(tf);
		txtten.setTypeface(tf);
		txteleven.setTypeface(tf);
		txttwelve.setTypeface(tf);
		txtdate.setTypeface(tf);
		txtdate1.setTypeface(tf);
		txt1.setTypeface(tf);
		txt2.setTypeface(tf);
		txt3.setTypeface(tf);
		txt4.setTypeface(tf);
		txt5.setTypeface(tf);
		txt6.setTypeface(tf);
		txt7.setTypeface(tf);
		txt8.setTypeface(tf);
		txt9.setTypeface(tf);

		source = new SourceActivity(this);
		getListDataByDate(itemDate);
	}

	private ArrayList<HashMap<String, String>> getListDataByDate(String date) {

		source.open();
		Cursor cursor = source.getValuesById(date);
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		boolean recexist = cursor.moveToFirst();

		Log.i("Boolean Value    ", "" + recexist);

		if (recexist) {
			do {
				String date1 = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(1)));
				tvdate.setText(date1);

				String one = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(2)));
				Log.i("Boolean Value    ", "" + one);
				tv1.setText(one);

				String two = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(3)));
				tv2.setText(two);
				String three = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(4)));
				tv3.setText(three);
				String four = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(5)));
				tv4.setText(four);
				String five = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(6)));
				tv5.setText(five);
				String six = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(7)));
				tv6.setText(six);
				String seven = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(8)));
				tv7.setText(seven);

				String eight = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(9)));
				tv8.setText(eight);
				String nine = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(10)));
				tv9.setText(nine);
				String ten = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(11)));
				tv10.setText(ten);

				HashMap<String, String> map = new HashMap<String, String>();
				map.put("one", one);
				map.put("two", two);
				map.put("three", three);
				map.put("four", four);
				map.put("five", five);
				map.put("six", six);
				map.put("seven", seven);
				map.put("eight", eight);
				map.put("nine", nine);
				map.put("ten", ten);
				map.put("date", date);
				list.add(map);

			} while (cursor.moveToNext());
		}
		source.close();
		return list;
	}
}
