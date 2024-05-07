package com.ninda.prakm5;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        this.setNewTab(this, tabHost, "tab1", "TAB-1", R.drawable.ic_launcher_background, new Intent(this, Tab1.class));
        this.setNewTab(this, tabHost, "tab2", "TAB-2", R.drawable.ic_launcher_background, new Intent(this, Tab2.class));
        this.setNewTab(this, tabHost, "tab3", "TAB-3", R.drawable.ic_launcher_background, new Intent(this, Tab3.class));
    }

    private void setNewTab(Context context, TabHost tabHost, String tag, String title, int icon, Intent intentid){
        TabHost.TabSpec tabSpec = tabHost.newTabSpec(tag);
        tabSpec.setIndicator(title, context.getResources().getDrawable(icon));
        tabSpec.setContent(intentid);
        tabHost.addTab(tabSpec);
    }
}