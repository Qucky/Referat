package edu.hm.cs.mobile.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class TestActivity extends Activity {

    private Button incrementButton;
    private TextView testValueTextView;

    private int testValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        testValueTextView = (TextView) findViewById(R.id.testValueTextView);
        testValueTextView.setText(String.valueOf(testValue));

        incrementButton = (Button)findViewById(R.id.incrementButton);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementTestValue();
            }
        });


    }

    private void incrementTestValue() {
        testValueTextView.setText(String.valueOf(++testValue));
        Toast.makeText(TestActivity.this, String.format("Momentaner Wert: %s", testValue), Toast.LENGTH_SHORT).show();
    }

    public int getTestValue() {
        return testValue;
    }

}
