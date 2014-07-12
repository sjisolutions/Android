package com.example.msdp;

import android.annotation.SuppressLint;
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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class UserGuideSecond extends Activity implements OnItemSelectedListener {

	@SuppressLint("CutPasteId")
	EditText edtone, edttwo, edtthree, edtfour, edtfive, edtsix, edtseven,
			edteight, edtnine, edtten, edteleven, edttwelve, edtthirteen,
			edtfourteen, edtfifteen, edtsixteen, edtseventeen, edtdate, edtday;
	Button btnsave, btnview;
	TextView txtfour, txtmain, txtmain1, txtone, txttwo, txtthree, txtfive,
			txtsix, txtseven, txteight, txtnine, txtten, txteleven, txttwelve,
			txtthirteen, txtfourteen, txtfifteen, txtsixteen, txtseventeen,
			txtday, txtdate, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8,
			txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt17;
	Spinner spinner;
	String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
			"Friday", "Saturday" };
	Source source;
	Typeface tf;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.userguide_second);
		TextView goal = (TextView) findViewById(R.id.goal);
		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		goal.setTypeface(tf);
		goal.setTextSize(20.0f);
		goal.setTextColor(Color.BLACK);
		edtdate = (EditText) findViewById(R.id.edtdate);
		spinner = (Spinner) findViewById(R.id.edtday);

		ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, days);
		spinner.setAdapter(adp);
		spinner.setOnItemSelectedListener(this);
		txtfour = (TextView) findViewById(R.id.txtfour);
		txtmain = (TextView) findViewById(R.id.txtmain);
		txtmain1 = (TextView) findViewById(R.id.txtmain1);
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
		txtthirteen = (TextView) findViewById(R.id.txtthirteen);
		txtfourteen = (TextView) findViewById(R.id.txtfourteen);
		txtfifteen = (TextView) findViewById(R.id.txtfifteen);
		txtsixteen = (TextView) findViewById(R.id.txtsixteen);
		txtseventeen = (TextView) findViewById(R.id.txtseventeen);
		txtdate = (TextView) findViewById(R.id.txtdate);
		txtday = (TextView) findViewById(R.id.txtday);
		txt1 = (TextView) findViewById(R.id.txt1);
		txt2 = (TextView) findViewById(R.id.txt2);
		txt3 = (TextView) findViewById(R.id.txt3);
		txt4 = (TextView) findViewById(R.id.txt4);
		txt5 = (TextView) findViewById(R.id.txt5);
		txt6 = (TextView) findViewById(R.id.txt6);
		txt7 = (TextView) findViewById(R.id.txt7);
		txt8 = (TextView) findViewById(R.id.txt8);
		txt9 = (TextView) findViewById(R.id.txt9);
		txt10 = (TextView) findViewById(R.id.txt10);
		txt11 = (TextView) findViewById(R.id.txt11);
		txt12 = (TextView) findViewById(R.id.txt12);
		txt13 = (TextView) findViewById(R.id.txt13);
		txt14 = (TextView) findViewById(R.id.txt14);
		txt15 = (TextView) findViewById(R.id.txt15);
		txt16 = (TextView) findViewById(R.id.txt16);
		txt17 = (TextView) findViewById(R.id.txt17);

		tf = Typeface.createFromAsset(getAssets(), "Fonts/BRLNSDB.TTF");
		txtfour.setTypeface(tf);
		txtmain.setTypeface(tf);
		txtmain1.setTypeface(tf);
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
		txtthirteen.setTypeface(tf);
		txtfourteen.setTypeface(tf);
		txtfifteen.setTypeface(tf);
		txtsixteen.setTypeface(tf);
		txtday.setTypeface(tf);
		txtdate.setTypeface(tf);
		txtseventeen.setTypeface(tf);
		txt1.setTypeface(tf);
		txt2.setTypeface(tf);
		txt3.setTypeface(tf);
		txt4.setTypeface(tf);
		txt5.setTypeface(tf);
		txt6.setTypeface(tf);
		txt7.setTypeface(tf);
		txt8.setTypeface(tf);
		txt9.setTypeface(tf);
		txt10.setTypeface(tf);
		txt11.setTypeface(tf);
		txt12.setTypeface(tf);
		txt13.setTypeface(tf);
		txt14.setTypeface(tf);
		txt15.setTypeface(tf);
		txt16.setTypeface(tf);
		txt17.setTypeface(tf);
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
		edteleven = (EditText) findViewById(R.id.edteleven);
		edttwelve = (EditText) findViewById(R.id.edttwelve);
		edtthirteen = (EditText) findViewById(R.id.edttwelve);
		edtthirteen = (EditText) findViewById(R.id.edtthirteen);
		edtfourteen = (EditText) findViewById(R.id.edtfourteen);
		edtfifteen = (EditText) findViewById(R.id.edtfifteen);
		edtsixteen = (EditText) findViewById(R.id.edtsixteen);
		edtseventeen = (EditText) findViewById(R.id.edtsevnteen);
		btnsave = (Button) findViewById(R.id.btnsave);
		source = new Source(this);
		btnsave.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				source.open();
				source.insertValues(edtdate.getText().toString(), spinner
						.getSelectedItem().toString(), edtone.getText()
						.toString(), edttwo.getText().toString(), edtthree
						.getText().toString(), edtfour.getText().toString(),
						edtfive.getText().toString(), edtsix.getText()
								.toString(), edtseven.getText().toString(),
						edteight.getText().toString(), edtnine.getText()
								.toString(), edtten.getText().toString(),
						edteleven.getText().toString(), edttwelve.getText()
								.toString(), edtthirteen.getText().toString(),
						edtfourteen.getText().toString(), edtfifteen.getText()
								.toString(), edtsixteen.getText().toString(),
						edtseventeen.getText().toString());
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
				edteleven.setText("");
				edttwelve.setText("");
				edtthirteen.setText("");
				edtfourteen.setText("");
				edtfifteen.setText("");
				edtsixteen.setText("");
				edtseventeen.setText("");
				edtdate.setText("");

			}
		});

	}

	public void onItemSelected(AdapterView<?> adpterview, View v, int position,
			long l) {
		// TODO Auto-generated method stub
		String val = adpterview.getAdapter().getItem(position).toString();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}
