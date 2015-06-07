package com.dsvoronin.udacityportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout buttonsLayout = (LinearLayout) findViewById(R.id.buttons_layout);

        List<App> apps = new ArrayList<>();
        apps.add(new App("SPOTIFY STREAMER", new ToastAction(this, "This button will launch my spotify streamer app!")));
        apps.add(new App("SCORES APP", new ToastAction(this, "This button will launch my scores app!")));
        apps.add(new App("LIBRARY APP", new ToastAction(this, "This button will launch my library app!")));
        apps.add(new App("BUILD IT BIGGER", new ToastAction(this, "This button will launch my build it bigger app!")));
        apps.add(new App("XYZ READER", new ToastAction(this, "This button will launch my xyz reader app!")));
        apps.add(new App("CAPSTONE: MY OWN APP", new ToastAction(this, "This button will launch my capstone app!")));

        AppButtonsFactory factory = new AppButtonsFactory(this);

        for (App app : apps) {
            buttonsLayout.addView(factory.make(app));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
