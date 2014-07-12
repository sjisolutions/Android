package com.example.msdp;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class UserGuideThird extends Activity {
	ListView listview;
	@SuppressWarnings("rawtypes")
	ArrayList list;
	Source source;
	private SimpleAdapter adapter;
	String date;
	Typeface tf;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.sqllistview);
		TextView goalhistory = (TextView) findViewById(R.id.goalhistory1);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		goalhistory.setTypeface(tf);
		goalhistory.setTextSize(20.0f);
		goalhistory.setTextColor(Color.BLACK);

		listview = (ListView) findViewById(R.id.listanswer);
		source = new Source(this);
		refreshListView();
		listview.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> adp, View v, int pos, long l) {

				TextView tv = (TextView) v.findViewById(R.id.txtanswer);
				date = tv.getText().toString();
				Log.i("ThirdActivity>>>>", "Date is  >>" + date);
				Intent in = new Intent(UserGuideThird.this, FifthActivity.class);
				Bundle bundle = new Bundle();
				bundle.putString("date", date);
				in.putExtras(bundle);
				startActivity(in);

			}
		});

	}

	private void refreshListView() {

		list = getListData();
		adapter = new SimpleAdapter(this, list, R.layout.resource,
				new String[] { "date" }, new int[] { R.id.txtanswer });

		listview.setAdapter(adapter);
		// listview.setCacheColorHint(Color.parseColor("#00000000"));

		adapter.notifyDataSetChanged();
	}

	private ArrayList<HashMap<String, String>> getListData() {

		source.open();
		Cursor cursor = source.getAllValues();
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		boolean recexist = cursor.moveToFirst();

		if (recexist) {
			do {

				String date = cursor.getString(cursor.getColumnIndex(cursor
						.getColumnName(0)));
				HashMap<String, String> map = new HashMap<String, String>();
				map.put("date", date);
				list.add(map);

			} while (cursor.moveToNext());
		}
		source.close();
		return list;
	}

}
