package com.sji.callrecorder;

import android.app.TabActivity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;


public class CallRecorder
    extends TabActivity
{
    private static final int MENU_UPDATE = Menu.FIRST;
    private static final int MENU_PREFERENCES = Menu.FIRST+1;

    private static final int SHOW_PREFERENCES = 1;

    private static final String[] TABS = { "Preferences", "CallLog" };
    
    int[] i={R.drawable.preferences,R.drawable.calllog};

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        setDefaultTab(0);

        TabHost tabs = getTabHost();

        for (int i=0; i<TABS.length; i++) {
            TabHost.TabSpec tab = tabs.newTabSpec(TABS[i]);
            ComponentName n = new ComponentName("com.sji.callrecorder", "com.sji.callrecorder." + TABS[i]);
            tab.setContent(new Intent().setComponent(n));
            //tab.setIndicator(TABS[i]);
            
            if(i==0)
            {
            tab.setIndicator("Preferences", getResources().getDrawable(R.drawable.pref99));
            }
            if(i==1)
            {
            tab.setIndicator("CallLog", getResources().getDrawable(R.drawable.call99));
            }

            tabs.addTab(tab);
        }
    }

    public static class MyTabIndicator extends LinearLayout
    {
        public MyTabIndicator(Context context, String label)
        {
            super(context);
            
            View tab = LayoutInflater.from(context).inflate(R.layout.tab_indicator, this);

            TextView tv = (TextView)tab.findViewById(R.id.tab_label);
            tv.setText(label);
        }
    }
}
