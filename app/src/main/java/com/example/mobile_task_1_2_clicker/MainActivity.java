package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button AdditionBtn;
    Button SubtractionBtn;
    Button ResetBtn;

    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        AdditionBtn = (Button) findViewById(R.id.AdditionBtn);
        SubtractionBtn = (Button) findViewById(R.id.SubtractionBtn);
        ResetBtn = (Button) findViewById(R.id.ResetBtn);


        View.OnClickListener AddListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                String s;
                if (score % 10 > 1 && score % 10 < 5 && (score % 100 > 14 || score % 100 < 12)) {
                    s = "Кнопка нажата " + score + " раза";
                } else {
                    s = "Кнопка нажата " + score + " раз";
                }
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        View.OnClickListener ReduceListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                String s;
                if (score % 10 > 1 && score % 10 < 5 && (score % 100 > 14 || score % 100 < 12)) {
                    s = "Кнопка нажата " + score + " раза";
                } else {
                    s = "Кнопка нажата " + score + " раз";
                }
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        View.OnClickListener ZeroListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = "Кнопка нажата " + score + " раз";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        AdditionBtn.setOnClickListener(AddListener);
        SubtractionBtn.setOnClickListener(ReduceListener);
        ResetBtn.setOnClickListener(ZeroListener);

    }
}

