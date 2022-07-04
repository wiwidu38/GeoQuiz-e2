package com.example.tresenraya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int jugador;
    private TextView round;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jugador = 1;
        setContentView(R.layout.activity_main);
    }


    public void clickButton(View view) {
        Button button = (Button) view;
        round = (TextView) findViewById(R.id.round);
        if((button.getText().toString().equals(""))){
            if(jugador == 1) {
                button.setText("X");
                round.setText("Jugador 2");
                jugador = 2;
            }else {
                button.setText("O");
                round.setText("Jugador 1");
                jugador = 1;
            }
            button.setClickable(false);
        }else{
            Toast.makeText(getApplicationContext(), "You can't select this area !", Toast.LENGTH_SHORT).show();
        }

    }
}