package com.example.msdp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class VideoActivity extends Activity implements OnItemClickListener {

	ListView listview;
	int position;
	public static String[] text = { "Financial Freedom", "Goal",
			"Habits and Subconscious", "Health and Wellness", "Relationship",
			"Self Discovery", "Spiritual" };
	public static int[] images = { R.drawable.v1, R.drawable.v2, R.drawable.v3,
			R.drawable.v4, R.drawable.v5, R.drawable.v6, R.drawable.v7 };

	ImageAdapter adapter;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.video_list);
		TextView video = (TextView) findViewById(R.id.video);
		Typeface tf = Typeface
				.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		video.setTypeface(tf);
		video.setTextSize(20.0f);
		video.setTextColor(Color.BLACK);
		listview = (ListView) findViewById(R.id.listview);
		adapter = new ImageAdapter(VideoActivity.this, text, images);
		listview.setAdapter((ListAdapter) adapter);
		listview.setOnItemClickListener(this);

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View parent, int position,
			long id) {

		if (position == 0) {

			Intent in = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.youtube.com/watch?v=7_neJ6yKySA"));

			startActivity(in);

		}
		if (position == 1) {

			Intent in = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.youtube.com/watch?v=t5P2DfiWQX4"));

			startActivity(in);

		}
		if (position == 2) {

			Intent in = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.youtube.com/watch?v=u7rzVHXzNJs"));

			startActivity(in);

		}
		if (position == 3) {

			Intent in = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.youtube.com/watch?v=HMZ2izPHBck"));
			startActivity(in);

		}
		if (position == 4) {

			Intent in = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.youtube.com/watch?v=zoPwbPTqVDA"));
			startActivity(in);

		}
		if (position == 5) {

			Intent in = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.youtube.com/watch?v=n1zUkmYNbn0"));
			startActivity(in);

		}
		if (position == 6) {
			Intent in = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.youtube.com/watch?v=9hZlqz7VFMM"));
			startActivity(in);

		}

	}
}
