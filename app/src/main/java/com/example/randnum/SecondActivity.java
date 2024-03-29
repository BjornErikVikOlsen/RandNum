package com.example.randnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();

    }


    private void showRandomNumber(){
        TextView randomView = (TextView) findViewById(R.id.textView_random);

        TextView headingView = (TextView) findViewById(R.id.textView_label);

        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        Random random = new Random();
        int randomInt = 0;
        if(count > 0){
            randomInt = random.nextInt(count);
        }

        randomView.setText(Integer.toString(randomInt));

        headingView.setText(getString(R.string.random_heading, count));
    }
}
