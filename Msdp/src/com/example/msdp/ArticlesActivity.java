package com.example.msdp;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ArticlesActivity extends Activity {
	ImageView ic_one, ic_two, ic_three, ic_four, ic_five;
	Button offlineBtn, onlineBtn;
	LinearLayout layout2;
	RelativeLayout layout1;
	ImageView ic_special1, ic_special2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.article);

		AssetManager assetManager = getAssets();
		layout2 = (LinearLayout) findViewById(R.id.layout2);
		layout1 = (RelativeLayout) findViewById(R.id.layout1);

		offlineBtn = (Button) findViewById(R.id.offline_button);

		onlineBtn = (Button) findViewById(R.id.online_button);
		onlineBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				@SuppressWarnings("unused")
				int onlineFlag = 0;

				onlineBtn
						.setBackgroundResource(R.drawable.segment_button_left_on);
				offlineBtn
						.setBackgroundResource(R.drawable.segment_button_right);
				layout1.setVisibility(View.VISIBLE);
				layout2.setVisibility(View.GONE);

			}
		});

		offlineBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				@SuppressWarnings("unused")
				int onlineFlag = 1;
				onlineBtn.setBackgroundResource(R.drawable.segment_button_left);
				offlineBtn
						.setBackgroundResource(R.drawable.segment_button_right_on);
				layout1.setVisibility(View.GONE);
				layout2.setVisibility(View.VISIBLE);

			}
		});

		/*
		 * ic_one = (ImageView) findViewById(R.id.imageView1);
		 * ic_one.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { String extStorageDirectory =
		 * Environment .getExternalStorageDirectory().toString(); File folder =
		 * new File(extStorageDirectory, "pdf"); folder.mkdir(); File file = new
		 * File(folder, "joy.pdf"); try { file.createNewFile(); } catch
		 * (IOException e1) { e1.printStackTrace(); } AssetManager assetManager
		 * = getAssets();
		 * 
		 * try { InputStream pdfFileStream = assetManager
		 * .open("The Power of Positive Thinking.pdf");
		 * CreateFileFromInputStream(pdfFileStream, extStorageDirectory +
		 * "/pdf/joy.pdf"); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } showPdf();
		 * 
		 * }
		 * 
		 * public void showPdf() { File file = new
		 * File(Environment.getExternalStorageDirectory() + "/pdf/joy.pdf");
		 * PackageManager packageManager = getPackageManager(); Intent
		 * testIntent = new Intent(Intent.ACTION_VIEW);
		 * testIntent.setType("application/pdf"); List list =
		 * packageManager.queryIntentActivities(testIntent,
		 * PackageManager.MATCH_DEFAULT_ONLY); Intent intent = new Intent();
		 * intent.setAction(Intent.ACTION_VIEW); Uri uri = Uri.fromFile(file);
		 * intent.setDataAndType(uri, "application/pdf"); startActivity(intent);
		 * 
		 * } });
		 * 
		 * ic_two = (ImageView) findViewById(R.id.imageView2);
		 * 
		 * ic_two.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { String extStorageDirectory =
		 * Environment .getExternalStorageDirectory().toString(); File folder =
		 * new File(extStorageDirectory, "pdf"); folder.mkdir(); File file = new
		 * File(folder, "joy.pdf"); try { file.createNewFile(); } catch
		 * (IOException e1) { e1.printStackTrace(); } AssetManager assetManager
		 * = getAssets();
		 * 
		 * try { InputStream pdfFileStream = assetManager
		 * .open("The Art of Solving Problems.pdf");
		 * CreateFileFromInputStream(pdfFileStream, extStorageDirectory +
		 * "/pdf/joy.pdf"); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } showPdf();
		 * 
		 * }
		 * 
		 * private void showPdf() { File file = new
		 * File(Environment.getExternalStorageDirectory() + "/pdf/joy.pdf");
		 * PackageManager packageManager = getPackageManager(); Intent
		 * testIntent = new Intent(Intent.ACTION_VIEW);
		 * testIntent.setType("application/pdf"); List list =
		 * packageManager.queryIntentActivities(testIntent,
		 * PackageManager.MATCH_DEFAULT_ONLY); Intent intent = new Intent();
		 * intent.setAction(Intent.ACTION_VIEW); Uri uri = Uri.fromFile(file);
		 * intent.setDataAndType(uri, "application/pdf"); startActivity(intent);
		 * 
		 * } });
		 * 
		 * ic_three = (ImageView) findViewById(R.id.imageView3);
		 * ic_three.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { String extStorageDirectory =
		 * Environment .getExternalStorageDirectory().toString(); File folder =
		 * new File(extStorageDirectory, "pdf"); folder.mkdir(); File file = new
		 * File(folder, "joy.pdf"); try { file.createNewFile(); } catch
		 * (IOException e1) { e1.printStackTrace(); } AssetManager assetManager
		 * = getAssets();
		 * 
		 * try { InputStream pdfFileStream = assetManager
		 * .open("Innovative Thinking Secrets Exposed.pdf");
		 * CreateFileFromInputStream(pdfFileStream, extStorageDirectory +
		 * "/pdf/joy.pdf"); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } showPdf();
		 * 
		 * }
		 * 
		 * private void showPdf() { File file = new
		 * File(Environment.getExternalStorageDirectory() + "/pdf/joy.pdf");
		 * PackageManager packageManager = getPackageManager(); Intent
		 * testIntent = new Intent(Intent.ACTION_VIEW);
		 * testIntent.setType("application/pdf"); List list =
		 * packageManager.queryIntentActivities(testIntent,
		 * PackageManager.MATCH_DEFAULT_ONLY); Intent intent = new Intent();
		 * intent.setAction(Intent.ACTION_VIEW); Uri uri = Uri.fromFile(file);
		 * intent.setDataAndType(uri, "application/pdf"); startActivity(intent);
		 * 
		 * } }); ic_four = (ImageView) findViewById(R.id.imageView4);
		 * ic_four.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { String extStorageDirectory =
		 * Environment .getExternalStorageDirectory().toString(); File folder =
		 * new File(extStorageDirectory, "pdf"); folder.mkdir(); File file = new
		 * File(folder, "joy.pdf"); try { file.createNewFile(); } catch
		 * (IOException e1) { e1.printStackTrace(); } AssetManager assetManager
		 * = getAssets();
		 * 
		 * try { InputStream pdfFileStream = assetManager
		 * .open("How to Make Your Attitude Your Ally.pdf");
		 * CreateFileFromInputStream(pdfFileStream, extStorageDirectory +
		 * "/pdf/joy.pdf"); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } showPdf();
		 * 
		 * }
		 * 
		 * private void showPdf() { File file = new
		 * File(Environment.getExternalStorageDirectory() + "/pdf/joy.pdf");
		 * PackageManager packageManager = getPackageManager(); Intent
		 * testIntent = new Intent(Intent.ACTION_VIEW);
		 * testIntent.setType("application/pdf"); List list =
		 * packageManager.queryIntentActivities(testIntent,
		 * PackageManager.MATCH_DEFAULT_ONLY); Intent intent = new Intent();
		 * intent.setAction(Intent.ACTION_VIEW); Uri uri = Uri.fromFile(file);
		 * intent.setDataAndType(uri, "application/pdf"); startActivity(intent);
		 * 
		 * } }); /*ic_five = (ImageView) findViewById(R.id.imageView5);
		 * ic_five.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { String extStorageDirectory =
		 * Environment .getExternalStorageDirectory().toString(); File folder =
		 * new File(extStorageDirectory, "pdf"); folder.mkdir(); File file = new
		 * File(folder, "joy.pdf"); try { file.createNewFile(); } catch
		 * (IOException e1) { e1.printStackTrace(); } AssetManager assetManager
		 * = getAssets();
		 * 
		 * try { InputStream pdfFileStream = assetManager
		 * .open("HowtoAdoptCreativeThinking.pdf");
		 * CreateFileFromInputStream(pdfFileStream, extStorageDirectory +
		 * "/pdf/joy.pdf"); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } showPdf();
		 * 
		 * }
		 * 
		 * private void showPdf() { File file = new
		 * File(Environment.getExternalStorageDirectory() + "/pdf/joy.pdf");
		 * PackageManager packageManager = getPackageManager(); Intent
		 * testIntent = new Intent(Intent.ACTION_VIEW);
		 * testIntent.setType("application/pdf"); List list =
		 * packageManager.queryIntentActivities(testIntent,
		 * PackageManager.MATCH_DEFAULT_ONLY); Intent intent = new Intent();
		 * intent.setAction(Intent.ACTION_VIEW); Uri uri = Uri.fromFile(file);
		 * intent.setDataAndType(uri, "application/pdf"); startActivity(intent);
		 * 
		 * } });
		 */
		/*
		 * ic_special1 = (ImageView) findViewById(R.id.imageView7);
		 * ic_special1.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { String extStorageDirectory =
		 * Environment .getExternalStorageDirectory().toString(); File folder =
		 * new File(extStorageDirectory, "pdf"); folder.mkdir(); File file = new
		 * File(folder, "joy.pdf"); try { file.createNewFile(); } catch
		 * (IOException e1) { e1.printStackTrace(); } AssetManager assetManager
		 * = getAssets();
		 * 
		 * try { InputStream pdfFileStream = assetManager
		 * .open("The E-Entrepreneur Success Mindset with legal notice.pdf");
		 * CreateFileFromInputStream(pdfFileStream, extStorageDirectory +
		 * "/pdf/joy.pdf"); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } showPdf();
		 * 
		 * }
		 */

		/*
		 * private void showPdf() { File file = new
		 * File(Environment.getExternalStorageDirectory() + "/pdf/joy.pdf");
		 * PackageManager packageManager = getPackageManager(); Intent
		 * testIntent = new Intent(Intent.ACTION_VIEW);
		 * testIntent.setType("application/pdf"); List list =
		 * packageManager.queryIntentActivities(testIntent,
		 * PackageManager.MATCH_DEFAULT_ONLY); Intent intent = new Intent();
		 * intent.setAction(Intent.ACTION_VIEW); Uri uri = Uri.fromFile(file);
		 * intent.setDataAndType(uri, "application/pdf"); startActivity(intent);
		 * 
		 * } });
		 */
		/*
		 * ic_special2 = (ImageView) findViewById(R.id.imageView8);
		 * ic_special2.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { String extStorageDirectory =
		 * Environment .getExternalStorageDirectory().toString(); File folder =
		 * new File(extStorageDirectory, "pdf"); folder.mkdir(); File file = new
		 * File(folder, "joy.pdf"); try { file.createNewFile(); } catch
		 * (IOException e1) { e1.printStackTrace(); } AssetManager assetManager
		 * = getAssets();
		 * 
		 * try { InputStream pdfFileStream = assetManager
		 * .open("Self Development Report.pdf");
		 * CreateFileFromInputStream(pdfFileStream, extStorageDirectory +
		 * "/pdf/joy.pdf"); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } showPdf();
		 * 
		 * }
		 */

		/*
		 * private void showPdf() { File file = new
		 * File(Environment.getExternalStorageDirectory() + "/pdf/joy.pdf");
		 * PackageManager packageManager = getPackageManager(); Intent
		 * testIntent = new Intent(Intent.ACTION_VIEW);
		 * testIntent.setType("application/pdf"); List list =
		 * packageManager.queryIntentActivities(testIntent,
		 * PackageManager.MATCH_DEFAULT_ONLY); Intent intent = new Intent();
		 * intent.setAction(Intent.ACTION_VIEW); Uri uri = Uri.fromFile(file);
		 * intent.setDataAndType(uri, "application/pdf"); startActivity(intent);
		 * 
		 * } });
		 */

	}

	/*
	 * public void CreateFileFromInputStream(InputStream inStream, String path)
	 * throws IOException { // write the inputStream to a FileOutputStream
	 * OutputStream out = new FileOutputStream(new File(path));
	 * 
	 * int read = 0; byte[] bytes = new byte[1024];
	 * 
	 * while ((read = inStream.read(bytes)) != -1) { out.write(bytes, 0, read);
	 * }
	 * 
	 * inStream.close(); out.flush(); out.close();
	 * 
	 * }
	 */

}
