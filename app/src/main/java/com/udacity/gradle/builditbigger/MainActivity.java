package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.frednm.jokesdisplaylibrary.DisplayJokesActivity;
import com.udacity.gradle.builditbigger.utils.EndpointsAsyncTask;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    // step 3 of Project instructions
    public void tellJoke(View view) {
        new EndpointsAsyncTask(new EndpointsAsyncTask.Listener() {
            @Override
            public void onTaskComplete(String result) {
                Intent intent = new Intent(MainActivity.this, DisplayJokesActivity.class);
                intent.putExtra(DisplayJokesActivity.EXTRA_JOKE, result);
                startActivity(intent);
            }
        }).execute();
    }

}
