package com.frednm.jokesdisplaylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "joke";
    public static final String DEFAULT_JOKE = "Create yours !";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.activity_title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView displayTv = (TextView) findViewById(R.id.display_text_view);

        if (getIntent().hasExtra(EXTRA_JOKE)) {// Oblige to do that because there is no default String to pass if there is no extra string received
            String jokeToDisplay = getIntent().getStringExtra(EXTRA_JOKE);
            displayTv.setText(jokeToDisplay);
        }
    }

    // When the arrow is pressed, close the activity in order to "navigate" back
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
