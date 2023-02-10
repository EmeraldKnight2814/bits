package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    //Variable to keep track of which buttons have been pressed
    boolean[] buttonsPressed = {false, false, false, false, false, false, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void updateArray(int index){
        buttonsPressed[index] = true;
        String output = "";

        for(int i = 0; i < buttonsPressed.length; i++){
            if(buttonsPressed[i]){
                output += "1";
            }
            else{
                output += "0";
            }
        }
        TextView binary =(TextView)findViewById(R.id.binary);
        TextView decimal =(TextView)findViewById(R.id.decimal);
        int decimal_output = Integer.parseInt(output,2);

        binary.setText(output);
        decimal.setText(decimal_output);
    }

    public void clear(View trigger){
        //reset array
        for(int i = 0; i < buttonsPressed.length; i++){
            buttonsPressed[i] = false;
        }
        //reset text
        TextView binary =(TextView)findViewById(R.id.binary);
        TextView decimal =(TextView)findViewById(R.id.decimal);
        binary.setText("Binary");
        decimal.setText("Decimal");
        //reset buttons
        //insert
    }
}