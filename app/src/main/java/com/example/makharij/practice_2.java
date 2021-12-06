package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class practice_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String statement = "End of Throat";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice2);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("btn", 0);
        TextView textView;
        textView = findViewById(R.id.textView2);
        ImageView img;
        img = (ImageView) findViewById(R.id.img1);

        if(intValue == R.id.button16){
            textView.setText(statement);
            img.setImageResource(R.drawable.throat1);
        }
        else if(intValue == R.id.button17){
            textView.setText(statement);
            img.setImageResource(R.drawable.fullhuroof);
        }

    }
}