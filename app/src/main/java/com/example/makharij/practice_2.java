package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class practice_2 extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String statement , statement2, statement3 ,statement4, statement5, statement6;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice2);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("btn", 0);
        TextView textView, tx2, tx3, tx4, tx5, tx6;
        textView = findViewById(R.id.textView2);
        ImageView img, t2, t3, t4, t5, t6;
        img = (ImageView) findViewById(R.id.img1);

        if(intValue == R.id.button16){
            statement = "أ ہ End of Throat \n" +
                    "ع حMiddle of Throat \n " +
                    "غ خStart of the Throat \n   ";
            textView.setText(statement);
            img.setImageResource(R.drawable.throat1);

        }
        else if(intValue == R.id.button17){
            statement = " Makharij al-Huruf Chart";
            textView.setText(statement);
            textView.setTextSize(20);
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            img.setImageResource(R.drawable.fullhuroof);
        }
        else if(intValue == R.id.button4){
            statement = "م ن While pronouncing the ending sound, bring the vibration to the nose";
            textView.setText(statement);
            img.setImageResource(R.drawable.nose1);
        }
        else if(intValue == R.id.button14){
            statement = "فTip of the two upper jaw teeth touches the inner part of the lower lip\n" +
                    "بInner part of the both lips touch each other\n" +
                    "مOuter part of both lips touch each other\n" +
                    "وRounding both lips and not closing the mouth\n";
            textView.setText(statement);
            img.setImageResource(R.drawable.lip1);
        }
        else if(intValue == R.id.button18){
            statement = " ق\tBase of Tongue which is near Uvula touching the mouth roof\n" +
                    "ک\tPortion of Tongue near its base touching the roof of mouth\n";
            textView.setText(statement);
            img.setImageResource(R.drawable.tongue1);
            statement2 = "ج ش ی \tTongue touching the center of the mouth roof\n" +
                    "ض\tOne side of the tongue touching the molar teeth\n";
            tx2 = findViewById(R.id.txt2);
            tx2.setText(statement2);
            t2 = (ImageView) findViewById(R.id.img2);
            t2.setImageResource(R.drawable.tongue2);
            t2.setVisibility(View.VISIBLE);
            tx2.setVisibility(View.VISIBLE);
            statement3 = "ل\tRounded tip of the tongue touching the base of the frontal 8 teeth\n" +
                    "ن\tRounded tip of the tongue touching the base of the frontal 6 teeth\n" +
                    "ر\tRounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth\n";
            tx3 = findViewById(R.id.txt3);
            tx3.setText(statement3);
            t3 = (ImageView) findViewById(R.id.img3);
            t3.setImageResource(R.drawable.tongue3);
            t3.setVisibility(View.VISIBLE);
            tx3.setVisibility(View.VISIBLE);
            statement4 = "ت د ط\tTip of the tongue touching the base of the front 2 teeth";
            tx4 = findViewById(R.id.txt4);
            tx4.setText(statement4);
            t4 = (ImageView) findViewById(R.id.img4);
            t4.setImageResource(R.drawable.tongue4);
            t4.setVisibility(View.VISIBLE);
            tx4.setVisibility(View.VISIBLE);
            statement5 = "ظ  ذ  ث\tTip of the tongue touching the tip of the frontal 2 teeth";
            tx5 = findViewById(R.id.txt5);
            tx5.setText(statement5);
            t5 = (ImageView) findViewById(R.id.img5);
            t5.setImageResource(R.drawable.tongue5);
            t5.setVisibility(View.VISIBLE);
            tx5.setVisibility(View.VISIBLE);
            statement6 = "ص ز س\tTip of the tongue comes between the front top and bottom teeth";
            tx6 = findViewById(R.id.txt6);
            tx6.setText(statement6);
            t6 = (ImageView) findViewById(R.id.img6);
            t6.setImageResource(R.drawable.tongue6);
            t6.setVisibility(View.VISIBLE);
            tx6.setVisibility(View.VISIBLE);
        }
        else if(intValue == R.id.button15){
            statement = "باَ بوُ بىِ Mouth empty space while speaking words like  باَ بوُ بىِ";
            textView.setText(statement);
            img.setVisibility(View.GONE);
        }

    }
}