package com.example.jcudd.funapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunAppActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    // Declare our view variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_app);

        //Assign the views from the layout file to the corresponding variables
        factTextView= findViewById(R.id.factTextView);
        showFactButton= findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                //update the screen with our new fact
                factTextView.setText(fact);

            }
        };
        showFactButton.setOnClickListener(listener);

    }
}
