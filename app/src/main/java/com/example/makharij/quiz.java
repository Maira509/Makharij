package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

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
        index++;
        Button button, button2;
        button = (Button) findViewById(R.id.button5);
        button2 = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                radioButton = (RadioButton) findViewById(R.id.radioButton);
                choice = radioButton.getText().toString();
               if(AnsArr[index] == choice){
                   count++;
                }
               if(index <= 1) {
                    txt1.setText(statementArr[index]);
                    index++;
                }
                if(index > 1){
                    button.setText("Submit");

                }
            }
        });




    }

            }