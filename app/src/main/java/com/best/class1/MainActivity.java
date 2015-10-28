package com.best.class1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    //views
    private TextView display;
    private EditText input;
    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //init layout
        setContentView(R.layout.activity_main);

        //init views
        display = (TextView) findViewById(R.id.textDisplay);
        input = (EditText) findViewById(R.id.input);
        showButton = (Button) findViewById(R.id.showText);

        //eventListeners
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick");

                display.setText(input.getText());
                input.setText("");

            }
        });

        showButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.i(TAG, "onLongClick");

                //remove displayed text
                display.setText("");
                input.setText("");

                return true;
            }
        });
    }
}
