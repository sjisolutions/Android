package com.example.msdp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Articles extends Activity implements
		android.widget.RadioGroup.OnCheckedChangeListener {
	// Button reports, self;

	private File[] imagelist;
	String[] pdflist;
	int position;
	RelativeLayout layout1, layout2;
	// LinearLayout layout2;
	RadioButton bonus, self;
	RadioGroup rg;
	Typeface tf;

	@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.articlemain);

		AssetManager assetManager = getAssets();
		TextView action = (TextView) findViewById(R.id.actiontext);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		action.setTypeface(tf);
		action.setTextSize(20.0f);
		action.setTextColor(Color.BLACK);
		RadioButton rb = (RadioButton) findViewById(R.id.bonus);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		rb.setTypeface(tf);
		rb.setTextSize(15.0f);
		rb.setTextColor(Color.DKGRAY);
		RadioButton self = (RadioButton) findViewById(R.id.self);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		self.setTypeface(tf);
		self.setTextSize(15.0f);
		self.setTextColor(Color.DKGRAY);
		rg = (RadioGroup) findViewById(R.id.radioGroup1);
		rg.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		if (checkedId == R.id.bonus) {
			Intent in = new Intent(Articles.this, Bonus.class);
			startActivity(in);
		}
		if (checkedId == R.id.self) {
			Intent in = new Intent(Articles.this, Self.class);
			startActivity(in);
		}

	}

}
