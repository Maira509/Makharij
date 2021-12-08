package com.example.makharij;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
         Button button1, button2,button3,button4,button5,button6;
         button1 = (Button) findViewById(R.id.button16);
         button2 = (Button) findViewById(R.id.button4);
         button3 = (Button) findViewById(R.id.button15);
         button4 = (Button) findViewById(R.id.button14);
         button5 = (Button) findViewById(R.id.button18);
         button6 = (Button) findViewById(R.id.button17);

         ActionBar actionBar = getSupportActionBar();
         actionBar.setTitle("Back");
         actionBar.setDisplayHomeAsUpEnabled(true);
         actionBar.setDisplayShowHomeEnabled(true);


         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                openPractice(button1);

             }
         });
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openPractice(button2);

             }
         });
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openPractice(button3);

             }
         });
         button4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openPractice(button4);

             }
         });
         button5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openPractice(button5);

             }
         });
         button6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openPractice(button6);

             }
         });
    }
     public void openPractice(Button buttonx){
         Intent intent = new Intent(Activity3.this, practice_2.class);
         intent.putExtra("btn", buttonx.getId());
         startActivity(intent);
     }

     @Override
    public boolean onSupportNavigateUp(){
         onBackPressed();
         return  true;
     }
}

