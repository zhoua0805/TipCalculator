package com.example.a14396.alicezu3a1q3;

//import all the necessary class modules
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.AliceZU3A1Q3.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the 15% button */
    @SuppressLint("SetTextI18n")
    public void Action1(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();    //retrieve value from the user input
        final TextView textView = findViewById(R.id.textView3);
        final Double x = Double.parseDouble(message);    //convert the string value to double
        Double t = 1.15 *x;
        textView.setText(Double.toString(t) + "$");      //print out the final price (original + 15% tip)
    }

    /** Called when the user taps the 20% button */
    @SuppressLint("SetTextI18n")
    public void Action2(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();    //retrieve value from the user input
        final TextView textView = findViewById(R.id.textView3);
        final Double x = Double.parseDouble(message);    //convert the string value to double
        textView.setText(Double.toString(1.20*x) + "$");      //print out the final price (original + 20% tip)
    }

    /** Called when the user taps the 25% button */
    @SuppressLint("SetTextI18n")
    public void Action3(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();    //retrieve value from the user input
        final TextView textView = findViewById(R.id.textView3);
        final Double x = Double.parseDouble(message);    //convert the string value to double
        textView.setText(Double.toString(1.25*x) + "$");      //print out the final price (original + 25% tip)
    }

    /** Called when the user taps the enter button */
    @SuppressLint("SetTextI18n")
    public void Action4(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();    //retrieve the original price value from the user input

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String message2 = editText2.getText().toString();    //retrieve the custom tip value from the user input
        final TextView textView = findViewById(R.id.textView3);
        final Double x = Double.parseDouble(message);    //convert the string value to double
        final Double y = Double.parseDouble(message2);    //convert the string value to double
        textView.setText(" " +Double.toString((1 + 0.01* y) *x) + "$");      //print out the final price (original + custom tip)
    }
}
