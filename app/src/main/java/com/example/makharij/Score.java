package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Button button1, button2;
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Score.this, Activity2.class);
                    startActivity(intent);
                }

        });
        button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.setPackage("com.whatsapp");
                    intent.putExtra(Intent.EXTRA_TEXT, "My name is Maira Malik."+"\n"+"My Quiz Score is : "+value+"/10");
                    startActivity(intent);

                }


        });
    }

}