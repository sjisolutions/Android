package com.example.msdp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

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
import android.widget.TextView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class PdfReaderActivity extends Activity {
	ImageView man, acres, howtouseyourmind, joyandpower, personalmagnetism,
			masterkey, pathtoprosperity, concentration, thinkandgrowrich,
			withinyouthepower;
	Typeface tf;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pdf);
		TextView book = (TextView) findViewById(R.id.book);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		book.setTypeface(tf);
		book.setTextSize(20.0f);
		book.setTextColor(Color.BLACK);
		TextView manthinketh = (TextView) findViewById(R.id.manthinketh);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		manthinketh.setTypeface(tf);
		manthinketh.setTextSize(12.0f);
		manthinketh.setTextColor(Color.DKGRAY);
		TextView diamonds = (TextView) findViewById(R.id.acres_diamonds);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		diamonds.setTypeface(tf);
		diamonds.setTextSize(12.0f);
		diamonds.setTextColor(Color.DKGRAY);
		TextView mind = (TextView) findViewById(R.id.howtouse_yourmind);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		mind.setTypeface(tf);
		mind.setTextSize(12.0f);
		mind.setTextColor(Color.DKGRAY);
		TextView power = (TextView) findViewById(R.id.joy_power);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		power.setTypeface(tf);
		power.setTextSize(12.0f);
		power.setTextColor(Color.DKGRAY);
		TextView magnet = (TextView) findViewById(R.id.personal_magnetism);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		magnet.setTypeface(tf);
		magnet.setTextSize(12.0f);
		magnet.setTextColor(Color.DKGRAY);
		TextView master = (TextView) findViewById(R.id.master_key);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		master.setTypeface(tf);
		master.setTextSize(12.0f);
		master.setTextColor(Color.DKGRAY);
		TextView path = (TextView) findViewById(R.id.pathto_prosperity);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		path.setTypeface(tf);
		path.setTextSize(12.0f);
		path.setTextColor(Color.DKGRAY);
		TextView concent = (TextView) findViewById(R.id.power_concentration);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		concent.setTypeface(tf);
		concent.setTextSize(12.0f);
		concent.setTextColor(Color.DKGRAY);
		TextView think = (TextView) findViewById(R.id.thinkand_growrich);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		think.setTypeface(tf);
		think.setTextSize(12.0f);
		think.setTextColor(Color.DKGRAY);
		TextView you = (TextView) findViewById(R.id.withinyou_thepower);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		you.setTypeface(tf);
		you.setTextSize(12.0f);
		you.setTextColor(Color.DKGRAY);

		man = (ImageView) findViewById(R.id.man);
		man.setOnClickListener(new OnClickListener() {

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
							.open("As A ManThinketh.pdf");
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
		acres = (ImageView) findViewById(R.id.acres);
		acres.setOnClickListener(new OnClickListener() {

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
							.open("Acres of Diamonds.pdf");
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
		howtouseyourmind = (ImageView) findViewById(R.id.howtouseyourmind);
		howtouseyourmind.setOnClickListener(new OnClickListener() {

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
							.open("How To Use Your Mind.pdf");
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
		joyandpower = (ImageView) findViewById(R.id.joyandpower);
		joyandpower.setOnClickListener(new OnClickListener() {

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
							.open("Joy and Power.pdf");
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
		personalmagnetism = (ImageView) findViewById(R.id.personalmagnetism);
		personalmagnetism.setOnClickListener(new OnClickListener() {

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
							.open("The Art And Science Of Personal Magnetism.pdf");
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
		masterkey = (ImageView) findViewById(R.id.masterkey);
		masterkey.setOnClickListener(new OnClickListener() {

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
							.open("The Master Key System.pdf");
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
		pathtoprosperity = (ImageView) findViewById(R.id.pathtoprosperity);
		pathtoprosperity.setOnClickListener(new OnClickListener() {

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
							.open("The Path to Prosperity.pdf");
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
		concentration = (ImageView) findViewById(R.id.concentration);
		concentration.setOnClickListener(new OnClickListener() {

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
							.open("The Power of Concentration.pdf");
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
		thinkandgrowrich = (ImageView) findViewById(R.id.thinkandgrowrich);
		thinkandgrowrich.setOnClickListener(new OnClickListener() {

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
							.open("Think And Grow Rich.pdf");
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
		withinyouthepower = (ImageView) findViewById(R.id.withinyouthepower);
		withinyouthepower.setOnClickListener(new OnClickListener() {

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
							.open("Within You is the Power.pdf");
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
