package com.example.furg.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EquipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipe);
        TextView VoltarMain = (TextView) findViewById(R.id.tVVoltarMain);
        VoltarMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarMain = new Intent(EquipeActivity.this, MainActivity.class);
                startActivity(voltarMain);
            }
        });
    }
}
