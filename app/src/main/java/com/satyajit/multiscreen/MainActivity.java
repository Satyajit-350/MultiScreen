package com.satyajit.multiscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    // I don't want to change the string so, I took public static final.
    public static final String MSG = "com.satyajit.multiscreen.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View view){
        // action will be taken after clicking place order button
        /* Intent(intension) ---> It is an object which binds different components during runtime */
        //so we will make an intent to open another activity
        Intent intent  = new Intent(this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName);
        EditText editText2 = findViewById(R.id.editTextTextPersonName2);
        EditText editText3= findViewById(R.id.editTextTextPersonName3);

            String message = "Order for " + editText1.getText().toString() + " , " + editText2.getText().toString() + " & " + editText3.getText().toString() + " has been successfully placed!!!";
            if(editText1.getText().toString().length() == 0 || editText2.getText().toString().length() == 0 || editText3.getText().toString().length() == 0){
                Toast.makeText(this, "Please select items...", Toast.LENGTH_SHORT).show();
            }else {
                intent.putExtra(MSG, message);
                startActivity(intent);
            }

    }
}