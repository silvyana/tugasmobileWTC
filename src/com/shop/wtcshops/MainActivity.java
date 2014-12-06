package com.shop.wtcshops;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void openAmadeus(View v){
		Intent i = new Intent(getApplicationContext(),AmadeusActivity.class);
		startActivity(i);
	}
    public void openGrowup(View w){
		Intent j = new Intent(getApplicationContext(),GrowupActivity.class);
		startActivity(j);
	}
    public void openMiami(View x){
		Intent k = new Intent(getApplicationContext(),MiamiBeachActivity.class);
		startActivity(k);
	}
}
