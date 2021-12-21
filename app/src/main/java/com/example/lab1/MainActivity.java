package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView dateT;
    TextView timeT;
    Button sendM;
    Button getDateB;
    EditText editT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateT = findViewById(R.id.dataTV);
        timeT = findViewById(R.id.timeTV);
        sendM = findViewById(R.id.sendMesBtn);
        getDateB = findViewById(R.id.getDateBtn);
        editT = findViewById(R.id.editT);

        getDateB.setOnClickListener(v -> {
            Date dataClass = new Date();
            DateFormat dateNow = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
            DateFormat timeNow = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
            String date = dateNow.format(dataClass);
            String timeText = timeNow.format(dataClass);
            dateT.setText(date);
            timeT.setText(timeText);
                });

        sendM.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity22.class);
            String message = editT.getText().toString();
            intent.putExtra("mes", message);
            startActivity(intent);
        });


    }


}