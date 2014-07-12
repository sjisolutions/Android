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

public class Self extends Activity {
	ImageView self, entrep, rich, brainwave, affirm, financial;
	Typeface tf;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.self);
		TextView spec = (TextView) findViewById(R.id.special);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		spec.setTypeface(tf);
		spec.setTextSize(20.0f);
		spec.setTextColor(Color.BLACK);
		TextView entre = (TextView) findViewById(R.id.entrep_reneur);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		entre.setTypeface(tf);
		entre.setTextSize(12.0f);
		entre.setTextColor(Color.DKGRAY);
		TextView develop = (TextView) findViewById(R.id.self_develop);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		develop.setTypeface(tf);
		develop.setTextSize(12.0f);
		develop.setTextColor(Color.DKGRAY);
		TextView secrets = (TextView) findViewById(R.id.rich_secrets);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		secrets.setTypeface(tf);
		secrets.setTextSize(12.0f);
		secrets.setTextColor(Color.DKGRAY);
		TextView financialiq = (TextView) findViewById(R.id.develop_financial);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		financialiq.setTypeface(tf);
		financialiq.setTextSize(12.0f);
		financialiq.setTextColor(Color.DKGRAY);
		TextView wave = (TextView) findViewById(R.id.brain_wave);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		wave.setTypeface(tf);
		wave.setTextSize(12.0f);
		wave.setTextColor(Color.DKGRAY);
		TextView aff = (TextView) findViewById(R.id.affirm_ations);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		aff.setTypeface(tf);
		aff.setTextSize(12.0f);
		aff.setTextColor(Color.DKGRAY);
		entrep = (ImageView) findViewById(R.id.entrep);
		entrep.setOnClickListener(new OnClickListener() {

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
							.open("The E-Entrepreneur Success Mindset with legal notice.pdf");
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
		self = (ImageView) findViewById(R.id.self);
		self.setOnClickListener(new OnClickListener() {

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
							.open("Self Development Report.pdf");
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
		rich = (ImageView) findViewById(R.id.rich);
		rich.setOnClickListener(new OnClickListener() {

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
							.open("Rich Secrets.pdf");
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
		financial = (ImageView) findViewById(R.id.financial);
		financial.setOnClickListener(new OnClickListener() {

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
							.open("Develop Your Financial IQ.pdf");
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
		brainwave = (ImageView) findViewById(R.id.brainwave);
		brainwave.setOnClickListener(new OnClickListener() {

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
							.open("Brainwave Entrainment Report.pdf");
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
		affirm = (ImageView) findViewById(R.id.affirm);
		affirm.setOnClickListener(new OnClickListener() {

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
							.open("Affirmations.pdf");
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
