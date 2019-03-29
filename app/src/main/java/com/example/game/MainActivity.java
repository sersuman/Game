package com.example.game;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnFirst, btnSecond;
    private TextView tvResult, tvWon, tvLoose,tvCounter;
    private int randomFirst, randomSecond;

    public static int counter, win, loose,points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        tvResult = findViewById(R.id.tvResult);
        tvWon = findViewById(R.id.tvWon);
        tvLoose = findViewById(R.id.tvLoose);
        tvCounter = findViewById(R.id.tvCounter);

        counter = 0;
        win = 0;
        loose = 0;
        points = 0;

        randomFirst=(int)(Math.random()*100);
        randomSecond=(int)(Math.random()*100);
        btnFirst.setText(Integer.toString(randomFirst));
        btnSecond.setText(Integer.toString(randomSecond));
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(counter<9){
                    if (randomFirst>randomSecond){
                        counter +=1;
                        win += 1;
                        points += 1;
                        tvCounter.setText("No of attempts:"+Integer.toString(counter));
                    }else{
                        counter +=1;
                        points -=1;
                        loose +=1;
                        tvCounter.setText("No of attempts:"+Integer.toString(counter));
                    }
                    randomFirst=(int)(Math.random()*100);
                    randomSecond=(int)(Math.random()*100);
                    btnFirst.setText(Integer.toString(randomFirst));
                    btnSecond.setText(Integer.toString(randomSecond));
                }else {
                    tvResult.setText("Your Points: " + Integer.toString(points));
                    tvWon.setText("You won " + Integer.toString(win)+ " times.");
                    tvLoose.setText("you loose " + Integer.toString(loose)+" times");
                }

            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(counter<9){
                    if (randomSecond>randomFirst){
                        counter +=1;
                        win += 1;
                        points += 1;
                        tvCounter.setText("No of attempts:"+Integer.toString(counter));
                    }else{
                        counter +=1;
                        points -=1;
                        loose +=1;
                        tvCounter.setText("No of attempts:"+Integer.toString(counter));
                    }
                    randomFirst=(int)(Math.random()*100);
                    randomSecond=(int)(Math.random()*100);
                    btnFirst.setText(Integer.toString(randomFirst));
                    btnSecond.setText(Integer.toString(randomSecond));
                }else {
                    tvResult.setText("Your Points: " + Integer.toString(points));
                    tvWon.setText("You won " + Integer.toString(win)+ " times.");
                    tvLoose.setText("you loose " + Integer.toString(loose)+" times");
                }
            }
        });
    }
}
