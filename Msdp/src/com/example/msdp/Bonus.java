package com.example.msdp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Bonus extends Activity {
	ImageView positivethink, solvingproblems, innovativethink, yourattitude,
			creativethink;
	Typeface tf;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bonus);
		TextView text = (TextView) findViewById(R.id.actiontext);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		text.setTypeface(tf);
		text.setTextSize(20.0f);
		text.setTextColor(Color.BLACK);
		TextView positive = (TextView) findViewById(R.id.positive_think);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		positive.setTypeface(tf);
		positive.setTextSize(12.0f);
		positive.setTextColor(Color.DKGRAY);
		TextView solving = (TextView) findViewById(R.id.solving_problems);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		solving.setTypeface(tf);
		solving.setTextSize(12.0f);
		solving.setTextColor(Color.DKGRAY);
		TextView innovative = (TextView) findViewById(R.id.innovative_think);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		innovative.setTypeface(tf);
		innovative.setTextSize(12.0f);
		innovative.setTextColor(Color.DKGRAY);
		TextView attitude = (TextView) findViewById(R.id.your_attitude);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		attitude.setTypeface(tf);
		attitude.setTextSize(12.0f);
		attitude.setTextColor(Color.DKGRAY);
		TextView creative = (TextView) findViewById(R.id.creative_think);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		creative.setTypeface(tf);
		creative.setTextSize(12.0f);
		creative.setTextColor(Color.DKGRAY);

		positivethink = (ImageView) findViewById(R.id.positivethink);
		positivethink.setOnClickListener(new OnClickListener() {

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
							.open("The Power of Positive Thinking.pdf");
					CreateFileFromInputStream(pdfFileStream,
							extStorageDirectory + "/pdf/joy.pdf");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				showPdf();
			}

			public void showPdf() {
				File file = new File(Environment.getExternalStorageDirectory()
						+ "/pdf/joy.pdf");
				PackageManager packageManager = getPackageManager();
				Intent testIntent = new Intent(Intent.ACTION_VIEW);
				testIntent.setType("application/pdf");
				List list = packageManager.queryIntentActivities(testIntent,
						PackageManager.MATCH_DEFAULT_ONLY);
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				Uri uri = Uri.fromFile(file);
				intent.setDataAndType(uri, "application/pdf");
				startActivity(intent);

			}

		});
		solvingproblems = (ImageView) findViewById(R.id.solvingproblems);
		solvingproblems.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
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
							.open("The Art of Solving Problems.pdf");
					CreateFileFromInputStream(pdfFileStream,
							extStorageDirectory + "/pdf/joy.pdf");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				showPdf();

			}

			private void showPdf() {
				File file = new File(Environment.getExternalStorageDirectory()
						+ "/pdf/joy.pdf");
				PackageManager packageManager = getPackageManager();
				Intent testIntent = new Intent(Intent.ACTION_VIEW);
				testIntent.setType("application/pdf");
				List list = packageManager.queryIntentActivities(testIntent,
						PackageManager.MATCH_DEFAULT_ONLY);
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				Uri uri = Uri.fromFile(file);
				intent.setDataAndType(uri, "application/pdf");
				startActivity(intent);

			}
		});

		innovativethink = (ImageView) findViewById(R.id.innovativethink);
		innovativethink.setOnClickListener(new OnClickListener() {

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
							.open("Innovative Thinking Secrets Exposed.pdf");
					CreateFileFromInputStream(pdfFileStream,
							extStorageDirectory + "/pdf/joy.pdf");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				showPdf();

			}

			private void showPdf() {
				File file = new File(Environment.getExternalStorageDirectory()
						+ "/pdf/joy.pdf");
				PackageManager packageManager = getPackageManager();
				Intent testIntent = new Intent(Intent.ACTION_VIEW);
				testIntent.setType("application/pdf");
				List list = packageManager.queryIntentActivities(testIntent,
						PackageManager.MATCH_DEFAULT_ONLY);
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				Uri uri = Uri.fromFile(file);
				intent.setDataAndType(uri, "application/pdf");
				startActivity(intent);

			}

		});
		yourattitude = (ImageView) findViewById(R.id.yourattitude);
		yourattitude.setOnClickListener(new OnClickListener() {

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
							.open("How to Make Your Attitude Your Ally.pdf");
					CreateFileFromInputStream(pdfFileStream,
							extStorageDirectory + "/pdf/joy.pdf");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				showPdf();

			}

			private void showPdf() {
				File file = new File(Environment.getExternalStorageDirectory()
						+ "/pdf/joy.pdf");
				PackageManager packageManager = getPackageManager();
				Intent testIntent = new Intent(Intent.ACTION_VIEW);
				testIntent.setType("application/pdf");
				List list = packageManager.queryIntentActivities(testIntent,
						PackageManager.MATCH_DEFAULT_ONLY);
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				Uri uri = Uri.fromFile(file);
				intent.setDataAndType(uri, "application/pdf");
				startActivity(intent);

			}

		});
		creativethink = (ImageView) findViewById(R.id.creativethink);
		creativethink.setOnClickListener(new OnClickListener() {

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
							.open("HowtoAdoptCreativeThinking.pdf");
					CreateFileFromInputStream(pdfFileStream,
							extStorageDirectory + "/pdf/joy.pdf");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				showPdf();

			}

			private void showPdf() {
				File file = new File(Environment.getExternalStorageDirectory()
						+ "/pdf/joy.pdf");
				PackageManager packageManager = getPackageManager();
				Intent testIntent = new Intent(Intent.ACTION_VIEW);
				testIntent.setType("application/pdf");
				List list = packageManager.queryIntentActivities(testIntent,
						PackageManager.MATCH_DEFAULT_ONLY);
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				Uri uri = Uri.fromFile(file);
				intent.setDataAndType(uri, "application/pdf");
				startActivity(intent);

			}

		});
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
