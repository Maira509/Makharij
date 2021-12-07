package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("cnt");
        TextView txt = (TextView) findViewById(R.id.textView7);
        txt.setText("Obtained : " + String.valueOf(value));
    }
}