package com.example.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by mayanktripathi on 15/01/17.
 */

public class JokeActivity extends AppCompatActivity {

    TextView jokeText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity);

        jokeText = (TextView)findViewById(R.id.joketext);


        Intent intent = getIntent();
        String jokes = intent.getStringExtra("jokes");


        jokeText.setText(jokes);

    }
}
