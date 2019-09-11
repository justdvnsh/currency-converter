package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        try {
            EditText currency = (EditText) findViewById(R.id.currency);
            int intCurrency = Integer.parseInt(currency.getText().toString());

            intCurrency *= 71.64;

            Toast.makeText(MainActivity.this, "Changed currency - " + intCurrency + " INR.", Toast.LENGTH_LONG).show();

            Log.i("Info", "Currency - " + intCurrency );
        } catch(Exception e) {

            Toast.makeText(MainActivity.this, "Enter a valid integer to change.", Toast.LENGTH_LONG).show();

        }


    }

    public void changeImage(View view) {

        ImageView currencyImg = (ImageView) findViewById(R.id.currencyImg);
        currencyImg.setImageResource(R.drawable.imag2);

        Button imgBtn = (Button) findViewById(R.id.imageBtn);
        imgBtn.setText("Previous Image.");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
