package com.example.msdp;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	/** Called when the activity is first created. */
	Button icon1;
	static TabHost tabHost;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_host);
		setTab();
	}

	public void setTab() {
		addTab("Books", R.drawable.book, PdfReaderActivity.class);
		//addTab("Articles", R.drawable.article, ArticlesActivity.class);
		addTab("Bonus Reports", R.drawable.article, Articles.class);
		addTab("Audio", R.drawable.audio, AudioActivity.class);
		addTab("Video", R.drawable.video, VideoActivity.class);
		addTab("UserGuide", R.drawable.userguide, UserGuideActivity.class);

	}

	private void addTab(String labelId, int drawableId, Class<?> c) {
		tabHost = getTabHost();
		Intent intent = new Intent(this, c);
		TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);
		View tabIndicator = LayoutInflater.from(this).inflate(
				R.layout.tab_indicator, getTabWidget(), false);
		TextView text = (TextView) tabIndicator.findViewById(R.id.title);

		Typeface tf = Typeface
				.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		text.setTypeface(tf);
		text.setText(labelId);
		ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
		icon.setImageResource(drawableId);
		spec.setIndicator(tabIndicator);
		spec.setContent(intent);

		tabHost.addTab(spec);

	}

}
