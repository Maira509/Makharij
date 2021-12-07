package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class quiz extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;
    public String choice;
    public  int count=0;
    public    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        String[] statementArr = {"Rounded tip of the tongue touching the base of the frontal 6 teeth. It's for ن", "Tongue touching the center of the mouth roof. It's for ض"};
        String[] AnsArr={"True","False"};
        TextView txt1 = (TextView) findViewById(R.id.textView5);

        txt1.setText(statementArr[index]);

        Button button, button2;
        button = (Button) findViewById(R.id.button5);
        button2 = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               if(AnsArr[index] == "True"){
                   count++;
                }
                index++;
               if(index <= 1) {

                    txt1.setText(statementArr[index]);

                }
               else
               {
                   Intent intent = new Intent(quiz.this, Score.class);
                intent.putExtra("cnt", count);
                   startActivity(intent);
               }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(AnsArr[index] == "False"){
                    count++;
                }
                index++;
                if(index <= 1) {
                    txt1.setText(statementArr[index]);

                }
                else
                {
                    Intent intent = new Intent(quiz.this, Score.class);
                    intent.putExtra("cnt", count);
                    startActivity(intent);
                }
            }
        });



    }

            }