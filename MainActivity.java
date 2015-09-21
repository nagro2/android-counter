package com.example.server.counter_01;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    // Private member field to keep track of the count
    private int mCount = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView countTextView = (TextView) findViewById(R.id.TextViewCount);
        final Button countButton = (Button) findViewById(R.id.ButtonCountUp);
        final Button countButton2 = (Button) findViewById(R.id.ButtonCountDown);

        countButton.setOnClickListener(new OnClickListener() {


            public void onClick(View v) {

                mCount++;
                countTextView.setText("Count: " + mCount);


            }
        });

        countButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mCount--;
                countTextView.setText("Count: " + mCount);
            }
        });
    }
}
