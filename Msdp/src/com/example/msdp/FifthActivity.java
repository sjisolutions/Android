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
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class FifthActivity extends Activity {
	@SuppressWarnings("rawtypes")
	ArrayList list;
	Source source;
	String itemDate;
	@SuppressWarnings("unused")
	private SimpleAdapter adapter;
	TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12,
			tv13, tv14, tv15, tv16, tv17, tvdate, tvday, txt1, txt2, txt3,
			txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13,
			txt14, txt15, txt16, txt17, txtdate, txtday, txtmain, txtmain1,
			txta, txtb, txtc, txtd, txte, txtf, txtg, txth, txti, txtj, txtk,
			txtl, txtm, txtn, txto, txtp, txtq;
	String one, two, three, four, five, six, seven, eight, nine, ten, eleven,
			twelve, thirteen, fourteen, fifteen, sixteen, seventeen, date1,
			day;
	Typeface tf;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.userguide_third);

		TextView goalhistory = (TextView) findViewById(R.id.goalhistory);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		goalhistory.setTypeface(tf);
		goalhistory.setTextSize(20.0f);
		goalhistory.setTextColor(Color.BLACK);
		itemDate = getIntent().getExtras().getString("date");
		Log.d(getLocalClassName(), "Date is ...." + itemDate);

		tv1 = (TextView) findViewById(R.id.txtone1);
		tv2 = (TextView) findViewById(R.id.txttwo1);
		tv3 = (TextView) findViewById(R.id.txtthree1);
		tv4 = (TextView) findViewById(R.id.txtfour1);
		tv5 = (TextView) findViewById(R.id.txtfive1);
		tv6 = (TextView) findViewById(R.id.txtsix1);
		tv7 = (TextView) findViewById(R.id.txtseven1);
		tv8 = (TextView) findViewById(R.id.txteight1);
		tv9 = (TextView) findViewById(R.id.txtnine1);
		tv10 = (TextView) findViewById(R.id.txtten1);
		tv11 = (TextView) findViewById(R.id.txteleven1);
		tv12 = (TextView) findViewById(R.id.txttwelve1);
		tv13 = (TextView) findViewById(R.id.txtthirteen1);
		tv14 = (TextView) findViewById(R.id.txtfourteen1);
		tv15 = (TextView) findViewById(R.id.txtfifteen1);
		tv16 = (TextView) findViewById(R.id.txtsixteen1);
		tv17 = (TextView) findViewById(R.id.txtseventeen1);
		tvdate = (TextView) findViewById(R.id.txtdate1);
		tvday = (TextView) findViewById(R.id.txtday1);
		Log.d(getLocalClassName(), "Day is ...." + tvday);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		tv1.setTypeface(tf);
		tv2.setTypeface(tf);
		tv3.setTypeface(tf);
		tv4.setTypeface(tf);
		tv5.setTypeface(tf);
		tv6.setTypeface(tf);
		tv7.setTypeface(tf);
		tv8.setTypeface(tf);
		tv9.setTypeface(tf);
		tv10.setTypeface(tf);
		tv11.setTypeface(tf);
		tv12.setTypeface(tf);
		tv13.setTypeface(tf);
		tv14.setTypeface(tf);
		tv15.setTypeface(tf);
		tv16.setTypeface(tf);
		tv17.setTypeface(tf);
		tvdate.setTypeface(tf);
		tvday.setTypeface(tf);
		Log.d(getLocalClassName(), "tvday is ...." + tvday);
		txtmain = (TextView) findViewById(R.id.txtmain);
		txtmain1 = (TextView) findViewById(R.id.txtmain1);
		txt1 = (TextView) findViewById(R.id.txtone);
		txt2 = (TextView) findViewById(R.id.txttwo);
		txt3 = (TextView) findViewById(R.id.txtthree);
		txt4 = (TextView) findViewById(R.id.txtfour);
		txt5 = (TextView) findViewById(R.id.txtfive);
		txt6 = (TextView) findViewById(R.id.txtsix);
		txt7 = (TextView) findViewById(R.id.txtseven);
		txt8 = (TextView) findViewById(R.id.txteight);
		txt9 = (TextView) findViewById(R.id.txtnine);
		txt10 = (TextView) findViewById(R.id.txtten);
		txt11 = (TextView) findViewById(R.id.txteleven);
		txt12 = (TextView) findViewById(R.id.txttwelve);
		txt13 = (TextView) findViewById(R.id.txtthirteen);
		txt14 = (TextView) findViewById(R.id.txtfourteen);
		txt15 = (TextView) findViewById(R.id.txtfifteen);
		txt16 = (TextView) findViewById(R.id.txtsixteen);
		txt17 = (TextView) findViewById(R.id.txtseventeen);
		txtdate = (TextView) findViewById(R.id.txtdate);
		txtday = (TextView) findViewById(R.id.txtday);
		txta = (TextView) findViewById(R.id.txt1);
		txtb = (TextView) findViewById(R.id.txt2);
		txtc = (TextView) findViewById(R.id.txt3);
		txtd = (TextView) findViewById(R.id.txt4);
		txte = (TextView) findViewById(R.id.txt5);
		txtf = (TextView) findViewById(R.id.txt6);
		txtg = (TextView) findViewById(R.id.txt7);
		txth = (TextView) findViewById(R.id.txt8);
		txti = (TextView) findViewById(R.id.txt9);
		txtj = (TextView) findViewById(R.id.txt10);
		txtk = (TextView) findViewById(R.id.txt11);
		txtl = (TextView) findViewById(R.id.txt12);
		txtm = (TextView) findViewById(R.id.txt13);
		txtn = (TextView) findViewById(R.id.txt14);
		txto = (TextView) findViewById(R.id.txt15);
		txtp = (TextView) findViewById(R.id.txt16);
		txtq = (TextView) findViewById(R.id.txt17);

		txtmain.setTypeface(tf);
		txtmain1.setTypeface(tf);
		txt1.setTypeface(tf);
		txt2.setTypeface(tf);
		txt3.setTypeface(tf);
		txt4.setTypeface(tf);
		txt5.setTypeface(tf);
		txt6.setTypeface(tf);
		txt7.setTypeface(tf);
		txt8.setTypeface(tf);
		txt9.setTypeface(tf);
		txt10.setTypeface(tf);
		txt11.setTypeface(tf);
		txt12.setTypeface(tf);
		txt13.setTypeface(tf);
		txt14.setTypeface(tf);
		txt15.setTypeface(tf);
		txt16.setTypeface(tf);
		txt17.setTypeface(tf);
		txtdate.setTypeface(tf);
		txtday.setTypeface(tf);
		txta.setTypeface(tf);
		txtb.setTypeface(tf);
		txtc.setTypeface(tf);
		txtd.setTypeface(tf);
		txte.setTypeface(tf);
		txtf.setTypeface(tf);
		txtg.setTypeface(tf);
		txth.setTypeface(tf);
		txti.setTypeface(tf);
		txtj.setTypeface(tf);
		txtk.setTypeface(tf);
		txtl.setTypeface(tf);
		txtm.setTypeface(tf);
		txtn.setTypeface(tf);
		txto.setTypeface(tf);
		txtp.setTypeface(tf);
		txtq.setTypeface(tf);

		Log.d(getLocalClassName(), "txt17 is ......" + txt17);
		source = new Source(this);
		getListDataByDate(itemDate);
		Log.d(getLocalClassName(), "itemDate is ......" + itemDate);
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
				String day = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(2)));
				tvday.setText(day);

				String one = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(3)));
				Log.i("Boolean Value    ", "" + one);
				tv1.setText(one);

				String two = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(4)));
				tv2.setText(two);
				String three = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(5)));
				tv3.setText(three);
				String four = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(6)));
				tv4.setText(four);
				String five = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(7)));
				tv5.setText(five);
				String six = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(8)));
				tv6.setText(six);
				String seven = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(9)));
				tv7.setText(seven);

				String eight = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(10)));
				tv8.setText(eight);
				String nine = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(11)));
				tv9.setText(nine);
				String ten = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(12)));
				tv10.setText(ten);
				String eleven = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(13)));
				tv11.setText(eleven);
				String twelve = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(14)));
				tv12.setText(twelve);
				String thirteen = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(15)));
				tv13.setText(thirteen);
				String fourteen = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(16)));
				tv14.setText(fourteen);
				String fifteen = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(17)));
				tv15.setText(fifteen);
				String sixteen = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(18)));
				tv16.setText(sixteen);
				String seventeen = cursor.getString(cursor
						.getColumnIndex(cursor.getColumnName(19)));
				tv17.setText(seventeen);

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
				map.put("eleven", eleven);
				map.put("twelve", twelve);
				map.put("thirteen", thirteen);
				map.put("fourteen", fourteen);
				map.put("fifteen", fifteen);
				map.put("sixteen", sixteen);
				map.put("seventeen", seventeen);
				map.put("day", day);
				map.put("date", date);

				list.add(map);

			} while (cursor.moveToNext());
		}
		source.close();
		return list;
	}
}
