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
        decimal.setText(Integer.toString(decimal_output));
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
        Button ichi = (Button) findViewById(R.id.button_1);
        ichi.setEnabled(true);
        Button ni = (Button) findViewById(R.id.button_2);
        ni.setEnabled(true);
        Button yon = (Button) findViewById(R.id.button_4);
        yon.setEnabled(true);
        Button hachi = (Button) findViewById(R.id.button_8);
        hachi.setEnabled(true);
        Button jyuuroku = (Button) findViewById(R.id.button_16);
        jyuuroku.setEnabled(true);
        Button sanjyuuni = (Button) findViewById(R.id.button_32);
        sanjyuuni.setEnabled(true);
        Button rokujyuushi = (Button) findViewById(R.id.button_64);
        rokujyuushi.setEnabled(true);
        Button hyakunijyuuhachi = (Button) findViewById(R.id.button_128);
        hyakunijyuuhachi.setEnabled(true);
    }

    public void pressed_1(View trigger){
        buttonsPressed[0] = true;
        Button ichi = (Button) findViewById(R.id.button_1);
        ichi.setEnabled(false);
        updateArray(0);
    }

    public void pressed_2(View trigger){
        buttonsPressed[1] = true;
        Button ni = (Button) findViewById(R.id.button_2);
        ni.setEnabled(false);
        updateArray(1);
    }

    public void pressed_4(View trigger){
        buttonsPressed[2] = true;
        Button yon = (Button) findViewById(R.id.button_4);
        yon.setEnabled(false);
        updateArray(2);
    }

    public void pressed_8(View trigger){
        buttonsPressed[3] = true;
        Button hachi = (Button) findViewById(R.id.button_8);
        hachi.setEnabled(false);
        updateArray(3);
    }

    public void pressed_16(View trigger){
        buttonsPressed[4] = true;
        Button jyuuroku = (Button) findViewById(R.id.button_16);
        jyuuroku.setEnabled(false);
        updateArray(4);
    }

    public void pressed_32(View trigger){
        buttonsPressed[5] = true;
        Button sanjyuuni = (Button) findViewById(R.id.button_32);
        sanjyuuni.setEnabled(false);
        updateArray(5);
    }

    public void pressed_64(View trigger){
        buttonsPressed[6] = true;
        Button rokujyuushi = (Button) findViewById(R.id.button_64);
        rokujyuushi.setEnabled(false);
        updateArray(6);
    }

    public void pressed_128(View trigger){
        buttonsPressed[7] = true;
        Button hyakunijyuuhachi = (Button) findViewById(R.id.button_128);
        hyakunijyuuhachi.setEnabled(false);
        updateArray(7);
    }
}