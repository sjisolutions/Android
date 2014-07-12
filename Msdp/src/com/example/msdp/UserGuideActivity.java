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
import android.os.StrictMode;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class UserGuideActivity extends Activity {
	Button btngoalsetting, btnprogresschart, btngoalhistory, btnprogesshistory,
			btnquickstart;

	@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		if (Build.VERSION.SDK_INT >= 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);

			setContentView(R.layout.userguide);
			TextView user = (TextView) findViewById(R.id.user);
			Typeface tf = Typeface.createFromAsset(getAssets(),
					"Fonts/BRLNSDB.TTF");
			user.setTypeface(tf);
			user.setTextSize(20.0f);
			user.setTextColor(Color.BLACK);
			btngoalsetting = (Button) findViewById(R.id.btngoalsetting);
			btngoalhistory = (Button) findViewById(R.id.btngoalsettinghistory);
			btnprogesshistory = (Button) findViewById(R.id.btnprogresscharthistory);
			btnprogresschart = (Button) findViewById(R.id.btnprogresschart);
			btnquickstart = (Button) findViewById(R.id.btnquickstart);
			btngoalsetting.setOnClickListener(new OnClickListener() {

				public void onClick(View v) {

					Intent intent = new Intent(UserGuideActivity.this,
							UserGuideSecond.class);
					Bundle bundle = new Bundle();
					bundle.putInt("image", 0);
					intent.putExtras(bundle);
					startActivityForResult(intent, 0);

				}
			});

			btnprogresschart.setOnClickListener(new OnClickListener() {
				public void onClick(View arg0) {
					Intent in = new Intent(UserGuideActivity.this,
							UserGuideSecondActivity.class);
					Bundle bundle = new Bundle();
					bundle.putInt("image", 0);
					in.putExtras(bundle);
					startActivity(in);

				}
			});
			btngoalhistory.setOnClickListener(new OnClickListener() {

				public void onClick(View arg0) {
					Intent in = new Intent(UserGuideActivity.this,
							UserGuideThird.class);
					startActivity(in);
				}
			});

			btnprogesshistory.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub

					Intent in = new Intent(UserGuideActivity.this,
							UserGuideThirdActivity.class);
					startActivity(in);

				}
			});

			btnquickstart.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					String extStorageDirectory = Environment
							.getExternalStorageDirectory().toString();
					File folder = new File(extStorageDirectory, "pdf");
					folder.mkdir();
					File file = new File(folder, "joy.pdf");
					try {
						file.createNewFile();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					AssetManager assetManager = getAssets();

					try {
						InputStream pdfFileStream = assetManager
								.open("Quick Start.pdf");
						CreateFileFromInputStream(pdfFileStream,
								extStorageDirectory + "/pdf/joy.pdf");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					showPdf();
				}

				public void showPdf() {
					File file = new File(Environment
							.getExternalStorageDirectory() + "/pdf/joy.pdf");
					PackageManager packageManager = getPackageManager();
					Intent testIntent = new Intent(Intent.ACTION_VIEW);
					testIntent.setType("application/pdf");
					List list = packageManager.queryIntentActivities(
							testIntent, PackageManager.MATCH_DEFAULT_ONLY);
					Intent intent = new Intent();
					intent.setAction(Intent.ACTION_VIEW);
					Uri uri = Uri.fromFile(file);
					intent.setDataAndType(uri, "application/pdf");
					startActivity(intent);

				}

			});

		}

	}

	public void CreateFileFromInputStream(InputStream inStream, String path)
			throws IOException {
		// write the inputStream to a FileOutputStream
		OutputStream out = new FileOutputStream(new File(path));

		int read = 0;
		byte[] bytes = new byte[1024];

		while ((read = inStream.read(bytes)) != -1) {
			out.write(bytes, 0, read);
		}

		inStream.close();
		out.flush();
		out.close();

	}
}
