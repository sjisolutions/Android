package com.example.msdp;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UserGuideSecondActivity extends Activity implements
		OnItemSelectedListener {
	EditText edtone, edttwo, edtthree, edtfour, edtfive, edtsix, edtseven,
			edteight, edtnine, edtten, edtdate, edtdate1, edteleven;
	Button btnsave;
	SourceActivity source;
	TextView txtfour, txtmain, txtmain1, txtone, txttwo, txtthree, txtfive,
			txtsix, txtseven, txteight, txtnine, txtten, txteleven, txttwelve,
			txtthirteen, txtfourteen, txtfifteen, txtsixteen, txtseventeen,
			txtday, txtdate, txtdate1, txt1, txt2, txt3, txt4, txt5, txt6,
			txt7, txt8, txt9;
	Typeface tf;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.userguide_second_activity);
		TextView progress = (TextView) findViewById(R.id.progress);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		progress.setTypeface(tf);
		progress.setTextSize(20.0f);
		progress.setTextColor(Color.BLACK);
		edtdate = (EditText) findViewById(R.id.edtdate);
		edtone = (EditText) findViewById(R.id.edtone);
		edttwo = (EditText) findViewById(R.id.edttwo);
		edtthree = (EditText) findViewById(R.id.edtthree);
		edtfour = (EditText) findViewById(R.id.edtfour);
		edtfive = (EditText) findViewById(R.id.edtfive);
		edtsix = (EditText) findViewById(R.id.edtsix);
		edtseven = (EditText) findViewById(R.id.edtseven);
		edteight = (EditText) findViewById(R.id.edteight);
		edtnine = (EditText) findViewById(R.id.edtnine);
		edtten = (EditText) findViewById(R.id.edtten);
		edtdate1 = (EditText) findViewById(R.id.edtdate1);
		edteleven = (EditText) findViewById(R.id.edteleven);
		btnsave = (Button) findViewById(R.id.btnsave);
		source = new SourceActivity(this);

		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		txtdate = (TextView) findViewById(R.id.txtdate);
		txtfour = (TextView) findViewById(R.id.txtfour);

		txtone = (TextView) findViewById(R.id.txtone);
		txttwo = (TextView) findViewById(R.id.txttwo);
		txtthree = (TextView) findViewById(R.id.txtthree);
		txtfive = (TextView) findViewById(R.id.txtfive);
		txtsix = (TextView) findViewById(R.id.txtsix);
		txtseven = (TextView) findViewById(R.id.txtseven);
		txteight = (TextView) findViewById(R.id.txteight);
		txtnine = (TextView) findViewById(R.id.txtnine);
		txtten = (TextView) findViewById(R.id.txtten);
		txteleven = (TextView) findViewById(R.id.txteleven);
		txttwelve = (TextView) findViewById(R.id.txttwelve);
		txtdate1 = (TextView) findViewById(R.id.txtdate1);

		txt1 = (TextView) findViewById(R.id.txt1);
		txt2 = (TextView) findViewById(R.id.txt2);
		txt3 = (TextView) findViewById(R.id.txt3);
		txt4 = (TextView) findViewById(R.id.txt4);
		txt5 = (TextView) findViewById(R.id.txt5);
		txt6 = (TextView) findViewById(R.id.txt6);
		txt7 = (TextView) findViewById(R.id.txt7);
		txt8 = (TextView) findViewById(R.id.txt8);
		txt9 = (TextView) findViewById(R.id.txt9);

		txtone.setTypeface(tf);
		txttwo.setTypeface(tf);
		txtthree.setTypeface(tf);
		txtfour.setTypeface(tf);
		txtfive.setTypeface(tf);
		txtsix.setTypeface(tf);
		txtseven.setTypeface(tf);
		txteight.setTypeface(tf);
		txtnine.setTypeface(tf);
		txtten.setTypeface(tf);
		txteleven.setTypeface(tf);
		txttwelve.setTypeface(tf);
		txtdate.setTypeface(tf);
		txtdate1.setTypeface(tf);
		txt1.setTypeface(tf);
		txt2.setTypeface(tf);
		txt3.setTypeface(tf);
		txt4.setTypeface(tf);
		txt5.setTypeface(tf);
		txt6.setTypeface(tf);
		txt7.setTypeface(tf);
		txt8.setTypeface(tf);
		txt9.setTypeface(tf);
		btnsave.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				source.open();
				source.insertValues(edtdate.getText().toString(), edtone
						.getText().toString(), edttwo.getText().toString(),
						edtthree.getText().toString(), edtfour.getText()
								.toString(), edtfive.getText().toString(),
						edtsix.getText().toString(), edtseven.getText()
								.toString(), edteight.getText().toString(),
						edtnine.getText().toString(), edtten.getText()
								.toString(), edtdate1.getText().toString(),
						edteleven.getText().toString());
				source.close();
				Toast.makeText(getApplicationContext(), "answers saved",
						Toast.LENGTH_LONG).show();
				edtone.setText("");
				edttwo.setText("");
				edtthree.setText("");
				edtfour.setText("");
				edtfive.setText("");
				edtsix.setText("");
				edtseven.setText("");
				edteight.setText("");
				edtnine.setText("");
				edtten.setText("");
				edtdate.setText("");
				edteleven.setText("");
				edtdate1.setText("");

			}
		});

	}

	public void onItemSelected(AdapterView<?> adpterview, View v, int position,
			long l) {
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}
