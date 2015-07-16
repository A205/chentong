package com.example.gemptc.bmidemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {
    private EditText height = null;
    private EditText weight = null;
    private Button button = null;
    private TextView show = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.BMIbutton);

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        show=(TextView) findViewById(R.id.show);

        button.setOnClickListener(new View.OnClickListener() {
            double bmi = 0;

            public void onClick(View v) {

                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                bmi = w / (h * h);

                double final_resault = exchangeResault(bmi);
                if (bmi < 18.5) {
                    show.setText("体重过轻，建议合理饮食不要有意节食");
                } else if (bmi >= 18.5 && bmi < 24) {
                    show.setText("体重正常，请保持");
                } else if (bmi >= 24 &&bmi < 27) {
                    show.setText("体重稍重，建议合理饮食注意远动");
                } else if (bmi >= 27 && bmi < 30) {
                    show.setText("轻度肥胖，建议合理饮食多远动");
                } else if (bmi >= 30&& bmi < 35) {
                    show.setText("中度肥胖，建议制定饮食和远动计划");
                } else if (bmi > 35) {
                    show.setText("重度肥胖，建议制定减肥计划，生命在于远动。");
                }
            }
        });
    }

    public double exchangeResault(double resault){
        double first =resault*100;
        double second = (int) first;
        double second_first = first-second;

        if(second_first>0.5){
            second++;
        }

        double jirguo = (double)second/100;
        return jirguo;
    }
}
