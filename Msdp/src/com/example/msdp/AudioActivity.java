package com.example.msdp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AudioActivity extends Activity {

	Button bt1, bt2, bt3;
	ListView list1, list2, list3;
	ImageView img;
	TextView tv;

	String[] names = { "In The Zone", "Peaceful Balance" };
	String[] health = { "Confidence", "Creativity", "Health" };

	int[] images = { R.drawable.m6, R.drawable.m5 };

	int[] images1 = { R.drawable.confidence, R.drawable.creativity,
			R.drawable.health };
	int[] images2 = { R.drawable.m2, R.drawable.m3, R.drawable.m4,
			R.drawable.m1 };
	String[] power = { "High Power", "Potential", "Still Mind", "Healing" };
	Typeface tf;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		if (Build.VERSION.SDK_INT >= 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		setContentView(R.layout.audiolist);
		TextView audio = (TextView) findViewById(R.id.audio);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		audio.setTypeface(tf);
		audio.setTextSize(20.0f);
		audio.setTextColor(Color.BLACK);
		TextView brainwave = (TextView) findViewById(R.id.brainwave);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		brainwave.setTypeface(tf);
		brainwave.setTextSize(19.0f);
		brainwave.setTextColor(Color.DKGRAY);
		TextView hypnosis = (TextView) findViewById(R.id.hypnosis);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		hypnosis.setTypeface(tf);
		hypnosis.setTextSize(19.0f);
		hypnosis.setTextColor(Color.DKGRAY);
		TextView meditate = (TextView) findViewById(R.id.meditate);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		meditate.setTypeface(tf);
		meditate.setTextSize(19.0f);
		meditate.setTextColor(Color.DKGRAY);

		list1 = (ListView) findViewById(R.id.listview1);
		list2 = (ListView) findViewById(R.id.listview2);
		list3 = (ListView) findViewById(R.id.listview3);

		list1.setOnItemClickListener(new OnItemClickListener() {
			int position;

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Bundle bundle = new Bundle();
				bundle.putInt("position", position);
				// intent = new Intent(Intent.ACTION_VIEW);
				Log.i("POSITION", "" + position);
				if (position == 0) {

					Intent in = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=giEeEvZq73Y"));
					startActivity(in);

				}

				if (position == 1) {

					Intent in1 = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=KiH_fUyFiBE"));

					startActivity(in1);

				}

			}

		});
		list2.setOnItemClickListener(new OnItemClickListener() {
			int position;

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				if (position == 0) {

					Intent in = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=mH1RygFW-qs"));
					startActivity(in);
				}
				if (position == 1) {

					Intent in = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=DnQ7mAkWDTY"));
					startActivity(in);
				}
				if (position == 2) {

					Intent in = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=irb4Qu80gNo"));
					startActivity(in);
				}
			}
		});

		list3.setOnItemClickListener(new OnItemClickListener() {
			int position;

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				if (position == 0) {

					Intent in = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=b1HzLVvNjZc"));
					startActivity(in);
				}
				if (position == 1) {

					Intent in = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=sElzSsZnEBw"));
					startActivity(in);
				}
				if (position == 2) {

					Intent in = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=u7b6YzZMKHU"));
					startActivity(in);
				}
				if (position == 3) {

					Intent in = new Intent(
							Intent.ACTION_VIEW,
							Uri.parse("http://www.youtube.com/watch?v=q8e0OA7iyik"));
					startActivity(in);
				}
			}
		});
		list2.setAdapter(new MyArrayAdapter(getApplicationContext()));

		list2.setCacheColorHint(Color.parseColor("#00000000"));
		list1.setAdapter(new ArrayAdapter(getApplicationContext()));

		list3.setAdapter(new listArrayAdapter(getApplicationContext()));

	}

	class MyArrayAdapter extends BaseAdapter {
		Context context;

		public MyArrayAdapter(Context c) {
			context = c;
		}

		@Override
		public int getCount() {

			return images1.length;
		}

		@Override
		public Object getItem(int position) {

			return position;
		}

		@Override
		public long getItemId(int position) {

			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
			View v = inflater.inflate(R.layout.arrayadapter_list, null);

			img = (ImageView) v.findViewById(R.id.image);
			img.setBackgroundResource(images1[position]);
			tv = (TextView) v.findViewById(R.id.textview);
			tv.setText(health[position]);
			tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
			tv.setTypeface(tf);
			tv.setTextSize(15.0f);
			tv.setTextColor(Color.DKGRAY);
			return v;
		}

	}

	class ArrayAdapter extends BaseAdapter {

		Context context;

		public ArrayAdapter(Context c) {
			context = c;
		}

		@Override
		public int getCount() {

			return images.length;
		}

		@Override
		public Object getItem(int position) {

			return position;
		}

		@Override
		public long getItemId(int position) {

			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
			View v = inflater.inflate(R.layout.arrayadapter_list, null);

			img = (ImageView) v.findViewById(R.id.image);
			img.setBackgroundResource(images[position]);
			tv = (TextView) v.findViewById(R.id.textview);
			tv.setText(names[position]);
			tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
			tv.setTypeface(tf);
			tv.setTextSize(15.0f);
			tv.setTextColor(Color.DKGRAY);
			return v;
		}

	}

	class listArrayAdapter extends BaseAdapter {
		Context context;

		public listArrayAdapter(Context c) {
			context = c;
		}

		@Override
		public int getCount() {

			return images2.length;
		}

		@Override
		public Object getItem(int position) {

			return position;
		}

		@Override
		public long getItemId(int position) {

			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
			View v = inflater.inflate(R.layout.arrayadapter_list, null);

			img = (ImageView) v.findViewById(R.id.image);
			img.setBackgroundResource(images2[position]);
			tv = (TextView) v.findViewById(R.id.textview);
			tv.setText(power[position]);
			tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
			tv.setTypeface(tf);
			tv.setTextSize(15.0f);
			tv.setTextColor(Color.DKGRAY);
			return v;
		}
	}

}
