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

public class UserGuideThirdActivity extends Activity {
	ListView listview;
	ArrayList list;
	SourceActivity source;
	private SimpleAdapter adapter;
	String date1;
	Typeface tf;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.sqllistview1);
		TextView progresshistory = (TextView) findViewById(R.id.progresshistory1);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		progresshistory.setTypeface(tf);
		progresshistory.setTextSize(20.0f);
		progresshistory.setTextColor(Color.BLACK);
		listview = (ListView) findViewById(R.id.listanswer);
		source = new SourceActivity(this);
		refreshListView();
		listview.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> adp1, View v1, int pos,
					long l) {

				TextView tv1 = (TextView) v1.findViewById(R.id.txtanswer1);
				date1 = tv1.getText().toString();
				Log.i("ThirdActivity>>>>", "Date is  >>" + date1);
				Intent in = new Intent(UserGuideThirdActivity.this,
						FifthActivity1.class);
				Bundle bundle = new Bundle();
				bundle.putString("date", date1);
				in.putExtras(bundle);
				startActivity(in);

			}
		});

	}

	private void refreshListView() {

		list = getListData();
		adapter = new SimpleAdapter(this, list, R.layout.resource1,
				new String[] { "date" }, new int[] { R.id.txtanswer1 });

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
