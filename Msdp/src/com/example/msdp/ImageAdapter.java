package com.example.msdp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
	Context context;
	String[] text;
	int[] images;
	LayoutInflater inflater;

	public ImageAdapter(VideoActivity mainActivity, String[] text, int[] images) {
		this.context = mainActivity;
		this.text = text;
		this.images = images;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public int getCount() {

		return text.length;
	}

	@Override
	public Object getItem(int arg0) {

		return null;
	}

	@Override
	public long getItemId(int arg0) {

		return 0;
	}

	public static class ViewHolder {
		ImageView image;
		TextView textView;
	}

	@Override
	public View getView(int arg0, View convertView, ViewGroup arg2) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.adapter_list, null);
			holder.image = (ImageView) convertView.findViewById(R.id.imageview);
			holder.textView = (TextView) convertView
					.findViewById(R.id.textview);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.image.setBackgroundResource(images[arg0]);
		holder.textView.setText(text[arg0]);
		Typeface tf = Typeface.createFromAsset(context.getAssets(),
				"Fonts/BRLNSDB.TTF");
		holder.textView.setTypeface(tf);
		holder.textView.setTextSize(15.0f);
		holder.textView.setTextColor(Color.DKGRAY);
		return convertView;
	}

}
