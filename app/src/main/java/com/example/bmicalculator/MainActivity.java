package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight_text,height_fit,height_in;
    Button btn;
    TextView ans;
    LinearLayout llMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight_text=findViewById(R.id.txt1);
        height_fit=findViewById(R.id.txt2);
        height_in=findViewById(R.id.tx3);
        btn=findViewById(R.id.button1);
        ans=findViewById(R.id.res);
        llMain=findViewById(R.id.llmain);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int weight=Integer.parseInt(weight_text.getText().toString());
                int h_fit=Integer.parseInt(height_fit.getText().toString());
                int h_inch=Integer.parseInt(height_in.getText().toString());

                int convert_fit_to_inch=h_fit*12;
                int total_inch=convert_fit_to_inch+h_inch;
                double inch_to_cen=total_inch*2.54;

                double cm_to_meter=inch_to_cen/100;

                double BMI=weight/(cm_to_meter*cm_to_meter);

                if(BMI<18.5){
                    ans.setText("Oh No, You are Underweight..");
                    llMain.setBackgroundColor(getResources().getColor(R.color.yellow));
                }
                else if(BMI>=18.5 && BMI<=24.9){
                    ans.setText("Hey Congrats, You are Healthy weight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.purple_500));

                }
                else if(BMI>=25 && BMI<=29.9){
                    ans.setText("Oh No,You are Overweight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.teal_700));
                }
                else{
                    ans.setText("Obesity or You are Not adult");
                    llMain.setBackgroundColor(getResources().getColor(R.color.purple_200));

                }

            }
        });




    }
}